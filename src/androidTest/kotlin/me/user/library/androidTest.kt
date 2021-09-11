package me.user.library

import org.junit.Assert.assertTrue
import org.junit.Test

class AndroidTest {
    @Test
    fun testExample() {
        val sml = init(Config(baseUrl = "sdp://"))
        assertTrue(sml.platform.deviceType == DeviceType.ANDROID)
    }
}
