package me.user.library

actual class Platform actual constructor() {
    actual val deviceType: DeviceType = DeviceType.IPHONE
    actual fun log(v: Any?) { Unit }
    actual fun init() { Unit }
}
