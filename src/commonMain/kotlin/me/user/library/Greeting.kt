package me.user.library

import kotlin.js.ExperimentalJsExport

@ExperimentalJsExport
class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
