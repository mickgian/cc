package me.mickgian.model


import com.google.gson.annotations.SerializedName

data class MarketSummaryResponse(
    @SerializedName("marketSummaryResponse")
    val marketSummaryResponse: MarketSummaryResponse
) {
    data class MarketSummaryResponse(
        @SerializedName("result")
        val marketList: ArrayList<Market>,
        @SerializedName("error")
        val error: Any?
    ) {
        data class Market(
            @SerializedName("fullExchangeName")
            val fullExchangeName: String,
            @SerializedName("exchangeTimezoneName")
            val exchangeTimezoneName: String?,
            @SerializedName("symbol")
            val symbol: String?,
            @SerializedName("regularMarketChange")
            val regularMarketChange: RegularMarketChange?,
            @SerializedName("gmtOffSetMilliseconds")
            val gmtOffSetMilliseconds: Int?,
            @SerializedName("firstTradeDateMilliseconds")
            val firstTradeDateMilliseconds: Long?,
            @SerializedName("exchangeDataDelayedBy")
            val exchangeDataDelayedBy: Int?,
            @SerializedName("language")
            val language: String?,
            @SerializedName("regularMarketTime")
            val regularMarketTime: RegularMarketTime?,
            @SerializedName("exchangeTimezoneShortName")
            val exchangeTimezoneShortName: String?,
            @SerializedName("regularMarketChangePercent")
            val regularMarketChangePercent: RegularMarketChangePercent?,
            @SerializedName("quoteType")
            val quoteType: String?,
            @SerializedName("regularMarketPrice")
            val regularMarketPrice: RegularMarketPrice?,
            @SerializedName("marketState")
            val marketState: String?,
            @SerializedName("market")
            val market: String?,
            @SerializedName("quoteSourceName")
            val quoteSourceName: String?,
            @SerializedName("priceHint")
            val priceHint: Int?,
            @SerializedName("tradeable")
            val tradeable: Boolean?,
            @SerializedName("exchange")
            val exchange: String?,
            @SerializedName("sourceInterval")
            val sourceInterval: Int?,
            @SerializedName("shortName")
            val shortName: String?,
            @SerializedName("region")
            val region: String?,
            @SerializedName("regularMarketPreviousClose")
            val regularMarketPreviousClose: RegularMarketPreviousClose?,
            @SerializedName("triggerable")
            val triggerable: Boolean?,
            @SerializedName("headSymbolAsString")
            val headSymbolAsString: String?,
            @SerializedName("headSymbol")
            val headSymbol: Boolean?,
            @SerializedName("contractSymbol")
            val contractSymbol: Boolean?,
            @SerializedName("currency")
            val currency: String?,
            @SerializedName("longName")
            val longName: String?
        ) {
            data class RegularMarketChange(
                @SerializedName("raw")
                val raw: Double?,
                @SerializedName("fmt")
                val fmt: String?
            )

            data class RegularMarketTime(
                @SerializedName("raw")
                val raw: Int?,
                @SerializedName("fmt")
                val fmt: String?
            )

            data class RegularMarketChangePercent(
                @SerializedName("raw")
                val raw: Double?,
                @SerializedName("fmt")
                val fmt: String?
            )

            data class RegularMarketPrice(
                @SerializedName("raw")
                val raw: Double?,
                @SerializedName("fmt")
                val fmt: String?
            )

            data class RegularMarketPreviousClose(
                @SerializedName("raw")
                val raw: Double?,
                @SerializedName("fmt")
                val fmt: String?
            )
        }
    }
}