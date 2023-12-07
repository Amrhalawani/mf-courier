package com.innov8.data.data.repo

import com.innov8.data.data.pojo.Match
import com.innov8.data.data.pojo.MatchesRes
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

//for test only
class FakeMatchesRepository() : MatchesRepositoryInterface {
    override fun getFavoritesMatches(): Flow<List<Match>> {
        return flow {
            listOf<Match>()
        }
    }

    override fun getFavoritesMatchesIds(): Flow<List<Int>> {
        return flow {
            listOf<Int>()
        }
    }

    override suspend fun getMatches(): MatchesRes {
        return MatchesRes()
    }

    override fun addFavoriteMatch(match: Match) {}

    override fun removeFavoriteMatch(match: Match) {}
}