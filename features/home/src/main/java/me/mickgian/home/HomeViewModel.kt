package me.mickgian.home

import androidx.lifecycle.MutableLiveData
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import me.mickgian.common.base.BaseViewModel
import me.mickgian.model.MarketSummaryResponse
import me.mickgian.model.MarketSummaryResponse.MarketSummaryResponse.Market
import me.mickgian.repository.FinanceRepository


const val COUNTRY = "US"

/**
 * A simple [BaseViewModel] that provide the data and handle logic to communicate with the model
 * for [HomeFragment].
 */
class HomeViewModel(
    private val financeRepository: FinanceRepository
) : BaseViewModel() {

    private var disposable: Disposable? = null
    val factsListData by lazy { MutableLiveData<MarketSummaryResponse>() }

    fun fetchMarkets(): MutableLiveData<MarketSummaryResponse>{
        disposable = financeRepository.getMarketSummary(COUNTRY)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { reportResponse ->
                factsListData.setValue(reportResponse)
            }
        return factsListData
    }

    fun marketClicksOnItem(market: Market) {
        market.symbol?.let { symbol ->
            navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment(symbol))
        }
    }

}