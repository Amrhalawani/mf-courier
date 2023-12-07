package com.innov8.data.data.remote

import com.innov8.data.data.pojo.CheckOtpRes
import com.innov8.data.data.pojo.DefaultRes
import com.innov8.data.data.pojo.HomeRes
import com.innov8.data.data.pojo.ReportsRes
import retrofit2.http.*

interface ApiClient {
    @FormUrlEncoded
    @POST("/login")
    suspend fun login(
        @Field("country_code") name: String,
        @Field("phone_number") phone: String
    ): DefaultRes


    @POST("/check_otp")
    suspend fun checkOtp(
        @Field("country_code") name: String,
        @Field("phone_number") phone: String,
        @Field("code") code: String,
        @Field("notification_key") notification_key: String,
        @Field("platform") platform: String = "android",
    ): CheckOtpRes


    @FormUrlEncoded
    @POST("/resend_otp")
    suspend fun resendOtp(
        @Field("country_code") name: String,
        @Field("phone_number") phone: String

    ): DefaultRes


    @FormUrlEncoded
    @POST("/logout")
    suspend fun logout(
    ): DefaultRes

    @FormUrlEncoded
    @POST("/reports")
    suspend fun reports(
        @Field("date_from") name: String,
        @Field("date_to") phone: String
    ): ReportsRes

    @FormUrlEncoded
    @GET("/home")
    suspend fun home(
    ): HomeRes


}