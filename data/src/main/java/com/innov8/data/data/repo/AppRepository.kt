package com.innov8.data.data.repo

import com.innov8.data.data.local.LocalMatchesDataSource
import com.innov8.data.data.pojo.DefaultRes
import com.innov8.data.data.remote.RemoteMatchesDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AppRepository @Inject constructor(
    private val localMatchesDS: LocalMatchesDataSource,
    private val remoteMatchesDS: RemoteMatchesDataSource
) {


     fun login(name:String, phone:String): Flow<DefaultRes> {
        return remoteMatchesDS.login(name,phone)
    }

}