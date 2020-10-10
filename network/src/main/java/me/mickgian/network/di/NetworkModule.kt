package me.mickgian.network.di

import me.mickgian.network.*
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

const val baseUrl: String = "https://apidojo-yahoo-finance-v1.p.rapidapi.com/"

val networkModule = module {

    factory { AuthorizationInterceptor() }
    factory { provideLoggingInterceptor() }
    factory { provideOkHttpClient( get(), get() )}
    factory { provideApi( get() ) }
    factory { FinanceDataSource( get() )}
    single { provideRetrofit( get() )}

}

fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .client(okHttpClient)
        .build()
}

fun provideOkHttpClient(
    authorizationInterceptor: AuthorizationInterceptor,
    loggingInterceptor: HttpLoggingInterceptor
): OkHttpClient {

    val connectionTimeout: Long = 30

    return OkHttpClient().newBuilder()
        .connectTimeout(connectionTimeout, TimeUnit.SECONDS)
        .readTimeout(connectionTimeout, TimeUnit.SECONDS)
        .addInterceptor(authorizationInterceptor)
        .addInterceptor(loggingInterceptor)
        .build()
}

fun provideLoggingInterceptor(): HttpLoggingInterceptor {
    val logger = HttpLoggingInterceptor()
    logger.level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
    else HttpLoggingInterceptor.Level.NONE
    return logger
}

fun provideApi(retrofit: Retrofit): ApiInterface = retrofit.create(ApiInterface::class.java)