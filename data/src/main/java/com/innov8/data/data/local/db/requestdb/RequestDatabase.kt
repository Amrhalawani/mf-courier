package com.innov8.data.data.local.db.requestdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.innov8.data.data.pojo.RequestEntity

@Database(entities = [RequestEntity::class], exportSchema = false, version = 1)
//@TypeConverters(Converters::class)
abstract class RequestDatabase : RoomDatabase() {

    abstract fun requestsDBDao(): RequestsDBDao

}