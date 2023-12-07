package com.innov8.data.data.pojo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "requests")
data class RequestEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val request: String,
    val date: String,
    val isSuccess: Boolean= false,
)
