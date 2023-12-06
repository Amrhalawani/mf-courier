package com.innov8.data.matches.remote

import com.innov8.data.matches.pojo.MatchesRes
import retrofit2.http.*

interface ApiClient {

    @GET(MATCHES_2021_END_POINT)
    suspend fun getMatches(): MatchesRes

}