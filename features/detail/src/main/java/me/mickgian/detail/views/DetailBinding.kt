package me.mickgian.detail.views

import android.util.Log
import androidx.databinding.BindingAdapter
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import me.mickgian.common.network.Resource

object DetailBinding {

    @BindingAdapter("app:showWhenLoading")
    @JvmStatic
    fun showWhenLoading(view: SwipeRefreshLayout, status: Resource.Status?) {
        Log.d(DetailBinding::class.java.simpleName, "Status: $status")
        status?.let {
            view.isRefreshing = it == Resource.Status.LOADING
        }
    }

}