package com.innov8.data.data.repo

import com.innov8.data.data.pojo.Match
import com.innov8.data.data.pojo.MatchesRes
import kotlinx.coroutines.flow.Flow

interface MatchesRepositoryInterface {

    fun getFavoritesMatches(): Flow<List<Match>>
    fun getFavoritesMatchesIds(): Flow<List<Int>>
    suspend fun getMatches(): MatchesRes
    fun addFavoriteMatch(match: Match)
    fun removeFavoriteMatch(match: Match)

}