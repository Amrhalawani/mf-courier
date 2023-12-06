package com.innov8.data.matches.repo

import com.innov8.data.matches.pojo.Match
import com.innov8.data.matches.pojo.MatchesRes
import kotlinx.coroutines.flow.Flow

interface MatchesRepositoryInterface {

    fun getFavoritesMatches(): Flow<List<Match>>
    fun getFavoritesMatchesIds(): Flow<List<Int>>
    suspend fun getMatches(): MatchesRes
    fun addFavoriteMatch(match: Match)
    fun removeFavoriteMatch(match: Match)

}