package me.mickgian.detail.di

import me.mickgian.detail.DetailViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val featureDetailModule = module {
    viewModel { DetailViewModel( get() ) }
}