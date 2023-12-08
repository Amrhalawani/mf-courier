package com.innov8.data.data.repo

import com.innov8.data.data.local.LocalDataSource
import com.innov8.data.data.pojo.DefaultRes
import com.innov8.data.data.remote.RemoteDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AppRepository @Inject constructor(
    private val localDS: LocalDataSource,
    private val remoteDS: RemoteDataSource
) {


     suspend fun login(country_code:String, phone:String): DefaultRes {
        return remoteDS.login(country_code,phone)
    }

}