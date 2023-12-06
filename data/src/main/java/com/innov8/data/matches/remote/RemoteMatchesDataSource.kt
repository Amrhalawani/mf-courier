package com.innov8.data.matches.remote

import com.innov8.data.matches.pojo.MatchesRes
import javax.inject.Inject

class RemoteMatchesDataSource @Inject constructor(private val apiClient: ApiClient) {
    suspend fun fetchMatches(): MatchesRes {
        return apiClient.getMatches()
    }
}