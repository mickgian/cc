package me.mickgian.home.di

import me.mickgian.common.utils.ResourcesProvider
import me.mickgian.home.HomeViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val featureHomeModule = module {
    viewModel { HomeViewModel( get(), ResourcesProvider(androidContext()) ) }
}