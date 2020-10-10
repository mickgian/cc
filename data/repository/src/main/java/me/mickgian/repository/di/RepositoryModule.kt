package me.mickgian.repository.di

import me.mickgian.repository.*
import org.koin.dsl.module

val repositoryModule = module {
    factory { FinanceRepositoryImpl( get() ) as FinanceRepository }
}