package com.innov8.data.data.remote

import com.innov8.data.data.pojo.MatchesRes
import javax.inject.Inject

class RemoteMatchesDataSource @Inject constructor(private val apiClient: ApiClient) {
    suspend fun fetchMatches(): MatchesRes {
        return apiClient.getMatches()
    }
}