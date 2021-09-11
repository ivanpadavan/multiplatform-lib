package me.user.library

import kotlin.js.console

actual class Platform actual constructor() {
    actual val deviceType: DeviceType = DeviceType.WEB
    actual fun log(v: Any?) { console.log(v) }
    actual fun init(): Unit {
        js("""
            var f = window.fetch;
            window.fetch = function() {
               arguments[1].credentials = "include";
               return f.apply(window, arguments);
            }""",
        )
    }
}
