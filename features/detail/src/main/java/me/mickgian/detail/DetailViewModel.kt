package me.mickgian.detail


import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import me.mickgian.common.base.BaseViewModel
import me.mickgian.model.Stock
import me.mickgian.repository.FinanceRepository
import java.util.concurrent.TimeUnit

const val TAG = "DetailViewModel"

/**
 * A simple [BaseViewModel] that provide the data and handle logic to communicate with the model
 * for [DetailFragment].
 */
class DetailViewModel(
    private val financeRepository: FinanceRepository
): BaseViewModel() {

    private var disposable: Disposable? = null
    private val stock = MutableLiveData<Stock>()

    private val _symbol = MutableLiveData<String>()
    val symbol: LiveData<String> get() = _symbol

    private val _shortName = MutableLiveData<String>()
    val shortName: LiveData<String> get() = _shortName

    private val _regularMarketPrice = MutableLiveData<String>()
    val regularMarketPrice: LiveData<String> get() = _regularMarketPrice

    private val _regularMarketChange = MutableLiveData<String>()
    val regularMarketChange: LiveData<String> get() = _regularMarketChange

    private val _regularMarketChangePercent = MutableLiveData<String>()
    val regularMarketChangePercent: LiveData<String> get() = _regularMarketChangePercent

    private val _isPricePositive = MutableLiveData<Boolean>()
    val isPricePositive: LiveData<Boolean> get() = _isPricePositive


    fun loadDataWhenFragmentStarts(marketSymbolString: String) {
        fetchStock(marketSymbolString)
    }

    private fun fetchStock(stockSymbolString: String) {
        disposable = financeRepository.getStockSummary(stockSymbolString)
            .subscribeOn(Schedulers.io())
            .repeatWhen { completed -> completed.delay(8, TimeUnit.SECONDS) }
            .observeOn(AndroidSchedulers.mainThread())
            .doOnError { _error -> Log.e(TAG, _error.message.toString()) }
            .subscribe { stockResponse ->
                stock.value = stockResponse
                _symbol.value = stockResponse.symbol
                _shortName.value = stockResponse.quoteType?.shortName
                _regularMarketPrice.value = stockResponse.price?.regularMarketPrice?.fmt
                _regularMarketChange.value = setTextValue(stockResponse.price?.regularMarketChange?.fmt ?: "-")
                _regularMarketChangePercent.value = setTextValue(stockResponse.price?.regularMarketChangePercent?.fmt ?: "-")
            }
    }

    private fun setTextValue(fmt: String): String {
        return if (fmt.startsWith("-")){
            _isPricePositive.value = false
            fmt
        }else{
            _isPricePositive.value = true
            "+$fmt"
        }
    }


}