package me.mickgian.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*
import me.mickgian.common.base.BaseFragment
import me.mickgian.common.base.BaseViewModel
import me.mickgian.home.databinding.FragmentHomeBinding
import me.mickgian.home.views.MarketAdapter
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * A simple [BaseFragment] subclass
 * that will show a list of top [User] from Github's API.
 */
class HomeFragment : BaseFragment(), SearchView.OnQueryTextListener {

    private val homeViewModel: HomeViewModel by viewModel()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.viewModel = homeViewModel
        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        stock_search.setOnQueryTextListener(this)
        configureRecyclerView()
        observeQueryValue()

        homeViewModel.fetchMarkets()
    }

    override fun onQueryTextSubmit(query: String): Boolean {
        homeViewModel.setQuery(query)
        return true
    }

    override fun onQueryTextChange(query: String): Boolean {
        homeViewModel.setQuery(query)
        return true
    }

    override fun getViewModel(): BaseViewModel = homeViewModel

    private fun observeQueryValue() {
        homeViewModel.query.observe(viewLifecycleOwner, Observer {queryValue ->
            homeViewModel.filterMarkets(queryValue)
        })
    }

    private fun configureRecyclerView() {
        market_recycler_view.adapter = MarketAdapter(homeViewModel)
        market_recycler_view.addItemDecoration(
            DividerItemDecoration(context, LinearLayoutManager.HORIZONTAL)
        )
    }

}
