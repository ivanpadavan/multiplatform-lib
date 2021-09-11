@file:JsExport

package me.user.library

import kotlinx.serialization.Serializable
import me.user.library.domain.device.DeviceREST
import me.user.library.domain.epg.EpgREST
import me.user.library.network.Fetcher
import org.kodein.di.DI
import org.kodein.di.bindSingleton
import org.kodein.di.instance
import kotlin.js.JsExport

@Serializable
data class Config(val baseUrl: String = "https://fe-iptv.baltcom.lv/api/v1/")

fun init(config: Config): Sml {
    val di = DI {
        bindSingleton() { config }
        bindSingleton() { Platform() }
        bindSingleton() { Fetcher(instance(), instance()) }
        bindSingleton() { DeviceREST(instance()) }
        bindSingleton() { EpgREST(instance()) }
        bindSingleton() { Sml(instance(), instance(), instance()) }
    }
    val sml: Sml by di.instance();
    return sml
}

class Sml(val platform: Platform, val deviceREST: DeviceREST, val epgREST: EpgREST) {
    init {
        platform.init()
    }
}
