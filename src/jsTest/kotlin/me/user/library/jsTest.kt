package me.user.library

import kotlin.test.Test
import kotlin.test.assertTrue

class jsTest {
    @Test
    fun testExample() {
        val sml = init(Config(baseUrl = "sdp://"))
        assertTrue(sml.platform.deviceType == DeviceType.WEB)
    }
}
