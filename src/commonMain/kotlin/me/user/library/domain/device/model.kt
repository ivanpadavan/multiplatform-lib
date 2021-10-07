@file:JsExport
package me.user.library.domain.device

import com.badoo.reaktive.single.Single
import kotlinx.serialization.Serializable
import me.user.library.network.Fetcher
import kotlin.js.JsExport

@Serializable
data class Account(val login: String, val password: String)

class DeviceREST(private val fetcher: Fetcher) {
    fun authorize(): Single<Account> {
        return fetcher.get("device/authorize?uuid=ea5adf4bf8334e7fb0112dda5e000011qwe&appVersion=6.7.26-2-g2267c979&stbType=&deviceType=WEB&demo=0&useSameSite=true&lang=en")
    }
}
