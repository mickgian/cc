package me.mickgian.home.views

import androidx.recyclerview.widget.DiffUtil
import me.mickgian.model.MarketSummaryResponse.MarketSummaryResponse.Market

class MarketDiffCallback (private val oldList: List<Market>,
                          private val newList: List<Market>)
    : DiffUtil.Callback() {

    override fun getOldListSize() = oldList.size

    override fun getNewListSize() = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
        oldList[oldItemPosition] == newList[newItemPosition]

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }
}