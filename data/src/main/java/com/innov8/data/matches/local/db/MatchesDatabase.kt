package com.innov8.data.matches.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.innov8.data.matches.pojo.Match

@Database(entities = [Match::class], exportSchema = false, version = 1)
@TypeConverters(Converters::class)
abstract class MatchesDatabase : RoomDatabase() {

    abstract fun favoriteMatchesDao(): FavoriteMatchesDao

}