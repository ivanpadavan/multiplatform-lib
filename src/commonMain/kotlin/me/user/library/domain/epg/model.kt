@file:JsExport

package me.user.library.domain.epg

import com.badoo.reaktive.single.Single
import kotlinx.serialization.Serializable
import me.user.library.network.Fetcher
import kotlin.js.JsExport

@Serializable
data class Channel(val id: Int, val logo: String, val name: String)

class EpgREST(private val fetcher: Fetcher) {
    fun getChannels(): Single<Array<Channel>> {
        return fetcher.getList("channels/list?lang=en")
    }
}
