package me.mickgian.model


import com.google.gson.annotations.SerializedName

data class Stock(
    @SerializedName("defaultKeyStatistics")
    val defaultKeyStatistics: DefaultKeyStatistics?,
    @SerializedName("details")
    val details: Details?,
    @SerializedName("summaryProfile")
    val summaryProfile: SummaryProfile?,
    @SerializedName("recommendationTrend")
    val recommendationTrend: RecommendationTrend?,
    @SerializedName("financialsTemplate")
    val financialsTemplate: FinancialsTemplate?,
    @SerializedName("majorDirectHolders")
    val majorDirectHolders: MajorDirectHolders?,
    @SerializedName("earnings")
    val earnings: Earnings?,
    @SerializedName("price")
    val price: Price?,
    @SerializedName("fundOwnership")
    val fundOwnership: FundOwnership?,
    @SerializedName("insiderTransactions")
    val insiderTransactions: InsiderTransactions?,
    @SerializedName("insiderHolders")
    val insiderHolders: InsiderHolders?,
    @SerializedName("netSharePurchaseActivity")
    val netSharePurchaseActivity: NetSharePurchaseActivity?,
    @SerializedName("majorHoldersBreakdown")
    val majorHoldersBreakdown: MajorHoldersBreakdown?,
    @SerializedName("financialData")
    val financialData: FinancialData?,
    @SerializedName("quoteType")
    val quoteType: QuoteType?,
    @SerializedName("institutionOwnership")
    val institutionOwnership: InstitutionOwnership?,
    @SerializedName("calendarEvents")
    val calendarEvents: CalendarEvents?,
    @SerializedName("summaryDetail")
    val summaryDetail: SummaryDetail?,
    @SerializedName("symbol")
    val symbol: String?,
    @SerializedName("esgScores")
    val esgScores: EsgScores?,
    @SerializedName("upgradeDowngradeHistory")
    val upgradeDowngradeHistory: UpgradeDowngradeHistory?,
    @SerializedName("pageViews")
    val pageViews: PageViews?
) {
    data class DefaultKeyStatistics(
        @SerializedName("annualHoldingsTurnover")
        val annualHoldingsTurnover: AnnualHoldingsTurnover?,
        @SerializedName("enterpriseToRevenue")
        val enterpriseToRevenue: EnterpriseToRevenue?,
        @SerializedName("beta3Year")
        val beta3Year: Beta3Year?,
        @SerializedName("profitMargins")
        val profitMargins: ProfitMargins?,
        @SerializedName("enterpriseToEbitda")
        val enterpriseToEbitda: EnterpriseToEbitda?,
        @SerializedName("52WeekChange")
        val weekChange: WeekChange?,
        @SerializedName("morningStarRiskRating")
        val morningStarRiskRating: MorningStarRiskRating?,
        @SerializedName("forwardEps")
        val forwardEps: ForwardEps?,
        @SerializedName("revenueQuarterlyGrowth")
        val revenueQuarterlyGrowth: RevenueQuarterlyGrowth?,
        @SerializedName("sharesOutstanding")
        val sharesOutstanding: SharesOutstanding?,
        @SerializedName("fundInceptionDate")
        val fundInceptionDate: FundInceptionDate?,
        @SerializedName("annualReportExpenseRatio")
        val annualReportExpenseRatio: AnnualReportExpenseRatio?,
        @SerializedName("totalAssets")
        val totalAssets: TotalAssets?,
        @SerializedName("bookValue")
        val bookValue: BookValue?,
        @SerializedName("sharesShort")
        val sharesShort: SharesShort?,
        @SerializedName("sharesPercentSharesOut")
        val sharesPercentSharesOut: SharesPercentSharesOut?,
        @SerializedName("fundFamily")
        val fundFamily: Any?,
        @SerializedName("lastFiscalYearEnd")
        val lastFiscalYearEnd: LastFiscalYearEnd?,
        @SerializedName("heldPercentInstitutions")
        val heldPercentInstitutions: HeldPercentInstitutions?,
        @SerializedName("netIncomeToCommon")
        val netIncomeToCommon: NetIncomeToCommon?,
        @SerializedName("trailingEps")
        val trailingEps: TrailingEps?,
        @SerializedName("lastDividendValue")
        val lastDividendValue: LastDividendValue?,
        @SerializedName("SandP52WeekChange")
        val sandP52WeekChange: SandP52WeekChange?,
        @SerializedName("priceToBook")
        val priceToBook: PriceToBook?,
        @SerializedName("heldPercentInsiders")
        val heldPercentInsiders: HeldPercentInsiders?,
        @SerializedName("nextFiscalYearEnd")
        val nextFiscalYearEnd: NextFiscalYearEnd?,
        @SerializedName("yield")
        val yield: Yield?,
        @SerializedName("mostRecentQuarter")
        val mostRecentQuarter: MostRecentQuarter?,
        @SerializedName("shortRatio")
        val shortRatio: ShortRatio?,
        @SerializedName("sharesShortPreviousMonthDate")
        val sharesShortPreviousMonthDate: SharesShortPreviousMonthDate?,
        @SerializedName("floatShares")
        val floatShares: FloatShares?,
        @SerializedName("beta")
        val beta: Beta?,
        @SerializedName("enterpriseValue")
        val enterpriseValue: EnterpriseValue?,
        @SerializedName("priceHint")
        val priceHint: PriceHint?,
        @SerializedName("threeYearAverageReturn")
        val threeYearAverageReturn: ThreeYearAverageReturn?,
        @SerializedName("lastSplitDate")
        val lastSplitDate: LastSplitDate?,
        @SerializedName("lastSplitFactor")
        val lastSplitFactor: String?,
        @SerializedName("legalType")
        val legalType: Any?,
        @SerializedName("lastDividendDate")
        val lastDividendDate: LastDividendDate?,
        @SerializedName("morningStarOverallRating")
        val morningStarOverallRating: MorningStarOverallRating?,
        @SerializedName("earningsQuarterlyGrowth")
        val earningsQuarterlyGrowth: EarningsQuarterlyGrowth?,
        @SerializedName("priceToSalesTrailing12Months")
        val priceToSalesTrailing12Months: PriceToSalesTrailing12Months?,
        @SerializedName("dateShortInterest")
        val dateShortInterest: DateShortInterest?,
        @SerializedName("pegRatio")
        val pegRatio: PegRatio?,
        @SerializedName("ytdReturn")
        val ytdReturn: YtdReturn?,
        @SerializedName("forwardPE")
        val forwardPE: ForwardPE?,
        @SerializedName("maxAge")
        val maxAge: Int?,
        @SerializedName("lastCapGain")
        val lastCapGain: LastCapGain?,
        @SerializedName("shortPercentOfFloat")
        val shortPercentOfFloat: ShortPercentOfFloat?,
        @SerializedName("sharesShortPriorMonth")
        val sharesShortPriorMonth: SharesShortPriorMonth?,
        @SerializedName("category")
        val category: Any?,
        @SerializedName("fiveYearAverageReturn")
        val fiveYearAverageReturn: FiveYearAverageReturn?
    ) {
        class AnnualHoldingsTurnover(
        )

        data class EnterpriseToRevenue(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        class Beta3Year(
        )

        data class ProfitMargins(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class EnterpriseToEbitda(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class WeekChange(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        class MorningStarRiskRating(
        )

        data class ForwardEps(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        class RevenueQuarterlyGrowth(
        )

        data class SharesOutstanding(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        class FundInceptionDate(
        )

        class AnnualReportExpenseRatio(
        )

        class TotalAssets(
        )

        data class BookValue(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class SharesShort(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class SharesPercentSharesOut(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class LastFiscalYearEnd(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class HeldPercentInstitutions(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class NetIncomeToCommon(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class TrailingEps(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        class LastDividendValue(
        )

        data class SandP52WeekChange(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class PriceToBook(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class HeldPercentInsiders(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class NextFiscalYearEnd(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?
        )

        class Yield(
        )

        data class MostRecentQuarter(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class ShortRatio(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class SharesShortPreviousMonthDate(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class FloatShares(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class Beta(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class EnterpriseValue(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class PriceHint(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        class ThreeYearAverageReturn(
        )

        data class LastSplitDate(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?
        )

        class LastDividendDate(
        )

        class MorningStarOverallRating(
        )

        class EarningsQuarterlyGrowth(
        )

        class PriceToSalesTrailing12Months(
        )

        data class DateShortInterest(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class PegRatio(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        class YtdReturn(
        )

        data class ForwardPE(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        class LastCapGain(
        )

        class ShortPercentOfFloat(
        )

        data class SharesShortPriorMonth(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        class FiveYearAverageReturn(
        )
    }

    class Details(
    )

    data class SummaryProfile(
        @SerializedName("zip")
        val zip: String?,
        @SerializedName("sector")
        val sector: String?,
        @SerializedName("fullTimeEmployees")
        val fullTimeEmployees: Int?,
        @SerializedName("longBusinessSummary")
        val longBusinessSummary: String?,
        @SerializedName("city")
        val city: String?,
        @SerializedName("phone")
        val phone: String?,
        @SerializedName("country")
        val country: String?,
        @SerializedName("companyOfficers")
        val companyOfficers: List<Any?>?,
        @SerializedName("website")
        val website: String?,
        @SerializedName("maxAge")
        val maxAge: Int?,
        @SerializedName("address1")
        val address1: String?,
        @SerializedName("industry")
        val industry: String?,
        @SerializedName("address2")
        val address2: String?
    )

    data class RecommendationTrend(
        @SerializedName("trend")
        val trend: List<Trend?>?,
        @SerializedName("maxAge")
        val maxAge: Int?
    ) {
        data class Trend(
            @SerializedName("period")
            val period: String?,
            @SerializedName("strongBuy")
            val strongBuy: Int?,
            @SerializedName("buy")
            val buy: Int?,
            @SerializedName("hold")
            val hold: Int?,
            @SerializedName("sell")
            val sell: Int?,
            @SerializedName("strongSell")
            val strongSell: Int?
        )
    }

    data class FinancialsTemplate(
        @SerializedName("code")
        val code: String?,
        @SerializedName("maxAge")
        val maxAge: Int?
    )

    data class MajorDirectHolders(
        @SerializedName("holders")
        val holders: List<Any?>?,
        @SerializedName("maxAge")
        val maxAge: Int?
    )

    data class Earnings(
        @SerializedName("maxAge")
        val maxAge: Int?,
        @SerializedName("earningsChart")
        val earningsChart: EarningsChart?,
        @SerializedName("financialsChart")
        val financialsChart: FinancialsChart?,
        @SerializedName("financialCurrency")
        val financialCurrency: String?
    ) {
        data class EarningsChart(
            @SerializedName("quarterly")
            val quarterly: List<Quarterly?>?,
            @SerializedName("currentQuarterEstimate")
            val currentQuarterEstimate: CurrentQuarterEstimate?,
            @SerializedName("currentQuarterEstimateDate")
            val currentQuarterEstimateDate: String?,
            @SerializedName("currentQuarterEstimateYear")
            val currentQuarterEstimateYear: Int?,
            @SerializedName("earningsDate")
            val earningsDate: List<EarningsDate?>?
        ) {
            data class Quarterly(
                @SerializedName("date")
                val date: String?,
                @SerializedName("actual")
                val `actual`: Actual?,
                @SerializedName("estimate")
                val estimate: Estimate?
            ) {
                data class Actual(
                    @SerializedName("raw")
                    val raw: Double?,
                    @SerializedName("fmt")
                    val fmt: String?
                )

                data class Estimate(
                    @SerializedName("raw")
                    val raw: Double?,
                    @SerializedName("fmt")
                    val fmt: String?
                )
            }

            data class CurrentQuarterEstimate(
                @SerializedName("raw")
                val raw: Double?,
                @SerializedName("fmt")
                val fmt: String?
            )

            data class EarningsDate(
                @SerializedName("raw")
                val raw: Int?,
                @SerializedName("fmt")
                val fmt: String?
            )
        }

        data class FinancialsChart(
            @SerializedName("yearly")
            val yearly: List<Yearly?>?,
            @SerializedName("quarterly")
            val quarterly: List<Quarterly?>?
        ) {
            data class Yearly(
                @SerializedName("date")
                val date: Int?,
                @SerializedName("revenue")
                val revenue: Revenue?,
                @SerializedName("earnings")
                val earnings: Earnings?
            ) {
                data class Revenue(
                    @SerializedName("raw")
                    val raw: Int?,
                    @SerializedName("fmt")
                    val fmt: String?,
                    @SerializedName("longFmt")
                    val longFmt: String?
                )

                data class Earnings(
                    @SerializedName("raw")
                    val raw: Int?,
                    @SerializedName("fmt")
                    val fmt: String?,
                    @SerializedName("longFmt")
                    val longFmt: String?
                )
            }

            data class Quarterly(
                @SerializedName("date")
                val date: String?,
                @SerializedName("revenue")
                val revenue: Revenue?,
                @SerializedName("earnings")
                val earnings: Earnings?
            ) {
                data class Revenue(
                    @SerializedName("raw")
                    val raw: Int?,
                    @SerializedName("fmt")
                    val fmt: String?,
                    @SerializedName("longFmt")
                    val longFmt: String?
                )

                data class Earnings(
                    @SerializedName("raw")
                    val raw: Int?,
                    @SerializedName("fmt")
                    val fmt: String?,
                    @SerializedName("longFmt")
                    val longFmt: String?
                )
            }
        }
    }

    data class Price(
        @SerializedName("quoteSourceName")
        val quoteSourceName: String?,
        @SerializedName("regularMarketOpen")
        val regularMarketOpen: RegularMarketOpen?,
        @SerializedName("averageDailyVolume3Month")
        val averageDailyVolume3Month: AverageDailyVolume3Month?,
        @SerializedName("exchange")
        val exchange: String?,
        @SerializedName("regularMarketTime")
        val regularMarketTime: Int?,
        @SerializedName("volume24Hr")
        val volume24Hr: Volume24Hr?,
        @SerializedName("regularMarketDayHigh")
        val regularMarketDayHigh: RegularMarketDayHigh?,
        @SerializedName("shortName")
        val shortName: String?,
        @SerializedName("averageDailyVolume10Day")
        val averageDailyVolume10Day: AverageDailyVolume10Day?,
        @SerializedName("longName")
        val longName: String?,
        @SerializedName("regularMarketChange")
        val regularMarketChange: RegularMarketChange?,
        @SerializedName("currencySymbol")
        val currencySymbol: String?,
        @SerializedName("regularMarketPreviousClose")
        val regularMarketPreviousClose: RegularMarketPreviousClose?,
        @SerializedName("postMarketTime")
        val postMarketTime: Int?,
        @SerializedName("preMarketPrice")
        val preMarketPrice: PreMarketPrice?,
        @SerializedName("exchangeDataDelayedBy")
        val exchangeDataDelayedBy: Int?,
        @SerializedName("toCurrency")
        val toCurrency: Any?,
        @SerializedName("postMarketChange")
        val postMarketChange: PostMarketChange?,
        @SerializedName("postMarketPrice")
        val postMarketPrice: PostMarketPrice?,
        @SerializedName("exchangeName")
        val exchangeName: String?,
        @SerializedName("preMarketChange")
        val preMarketChange: PreMarketChange?,
        @SerializedName("circulatingSupply")
        val circulatingSupply: CirculatingSupply?,
        @SerializedName("regularMarketDayLow")
        val regularMarketDayLow: RegularMarketDayLow?,
        @SerializedName("priceHint")
        val priceHint: PriceHint?,
        @SerializedName("currency")
        val currency: String?,
        @SerializedName("regularMarketPrice")
        val regularMarketPrice: RegularMarketPrice?,
        @SerializedName("regularMarketVolume")
        val regularMarketVolume: RegularMarketVolume?,
        @SerializedName("lastMarket")
        val lastMarket: Any?,
        @SerializedName("regularMarketSource")
        val regularMarketSource: String?,
        @SerializedName("openInterest")
        val openInterest: OpenInterest?,
        @SerializedName("marketState")
        val marketState: String?,
        @SerializedName("underlyingSymbol")
        val underlyingSymbol: Any?,
        @SerializedName("marketCap")
        val marketCap: MarketCap?,
        @SerializedName("quoteType")
        val quoteType: String?,
        @SerializedName("volumeAllCurrencies")
        val volumeAllCurrencies: VolumeAllCurrencies?,
        @SerializedName("postMarketSource")
        val postMarketSource: String?,
        @SerializedName("strikePrice")
        val strikePrice: StrikePrice?,
        @SerializedName("symbol")
        val symbol: String?,
        @SerializedName("postMarketChangePercent")
        val postMarketChangePercent: PostMarketChangePercent?,
        @SerializedName("preMarketSource")
        val preMarketSource: String?,
        @SerializedName("maxAge")
        val maxAge: Int?,
        @SerializedName("fromCurrency")
        val fromCurrency: Any?,
        @SerializedName("regularMarketChangePercent")
        val regularMarketChangePercent: RegularMarketChangePercent?
    ) {
        data class RegularMarketOpen(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class AverageDailyVolume3Month(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        class Volume24Hr(
        )

        data class RegularMarketDayHigh(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class AverageDailyVolume10Day(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class RegularMarketChange(
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

        class PreMarketPrice(
        )

        data class PostMarketChange(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class PostMarketPrice(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        class PreMarketChange(
        )

        class CirculatingSupply(
        )

        data class RegularMarketDayLow(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class PriceHint(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class RegularMarketPrice(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class RegularMarketVolume(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        class OpenInterest(
        )

        data class MarketCap(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        class VolumeAllCurrencies(
        )

        class StrikePrice(
        )

        data class PostMarketChangePercent(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class RegularMarketChangePercent(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )
    }

    data class FundOwnership(
        @SerializedName("maxAge")
        val maxAge: Int?,
        @SerializedName("ownershipList")
        val ownershipList: List<Any?>?
    )

    data class InsiderTransactions(
        @SerializedName("transactions")
        val transactions: List<Transaction?>?,
        @SerializedName("maxAge")
        val maxAge: Int?
    ) {
        data class Transaction(
            @SerializedName("filerName")
            val filerName: String?,
            @SerializedName("transactionText")
            val transactionText: String?,
            @SerializedName("moneyText")
            val moneyText: String?,
            @SerializedName("ownership")
            val ownership: String?,
            @SerializedName("startDate")
            val startDate: StartDate?,
            @SerializedName("filerRelation")
            val filerRelation: String?,
            @SerializedName("shares")
            val shares: Shares?,
            @SerializedName("filerUrl")
            val filerUrl: String?,
            @SerializedName("maxAge")
            val maxAge: Int?,
            @SerializedName("value")
            val value: Value?
        ) {
            data class StartDate(
                @SerializedName("raw")
                val raw: Int?,
                @SerializedName("fmt")
                val fmt: String?
            )

            data class Shares(
                @SerializedName("raw")
                val raw: Int?,
                @SerializedName("fmt")
                val fmt: String?,
                @SerializedName("longFmt")
                val longFmt: String?
            )

            data class Value(
                @SerializedName("raw")
                val raw: Int?,
                @SerializedName("fmt")
                val fmt: String?,
                @SerializedName("longFmt")
                val longFmt: String?
            )
        }
    }

    data class InsiderHolders(
        @SerializedName("holders")
        val holders: List<Holder?>?,
        @SerializedName("maxAge")
        val maxAge: Int?
    ) {
        data class Holder(
            @SerializedName("maxAge")
            val maxAge: Int?,
            @SerializedName("name")
            val name: String?,
            @SerializedName("relation")
            val relation: String?,
            @SerializedName("url")
            val url: String?,
            @SerializedName("transactionDescription")
            val transactionDescription: String?,
            @SerializedName("latestTransDate")
            val latestTransDate: LatestTransDate?,
            @SerializedName("positionDirect")
            val positionDirect: PositionDirect?,
            @SerializedName("positionDirectDate")
            val positionDirectDate: PositionDirectDate?,
            @SerializedName("positionIndirectDate")
            val positionIndirectDate: PositionIndirectDate?
        ) {
            data class LatestTransDate(
                @SerializedName("raw")
                val raw: Int?,
                @SerializedName("fmt")
                val fmt: String?
            )

            data class PositionDirect(
                @SerializedName("raw")
                val raw: Int?,
                @SerializedName("fmt")
                val fmt: String?,
                @SerializedName("longFmt")
                val longFmt: String?
            )

            data class PositionDirectDate(
                @SerializedName("raw")
                val raw: Int?,
                @SerializedName("fmt")
                val fmt: String?
            )

            data class PositionIndirectDate(
                @SerializedName("raw")
                val raw: Int?,
                @SerializedName("fmt")
                val fmt: String?
            )
        }
    }

    data class NetSharePurchaseActivity(
        @SerializedName("period")
        val period: String?,
        @SerializedName("netPercentInsiderShares")
        val netPercentInsiderShares: NetPercentInsiderShares?,
        @SerializedName("netInfoCount")
        val netInfoCount: NetInfoCount?,
        @SerializedName("totalInsiderShares")
        val totalInsiderShares: TotalInsiderShares?,
        @SerializedName("buyInfoShares")
        val buyInfoShares: BuyInfoShares?,
        @SerializedName("buyPercentInsiderShares")
        val buyPercentInsiderShares: BuyPercentInsiderShares?,
        @SerializedName("sellInfoCount")
        val sellInfoCount: SellInfoCount?,
        @SerializedName("maxAge")
        val maxAge: Int?,
        @SerializedName("buyInfoCount")
        val buyInfoCount: BuyInfoCount?,
        @SerializedName("netInfoShares")
        val netInfoShares: NetInfoShares?
    ) {
        data class NetPercentInsiderShares(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class NetInfoCount(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class TotalInsiderShares(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class BuyInfoShares(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class BuyPercentInsiderShares(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class SellInfoCount(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: Any?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class BuyInfoCount(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class NetInfoShares(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )
    }

    data class MajorHoldersBreakdown(
        @SerializedName("maxAge")
        val maxAge: Int?,
        @SerializedName("insidersPercentHeld")
        val insidersPercentHeld: InsidersPercentHeld?,
        @SerializedName("institutionsPercentHeld")
        val institutionsPercentHeld: InstitutionsPercentHeld?,
        @SerializedName("institutionsFloatPercentHeld")
        val institutionsFloatPercentHeld: InstitutionsFloatPercentHeld?,
        @SerializedName("institutionsCount")
        val institutionsCount: InstitutionsCount?
    ) {
        data class InsidersPercentHeld(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class InstitutionsPercentHeld(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class InstitutionsFloatPercentHeld(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class InstitutionsCount(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )
    }

    data class FinancialData(
        @SerializedName("ebitdaMargins")
        val ebitdaMargins: EbitdaMargins?,
        @SerializedName("profitMargins")
        val profitMargins: ProfitMargins?,
        @SerializedName("grossMargins")
        val grossMargins: GrossMargins?,
        @SerializedName("operatingCashflow")
        val operatingCashflow: OperatingCashflow?,
        @SerializedName("revenueGrowth")
        val revenueGrowth: RevenueGrowth?,
        @SerializedName("operatingMargins")
        val operatingMargins: OperatingMargins?,
        @SerializedName("ebitda")
        val ebitda: Ebitda?,
        @SerializedName("targetLowPrice")
        val targetLowPrice: TargetLowPrice?,
        @SerializedName("recommendationKey")
        val recommendationKey: String?,
        @SerializedName("grossProfits")
        val grossProfits: GrossProfits?,
        @SerializedName("freeCashflow")
        val freeCashflow: FreeCashflow?,
        @SerializedName("targetMedianPrice")
        val targetMedianPrice: TargetMedianPrice?,
        @SerializedName("currentPrice")
        val currentPrice: CurrentPrice?,
        @SerializedName("earningsGrowth")
        val earningsGrowth: EarningsGrowth?,
        @SerializedName("currentRatio")
        val currentRatio: CurrentRatio?,
        @SerializedName("returnOnAssets")
        val returnOnAssets: ReturnOnAssets?,
        @SerializedName("numberOfAnalystOpinions")
        val numberOfAnalystOpinions: NumberOfAnalystOpinions?,
        @SerializedName("targetMeanPrice")
        val targetMeanPrice: TargetMeanPrice?,
        @SerializedName("debtToEquity")
        val debtToEquity: DebtToEquity?,
        @SerializedName("returnOnEquity")
        val returnOnEquity: ReturnOnEquity?,
        @SerializedName("targetHighPrice")
        val targetHighPrice: TargetHighPrice?,
        @SerializedName("totalCash")
        val totalCash: TotalCash?,
        @SerializedName("totalDebt")
        val totalDebt: TotalDebt?,
        @SerializedName("totalRevenue")
        val totalRevenue: TotalRevenue?,
        @SerializedName("totalCashPerShare")
        val totalCashPerShare: TotalCashPerShare?,
        @SerializedName("financialCurrency")
        val financialCurrency: String?,
        @SerializedName("maxAge")
        val maxAge: Int?,
        @SerializedName("revenuePerShare")
        val revenuePerShare: RevenuePerShare?,
        @SerializedName("quickRatio")
        val quickRatio: QuickRatio?,
        @SerializedName("recommendationMean")
        val recommendationMean: RecommendationMean?
    ) {
        data class EbitdaMargins(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class ProfitMargins(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class GrossMargins(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class OperatingCashflow(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class RevenueGrowth(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class OperatingMargins(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class Ebitda(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class TargetLowPrice(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class GrossProfits(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class FreeCashflow(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class TargetMedianPrice(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class CurrentPrice(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        class EarningsGrowth(
        )

        data class CurrentRatio(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class ReturnOnAssets(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class NumberOfAnalystOpinions(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class TargetMeanPrice(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class DebtToEquity(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class ReturnOnEquity(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class TargetHighPrice(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class TotalCash(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class TotalDebt(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class TotalRevenue(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class TotalCashPerShare(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class RevenuePerShare(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class QuickRatio(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class RecommendationMean(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )
    }

    data class QuoteType(
        @SerializedName("exchange")
        val exchange: String?,
        @SerializedName("shortName")
        val shortName: String?,
        @SerializedName("longName")
        val longName: String?,
        @SerializedName("exchangeTimezoneName")
        val exchangeTimezoneName: String?,
        @SerializedName("exchangeTimezoneShortName")
        val exchangeTimezoneShortName: String?,
        @SerializedName("isEsgPopulated")
        val isEsgPopulated: Boolean?,
        @SerializedName("gmtOffSetMilliseconds")
        val gmtOffSetMilliseconds: String?,
        @SerializedName("quoteType")
        val quoteType: String?,
        @SerializedName("symbol")
        val symbol: String?,
        @SerializedName("messageBoardId")
        val messageBoardId: String?,
        @SerializedName("market")
        val market: String?
    )

    data class InstitutionOwnership(
        @SerializedName("maxAge")
        val maxAge: Int?,
        @SerializedName("ownershipList")
        val ownershipList: List<Any?>?
    )

    data class CalendarEvents(
        @SerializedName("maxAge")
        val maxAge: Int?,
        @SerializedName("earnings")
        val earnings: Earnings?,
        @SerializedName("exDividendDate")
        val exDividendDate: ExDividendDate?,
        @SerializedName("dividendDate")
        val dividendDate: DividendDate?
    ) {
        data class Earnings(
            @SerializedName("earningsDate")
            val earningsDate: List<EarningsDate?>?,
            @SerializedName("earningsAverage")
            val earningsAverage: EarningsAverage?,
            @SerializedName("earningsLow")
            val earningsLow: EarningsLow?,
            @SerializedName("earningsHigh")
            val earningsHigh: EarningsHigh?,
            @SerializedName("revenueAverage")
            val revenueAverage: RevenueAverage?,
            @SerializedName("revenueLow")
            val revenueLow: RevenueLow?,
            @SerializedName("revenueHigh")
            val revenueHigh: RevenueHigh?
        ) {
            data class EarningsDate(
                @SerializedName("raw")
                val raw: Int?,
                @SerializedName("fmt")
                val fmt: String?
            )

            data class EarningsAverage(
                @SerializedName("raw")
                val raw: Double?,
                @SerializedName("fmt")
                val fmt: String?
            )

            data class EarningsLow(
                @SerializedName("raw")
                val raw: Double?,
                @SerializedName("fmt")
                val fmt: String?
            )

            data class EarningsHigh(
                @SerializedName("raw")
                val raw: Double?,
                @SerializedName("fmt")
                val fmt: String?
            )

            data class RevenueAverage(
                @SerializedName("raw")
                val raw: Int?,
                @SerializedName("fmt")
                val fmt: String?,
                @SerializedName("longFmt")
                val longFmt: String?
            )

            data class RevenueLow(
                @SerializedName("raw")
                val raw: Int?,
                @SerializedName("fmt")
                val fmt: String?,
                @SerializedName("longFmt")
                val longFmt: String?
            )

            data class RevenueHigh(
                @SerializedName("raw")
                val raw: Int?,
                @SerializedName("fmt")
                val fmt: String?,
                @SerializedName("longFmt")
                val longFmt: String?
            )
        }

        class ExDividendDate(
        )

        class DividendDate(
        )
    }

    data class SummaryDetail(
        @SerializedName("previousClose")
        val previousClose: PreviousClose?,
        @SerializedName("regularMarketOpen")
        val regularMarketOpen: RegularMarketOpen?,
        @SerializedName("twoHundredDayAverage")
        val twoHundredDayAverage: TwoHundredDayAverage?,
        @SerializedName("trailingAnnualDividendYield")
        val trailingAnnualDividendYield: TrailingAnnualDividendYield?,
        @SerializedName("payoutRatio")
        val payoutRatio: PayoutRatio?,
        @SerializedName("volume24Hr")
        val volume24Hr: Volume24Hr?,
        @SerializedName("regularMarketDayHigh")
        val regularMarketDayHigh: RegularMarketDayHigh?,
        @SerializedName("navPrice")
        val navPrice: NavPrice?,
        @SerializedName("averageDailyVolume10Day")
        val averageDailyVolume10Day: AverageDailyVolume10Day?,
        @SerializedName("totalAssets")
        val totalAssets: TotalAssets?,
        @SerializedName("regularMarketPreviousClose")
        val regularMarketPreviousClose: RegularMarketPreviousClose?,
        @SerializedName("fiftyDayAverage")
        val fiftyDayAverage: FiftyDayAverage?,
        @SerializedName("trailingAnnualDividendRate")
        val trailingAnnualDividendRate: TrailingAnnualDividendRate?,
        @SerializedName("open")
        val `open`: Open?,
        @SerializedName("toCurrency")
        val toCurrency: Any?,
        @SerializedName("averageVolume10days")
        val averageVolume10days: AverageVolume10days?,
        @SerializedName("expireDate")
        val expireDate: ExpireDate?,
        @SerializedName("yield")
        val yield: Yield?,
        @SerializedName("algorithm")
        val algorithm: Any?,
        @SerializedName("dividendRate")
        val dividendRate: DividendRate?,
        @SerializedName("exDividendDate")
        val exDividendDate: ExDividendDate?,
        @SerializedName("beta")
        val beta: Beta?,
        @SerializedName("circulatingSupply")
        val circulatingSupply: CirculatingSupply?,
        @SerializedName("startDate")
        val startDate: StartDate?,
        @SerializedName("regularMarketDayLow")
        val regularMarketDayLow: RegularMarketDayLow?,
        @SerializedName("priceHint")
        val priceHint: PriceHint?,
        @SerializedName("currency")
        val currency: String?,
        @SerializedName("regularMarketVolume")
        val regularMarketVolume: RegularMarketVolume?,
        @SerializedName("lastMarket")
        val lastMarket: Any?,
        @SerializedName("maxSupply")
        val maxSupply: MaxSupply?,
        @SerializedName("openInterest")
        val openInterest: OpenInterest?,
        @SerializedName("marketCap")
        val marketCap: MarketCap?,
        @SerializedName("volumeAllCurrencies")
        val volumeAllCurrencies: VolumeAllCurrencies?,
        @SerializedName("strikePrice")
        val strikePrice: StrikePrice?,
        @SerializedName("averageVolume")
        val averageVolume: AverageVolume?,
        @SerializedName("priceToSalesTrailing12Months")
        val priceToSalesTrailing12Months: PriceToSalesTrailing12Months?,
        @SerializedName("dayLow")
        val dayLow: DayLow?,
        @SerializedName("ask")
        val ask: Ask?,
        @SerializedName("ytdReturn")
        val ytdReturn: YtdReturn?,
        @SerializedName("askSize")
        val askSize: AskSize?,
        @SerializedName("volume")
        val volume: Volume?,
        @SerializedName("fiftyTwoWeekHigh")
        val fiftyTwoWeekHigh: FiftyTwoWeekHigh?,
        @SerializedName("forwardPE")
        val forwardPE: ForwardPE?,
        @SerializedName("maxAge")
        val maxAge: Int?,
        @SerializedName("fromCurrency")
        val fromCurrency: Any?,
        @SerializedName("fiveYearAvgDividendYield")
        val fiveYearAvgDividendYield: FiveYearAvgDividendYield?,
        @SerializedName("fiftyTwoWeekLow")
        val fiftyTwoWeekLow: FiftyTwoWeekLow?,
        @SerializedName("bid")
        val bid: Bid?,
        @SerializedName("tradeable")
        val tradeable: Boolean?,
        @SerializedName("dividendYield")
        val dividendYield: DividendYield?,
        @SerializedName("bidSize")
        val bidSize: BidSize?,
        @SerializedName("dayHigh")
        val dayHigh: DayHigh?
    ) {
        data class PreviousClose(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class RegularMarketOpen(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class TwoHundredDayAverage(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        class TrailingAnnualDividendYield(
        )

        data class PayoutRatio(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?
        )

        class Volume24Hr(
        )

        data class RegularMarketDayHigh(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        class NavPrice(
        )

        data class AverageDailyVolume10Day(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        class TotalAssets(
        )

        data class RegularMarketPreviousClose(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class FiftyDayAverage(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        class TrailingAnnualDividendRate(
        )

        data class Open(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class AverageVolume10days(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        class ExpireDate(
        )

        class Yield(
        )

        class DividendRate(
        )

        class ExDividendDate(
        )

        data class Beta(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        class CirculatingSupply(
        )

        class StartDate(
        )

        data class RegularMarketDayLow(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class PriceHint(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class RegularMarketVolume(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        class MaxSupply(
        )

        class OpenInterest(
        )

        data class MarketCap(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        class VolumeAllCurrencies(
        )

        class StrikePrice(
        )

        data class AverageVolume(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class PriceToSalesTrailing12Months(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class DayLow(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class Ask(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        class YtdReturn(
        )

        data class AskSize(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class Volume(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class FiftyTwoWeekHigh(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class ForwardPE(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        class FiveYearAvgDividendYield(
        )

        data class FiftyTwoWeekLow(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        data class Bid(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )

        class DividendYield(
        )

        data class BidSize(
            @SerializedName("raw")
            val raw: Int?,
            @SerializedName("fmt")
            val fmt: String?,
            @SerializedName("longFmt")
            val longFmt: String?
        )

        data class DayHigh(
            @SerializedName("raw")
            val raw: Double?,
            @SerializedName("fmt")
            val fmt: String?
        )
    }

    class EsgScores(
    )

    data class UpgradeDowngradeHistory(
        @SerializedName("history")
        val history: List<History?>?,
        @SerializedName("maxAge")
        val maxAge: Int?
    ) {
        data class History(
            @SerializedName("epochGradeDate")
            val epochGradeDate: Int?,
            @SerializedName("firm")
            val firm: String?,
            @SerializedName("toGrade")
            val toGrade: String?,
            @SerializedName("fromGrade")
            val fromGrade: String?,
            @SerializedName("action")
            val action: String?
        )
    }

    data class PageViews(
        @SerializedName("shortTermTrend")
        val shortTermTrend: String?,
        @SerializedName("midTermTrend")
        val midTermTrend: String?,
        @SerializedName("longTermTrend")
        val longTermTrend: String?,
        @SerializedName("maxAge")
        val maxAge: Int?
    )
}