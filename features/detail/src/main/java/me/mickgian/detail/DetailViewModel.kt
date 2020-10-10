package me.mickgian.detail


import io.reactivex.disposables.Disposable
import me.mickgian.common.base.BaseViewModel
import me.mickgian.repository.FinanceRepository


/**
 * A simple [BaseViewModel] that provide the data and handle logic to communicate with the model
 * for [DetailFragment].
 */
class DetailViewModel(
    private val financeRepository: FinanceRepository
): BaseViewModel() {

    private var disposable: Disposable? = null

}