package com.example.tarifdefterim.di

import com.example.tarifdefterim.data.datasource.KullanicilarDataSource
import com.example.tarifdefterim.data.datasource.YemeklerDataSource
import com.example.tarifdefterim.data.repo.KullanicilarRepository
import com.example.tarifdefterim.data.repo.YemeklerRepository
import com.google.firebase.Firebase
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.firestore
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
    fun provideKullanicilarDataSource(collectionKullanicilar:CollectionReference) : KullanicilarDataSource {
        return KullanicilarDataSource(collectionKullanicilar)
    }
    @Provides
    @Singleton
    fun provideYemeklerDataSource(collectionYemekler:CollectionReference) : YemeklerDataSource {
        return YemeklerDataSource(collectionYemekler)
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
    @Provides
    @Singleton
    fun provideCollectionReference() : CollectionReference {
        return Firebase.firestore.collection("Kullancilar")
        return Firebase.firestore.collection("Yemekler")
    }
}