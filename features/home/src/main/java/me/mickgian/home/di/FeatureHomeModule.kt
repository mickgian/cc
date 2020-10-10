package me.mickgian.home.di

import me.mickgian.home.HomeViewModel
import me.mickgian.home.views.MarketAdapter
import me.mickgian.model.MarketSummaryResponse.MarketSummaryResponse.Market
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val featureHomeModule = module {
    factory { MarketAdapter( androidContext(), emptyList<Market>() as ArrayList<Market>, get() ) }
    viewModel { HomeViewModel( get() ) }
}