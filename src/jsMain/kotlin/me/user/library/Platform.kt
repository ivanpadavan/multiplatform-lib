package me.user.library
import kotlinx.browser.*
actual class Platform actual constructor() {
    actual val platform: String = window.navigator.platform
}
