package com.innov8.data.data.remote

import com.innov8.data.data.pojo.DefaultRes
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val apiClient: ApiClient) {
    suspend fun login(country_code:String, phone:String): DefaultRes {
        return apiClient.login(country_code,phone)
    }
}