package com.example.tarifdefterim.data.datasource

import com.example.tarifdefterim.data.entity.Kategoriler
import com.example.tarifdefterim.data.entity.Yemekler
import com.google.firebase.firestore.CollectionReference
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class YemeklerDataSource(var collectionYemekler: CollectionReference)  {

    fun yemekleriYukle():List<Yemekler>{
        return listOf()
    }

    fun kategorileriYukle():List<Kategoriler> {
        return listOf()
    }

    fun ara(aramaKelimesi: String):List<Yemekler> {
        return listOf()
    }

}