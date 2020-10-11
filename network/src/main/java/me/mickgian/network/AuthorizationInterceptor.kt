package me.mickgian.network

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

/**
 * This class intercepts the Retrofit [Request] at run time and modify the headers
 */

const val RAPID_API_HOST = "x-rapidapi-host"
const val YAHOO_FINANCE_API = "apidojo-yahoo-finance-v1.p.rapidapi.com"
const val RAPID_API_KEY = "x-rapidapi-key"
const val RAPID_API_KEY_VALUE = "Insert Your Key Here"


class AuthorizationInterceptor : Interceptor {
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = modifyRequest(chain.request()).build()
        return chain.proceed(request)
    }

    private fun modifyRequest(request: Request): Request.Builder {
        val builder = request.newBuilder()

        return builder
            .header(RAPID_API_HOST, YAHOO_FINANCE_API)
            .header(RAPID_API_KEY, RAPID_API_KEY_VALUE)
    }
}
