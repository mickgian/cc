package me.mickgian.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import me.mickgian.common.base.BaseViewModel
import me.mickgian.common.utils.ResourcesProvider
import me.mickgian.model.MarketSummaryResponse.MarketSummaryResponse.Market
import me.mickgian.repository.FinanceRepository
import java.util.Locale
import java.util.concurrent.TimeUnit


const val COUNTRY = "US"
const val TAG = "HomeViewModel"

/**
 * A simple [BaseViewModel] that provide the data and handle logic to communicate with the model
 * for [HomeFragment].
 */
class HomeViewModel(
    private val financeRepository: FinanceRepository,
    private val resourcesProvider: ResourcesProvider
) : BaseViewModel() {

    private var disposable: Disposable? = null
    private val marketList = MutableLiveData<MutableList<Market>>()

    private val _filteredMarketList = MutableLiveData<MutableList<Market>>()
    val filteredMarketList: LiveData<MutableList<Market>> get() = _filteredMarketList

    private val _query = MutableLiveData<String>().apply { value = "" }
    val query: LiveData<String> get() = _query

    fun fetchMarkets() {
        disposable = financeRepository.getMarketSummary(COUNTRY)
            .subscribeOn(Schedulers.io())
            .repeatWhen { completed -> completed.delay(8, TimeUnit.SECONDS) }
            .observeOn(AndroidSchedulers.mainThread())
            .doOnError { _error -> Log.e(TAG, _error.message.toString()) }
            .subscribe { marketResponse ->
                marketList.value = marketResponse.marketSummaryResponse.marketList
                filterMarkets(query.value)
            }
    }

    fun marketClicksOnItem(market: Market) {
        market.symbol?.let { marketSymbolString ->
            navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment(marketSymbolString))
        }
    }

    fun filterMarkets(query: String?) {
        if(marketList.value != null && query != null) {
            _filteredMarketList.value =
            when (query.isEmpty()) {
                true -> marketList.value
                else -> {
                    val filteredList = mutableListOf<Market>()
                    for (market in marketList.value!!) {
                        market.fullExchangeName.let { fullExchangeName ->
                            if (fullExchangeName.toLowerCase(Locale.ROOT).contains(query)) filteredList.add(market)
                        }
                    }
                    filteredList
                }
            }
        }
    }

    fun setQuery(newValue: String) {
        _query.value = newValue
    }

    fun getResourceProvider() : ResourcesProvider {
        return resourcesProvider
    }

}