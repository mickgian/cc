package me.mickgian.home.views

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import me.mickgian.home.HomeViewModel
import me.mickgian.home.R
import me.mickgian.home.databinding.RowMarketBinding
import me.mickgian.model.MarketSummaryResponse.MarketSummaryResponse.Market

class MarketAdapter(
    var context: Context,
    var marketList: ArrayList<Market>,
    var homeViewModel: HomeViewModel
) : RecyclerView.Adapter<MarketAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.row_market, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.market = marketList[position]
        holder.binding.viewModel = homeViewModel

        if (marketList[position].fullExchangeName != null) {

            holder.itemView.visibility = View.VISIBLE
            holder.itemView.layoutParams =
                RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

            holder.textViewTitle.text = marketList[position].fullExchangeName
            holder.textViewDescription.text = marketList[position].regularMarketPrice?.fmt ?: "-"
        } else {
            holder.itemView.visibility = View.GONE
            holder.itemView.layoutParams = RecyclerView.LayoutParams(0, 0)
        }
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return marketList.size
    }

    //the class is holding the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val binding = RowMarketBinding.bind(itemView)

        val textViewTitle = itemView.findViewById(R.id.market_name) as TextView
        val textViewDescription  = itemView.findViewById(R.id.market_price) as TextView
    }
}