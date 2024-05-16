package com.example.tarifdefterim.di

import com.example.tarifdefterim.data.datasource.KullanicilarDataSource
import com.example.tarifdefterim.data.datasource.YemeklerDataSource
import com.example.tarifdefterim.data.repo.KullanicilarRepository
import com.example.tarifdefterim.data.repo.YemeklerRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideKullanicilarDataSource() : KullanicilarDataSource {
        return KullanicilarDataSource()
    }
    @Provides
    @Singleton
    fun provideYemeklerDataSource() : YemeklerDataSource {
        return YemeklerDataSource()
    }
    @Provides
    @Singleton
    fun provideKullanicilarRepository(kds:KullanicilarDataSource) : KullanicilarRepository {
        return KullanicilarRepository(kds)
    }
    @Provides
    @Singleton
    fun provideYemeklerRepository(yds:YemeklerDataSource) : YemeklerRepository {
        return YemeklerRepository(yds)
    }
}