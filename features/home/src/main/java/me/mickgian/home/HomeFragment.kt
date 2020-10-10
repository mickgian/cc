package me.mickgian.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_home.*
import me.mickgian.common.base.BaseFragment
import me.mickgian.common.base.BaseViewModel
import me.mickgian.home.databinding.FragmentHomeBinding
import me.mickgian.home.views.MarketAdapter
import me.mickgian.model.MarketSummaryResponse.MarketSummaryResponse.Market
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * A simple [BaseFragment] subclass
 * that will show a list of top [User] from Github's API.
 */
class HomeFragment : BaseFragment() {

    private val homeViewModel: HomeViewModel by viewModel()
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var binding: FragmentHomeBinding
    private var marketList = arrayListOf<Market>()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.viewmodel = homeViewModel
        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpRecyclerView(marketList)

        getMarketList()

    }

    @SuppressLint("SetTextI18n")
    private fun getMarketList() {
        homeViewModel.fetchMarkets().observe(viewLifecycleOwner, Observer { factsListData ->
            setUpRecyclerView(factsListData.marketSummaryResponse.marketList)
        })
    }
    override fun getViewModel(): BaseViewModel = homeViewModel

    private fun setUpRecyclerView(marketList : ArrayList<Market>) {
        layoutManager = LinearLayoutManager(requireContext())
        marketRecyclerView.layoutManager = layoutManager
        marketRecyclerView.adapter = MarketAdapter(requireContext(), marketList, homeViewModel)
    }

}
