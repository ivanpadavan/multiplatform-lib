package me.user.library

actual class Platform actual constructor() {
    actual fun log(v: Any?) { Unit }
    actual fun init() { Unit }
    actual val deviceType: DeviceType
        get() = DeviceType.ANDROID
}
