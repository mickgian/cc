package me.mickgian.home.views

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import me.mickgian.model.MarketSummaryResponse.MarketSummaryResponse.Market

object MarketBindingAdapter {

    @BindingAdapter("app:refreshMarketList")
    @JvmStatic
    fun refreshMarketList(recyclerView: RecyclerView, marketList: List<Market>?) {
        with(recyclerView.adapter as MarketAdapter) {
            marketList?.let { originalData ->
                updateData(originalData)
            }
        }
    }

}