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

    private val _stock = MutableLiveData<Stock>()
    val stock: LiveData<Stock> get() = _stock

    fun loadDataWhenFragmentStarts(stockSymbolString: String) {
        fetchStock(stockSymbolString)
    }

    private fun fetchStock(stockSymbolString: String) {
        disposable = financeRepository.getStockSummary(stockSymbolString)
            .subscribeOn(Schedulers.io())
            .repeatWhen { completed -> completed.delay(8, TimeUnit.SECONDS) }
            .observeOn(AndroidSchedulers.mainThread())
            .doOnError { _error -> Log.e(TAG, _error.message.toString()) }
            .subscribe { stockResponse ->
                _stock.value = stockResponse
            }
    }


}