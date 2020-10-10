package me.mickgian.network

import io.reactivex.Observable
import me.mickgian.model.MarketSummaryResponse
import me.mickgian.model.StockSummaryResponse
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface ApiInterface {

    @GET("market/get-summary")
    fun fetchMarketSummary(
        @QueryMap parameters: Map<String, String>? = mapOf()
    ): Observable<MarketSummaryResponse>

    @GET("stock/v2/get-summary")
    fun fetchStockSummary(
        @QueryMap parameters: Map<String, String>? = mapOf()
    ): Observable<StockSummaryResponse>
}