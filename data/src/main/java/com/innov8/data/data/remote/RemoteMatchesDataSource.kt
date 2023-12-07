package com.innov8.data.data.remote

import com.innov8.data.data.pojo.DefaultRes
import javax.inject.Inject

class RemoteMatchesDataSource @Inject constructor(private val apiClient: ApiClient) {
    suspend fun login(name:String, phone:String): DefaultRes {
        return apiClient.login(name,phone)
    }
}