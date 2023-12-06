package com.innov8.data.matches.remote

import okhttp3.Interceptor
import okhttp3.Response

object HeadersInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(
            chain.request().newBuilder().addHeader(
                AUTH_TOKEN_KEY, ""
            ).build()
        )
    }
}
