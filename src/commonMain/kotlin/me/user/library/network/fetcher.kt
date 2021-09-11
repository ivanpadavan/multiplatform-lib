package me.user.library.network

import com.badoo.reaktive.coroutinesinterop.singleFromCoroutine
import com.badoo.reaktive.single.Single
import io.ktor.client.*
import io.ktor.client.features.cookies.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import me.user.library.Config
import me.user.library.Platform

class Fetcher(private val config: Config, private val platform: Platform) {
    private val httpClient = HttpClient {
        install(JsonFeature) {
            serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                ignoreUnknownKeys = true
                coerceInputValues = true
            })
        }
        install(HttpCookies) {
            storage = AcceptAllCookiesStorage()
        }
    }

    internal inline fun <reified T> get(url: String): Single<T> {
        return singleFromCoroutine {
            httpClient.get<Response<T>>(config.baseUrl + url).result
        }
    }

    internal inline fun <reified T> getList(url: String): Single<Array<T>> {
        return singleFromCoroutine {
            httpClient.get<Response<ListResponse<T>>>(config.baseUrl + url).result.list
        }
    }
}
