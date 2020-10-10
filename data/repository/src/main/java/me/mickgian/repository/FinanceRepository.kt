package me.mickgian.repository


import io.reactivex.Observable
import me.mickgian.model.MarketSummaryResponse
import me.mickgian.model.StockSummaryResponse
import me.mickgian.network.FinanceDataSource


interface FinanceRepository {
    fun getMarketSummary(
        country: String
    ): Observable<MarketSummaryResponse>
    fun getStockSummary(
        stock: String
    ): Observable<StockSummaryResponse>
}

class FinanceRepositoryImpl(
    private val dataSource: FinanceDataSource
): FinanceRepository {

    override fun getMarketSummary(country: String):Observable<MarketSummaryResponse> {

        val parameters = mapOf(
            "region" to country
        )

        val result = dataSource.fetchMarketSummary(parameters)
        return result

    }

    override fun getStockSummary(stock: String):Observable<StockSummaryResponse> {

        val parameters = mapOf(
            "symbol" to stock
        )

        val result = dataSource.fetchStockSummary(parameters)
        return result

    }

}