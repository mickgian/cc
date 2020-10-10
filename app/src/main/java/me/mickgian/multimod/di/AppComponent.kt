package me.mickgian.multimod.di

import me.mickgian.detail.di.featureDetailModule
import me.mickgian.home.di.featureHomeModule
import me.mickgian.network.di.networkModule
import me.mickgian.repository.di.repositoryModule

val appComponent= listOf(
    networkModule,
    repositoryModule,
    featureHomeModule,
    featureDetailModule
)