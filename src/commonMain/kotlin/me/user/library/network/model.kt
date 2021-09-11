package me.user.library.network

import kotlinx.serialization.Serializable

@Serializable
data class Response<T>(val result: T)

@Serializable
data class ListResponse<T>(val list: Array<T>)
