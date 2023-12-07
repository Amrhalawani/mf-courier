package com.innov8.data.data.pojo


fun FakeMatchResource(
    id: Int,
    date: String,
    isFavorite: Boolean = false
) = Match(
    matchday = 1,
    awayTeam = null,
    utcDate = date,
    lastUpdated = null,
    score = null,
    stage = null,
    season = null,
    homeTeam = null,
    id = id,
    referees = listOf(),
    status = null,
    isFavorite = isFavorite
)

