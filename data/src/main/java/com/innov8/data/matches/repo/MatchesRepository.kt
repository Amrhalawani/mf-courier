package com.innov8.data.matches.repo

import com.innov8.data.matches.local.LocalMatchesDataSource
import com.innov8.data.matches.pojo.Match
import com.innov8.data.matches.pojo.MatchesRes
import com.innov8.data.matches.remote.RemoteMatchesDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MatchesRepository @Inject constructor(
    private val localMatchesDS: LocalMatchesDataSource,
    private val remoteMatchesDS: RemoteMatchesDataSource
) : MatchesRepositoryInterface {


    override fun getFavoritesMatches(): Flow<List<Match>> {
        return localMatchesDS.fetchFavoritesMatches()
    }

    override fun getFavoritesMatchesIds(): Flow<List<Int>> {
        return localMatchesDS.fetchFavoriteMatchIDs()
    }

    override suspend fun getMatches(): MatchesRes {
        return remoteMatchesDS.fetchMatches()
    }

    override fun addFavoriteMatch(match: Match) {
        return localMatchesDS.addFavoriteMatch(match)
    }

    override fun removeFavoriteMatch(match: Match) {
        return localMatchesDS.removeFavoriteMatch(match)
    }

}