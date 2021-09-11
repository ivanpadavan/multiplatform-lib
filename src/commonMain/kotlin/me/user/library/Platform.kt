package me.user.library

sealed class DeviceType {
    object STB: DeviceType()
    object STBOTT: DeviceType()
    object ANDROIDSTB: DeviceType()
    object ANDROIDSTBOTT: DeviceType()
    object IPAD: DeviceType()
    object IPHONE: DeviceType()
    object ANDROID: DeviceType()
    object WEB: DeviceType()
    object SMARTTVSAMSUNG: DeviceType()
    object SMARTTVLG: DeviceType()
    object ANDROIDTV: DeviceType()
    object SMARTTVHISENSE: DeviceType()
}

expect class Platform() {
    val deviceType: DeviceType
    fun log(v: Any?)
    fun init()
}
