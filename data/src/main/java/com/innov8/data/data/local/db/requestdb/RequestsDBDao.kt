package com.innov8.data.data.local.db.requestdb

import androidx.room.*
import com.innov8.data.data.pojo.RequestEntity


@Dao
interface RequestsDBDao {

    @Query("SELECT * FROM requests")
    suspend fun getAllRequests(): List<RequestEntity>

    @Insert
    suspend fun insertRequest(request: RequestEntity)

    @Delete
    suspend fun deleteRequest(request: RequestEntity)


}