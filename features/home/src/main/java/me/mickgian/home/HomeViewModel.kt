package me.mickgian.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import me.mickgian.common.base.BaseViewModel
import me.mickgian.model.MarketSummaryResponse.MarketSummaryResponse.Market
import me.mickgian.repository.FinanceRepository
import java.util.concurrent.TimeUnit


const val COUNTRY = "US"
const val TAG = "HomeViewModel"

/**
 * A simple [BaseViewModel] that provide the data and handle logic to communicate with the model
 * for [HomeFragment].
 */
class HomeViewModel(
    private val financeRepository: FinanceRepository
) : BaseViewModel() {

    private var disposable: Disposable? = null

    private val _marketList = MutableLiveData<MutableList<Market>>()
    val marketList: LiveData<MutableList<Market>> get() = _marketList

    private val _filteredMarketList = MutableLiveData<MutableList<Market>>()
    val filteredMarketList: LiveData<MutableList<Market>> get() = _filteredMarketList

    fun fetchMarkets() {
        disposable = financeRepository.getMarketSummary(COUNTRY)
            .subscribeOn(Schedulers.io())
            .repeatWhen { completed -> completed.delay(8, TimeUnit.SECONDS) }
            .observeOn(AndroidSchedulers.mainThread())
            .doOnError { _error -> Log.e(TAG, _error.message.toString()) }
            .subscribe { marketResponse ->
                _marketList.value = marketResponse.marketSummaryResponse.marketList
                filterMarkets("") //TODO: to be reactive, query value should be stored in a LiveData and observed from Fragment
            }
    }

    fun marketClicksOnItem(market: Market) {
        market.symbol?.let { stockSymbolString ->
            navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment(stockSymbolString))
        }
    }

    fun filterMarkets(query: String?) {
        if(marketList.value != null && query != null) {
            _filteredMarketList.value = if (query.isEmpty()) {
                marketList.value
            }
            else {
                val filteredList = mutableListOf<Market>()
                for (market in marketList.value!!) {
                    market.fullExchangeName.let { fullExchangeName ->
                        if (fullExchangeName.toLowerCase().contains(query)) filteredList.add(market)
                    }
                }
                filteredList
            }
        }

    }


}