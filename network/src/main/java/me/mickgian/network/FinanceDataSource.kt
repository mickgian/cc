package me.mickgian.network

/**
 * Implementation of [ApiInterface] interface
 */
class FinanceDataSource(private val api: ApiInterface) {

    fun fetchMarketSummary(
        parameters: Map<String, String>
    ) = api.fetchMarketSummary(
        parameters
    )

    fun fetchStockSummary(
        parameters: Map<String, String>
    ) = api.fetchStockSummary(
        parameters
    )

}