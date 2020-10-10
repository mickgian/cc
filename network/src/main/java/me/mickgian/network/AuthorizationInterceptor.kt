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
const val RAPID_API_KEY_VALUE = "663f7f2732mshd602164f3011c0fp1b6befjsn976bb6519729"


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
