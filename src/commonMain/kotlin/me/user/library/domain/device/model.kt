@file:JsExport
package me.user.library.domain.device

import com.badoo.reaktive.single.Single
import kotlinx.serialization.Serializable
import me.user.library.network.Fetcher
import kotlin.js.JsExport

@Serializable
data class Account(val login: String, val password: String)

class DeviceREST(private val fetcher: Fetcher) {
    fun authorize(uuid: String): Single<Account> {
        return fetcher.get("device/authorize?uuid=$uuid&appVersion=6.7.26-2-g2267c979&stbType=&deviceType=WEB&demo=0&useSameSite=true&lang=en")
    }
}
