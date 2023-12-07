package com.innov8.data.data.repo

import com.innov8.moneyfellowscourier.utils.formatDate
import com.innov8.data.data.pojo.GroupedMatches
import com.innov8.data.data.pojo.Match
import com.innov8.data.data.remote.Result
import com.innov8.data.data.remote.flowAsResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class MatchesUseCases @Inject constructor(
    val repository: MatchesRepositoryInterface
) {
    suspend fun getMatchesGroupedByDate() =
        flow { emit(repository.getMatches()) }.flowAsResult().map {
            when (it) {
                is Result.Success -> {
                    Result.Success(GroupedMatches(value = convertToGroupedMatchesByDate(it.data.matches)))
                }
                is Result.Loading -> {
                    Result.Loading
                }
                is Result.Failure -> {
                    Result.Failure(it.exception)
                }
                else -> {
                    Result.Loading
                }
            }
        }

    fun getFavoriteMatches(): Flow<Map<String, List<Match>>> {

        return repository.getFavoritesMatches().map {
            convertToGroupedMatchesByDate(it)
        }
    }

    fun getFavoriteMatchesIds(): Flow<List<Int>> {
        return repository.getFavoritesMatchesIds()
    }

    fun addFavoriteMatch(match: Match) {
        return repository.addFavoriteMatch(match)
    }

    fun removeFavoriteMatch(match: Match) {
        return repository.removeFavoriteMatch(match)
    }

    fun convertToGroupedMatchesByDate(matches: List<Match>): Map<String, List<Match>> {
        return matches.groupBy { formatDate(it?.utcDate!!) }
    }

    fun convertMatchesFavStatesDependsOnIds(
        favoritesIds: MutableList<Int>,
        sectionedByDateMap: Map<String, List<Match>>
    ): Map<String, List<Match>> {
        val list = sectionedByDateMap
        list.apply {
            this.keys.forEach {
                list[it]?.forEach exitIfExist@{ match ->
                    favoritesIds.forEach { id ->
                        if (match.id == id) {
                            match.isFavorite = true
                            return@exitIfExist
                        } else {
                            match.isFavorite = false
                        }
                    }
                }
            }
        }
        return list
    }
}

