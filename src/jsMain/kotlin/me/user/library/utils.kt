@file:JsExport
package me.user.library

import com.badoo.reaktive.single.Single
import com.badoo.reaktive.single.asPromise
import kotlin.js.Promise

fun <T>asPromise(single: Single<T>): Promise<T> {
    return single.asPromise()
}
