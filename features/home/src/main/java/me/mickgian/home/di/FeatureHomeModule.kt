package me.mickgian.home.di

import me.mickgian.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val featureHomeModule = module {
    viewModel { HomeViewModel( get() ) }
}