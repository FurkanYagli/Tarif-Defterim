package com.example.tarifdefterim.data.repo

import androidx.lifecycle.MutableLiveData
import com.example.tarifdefterim.data.datasource.KategorilerDataSource
import com.example.tarifdefterim.data.datasource.YemeklerDataSource
import com.example.tarifdefterim.data.entity.Kategoriler
import com.example.tarifdefterim.data.entity.Yemekler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class YemeklerRepository(var yds:YemeklerDataSource, var kds:KategorilerDataSource) {


    fun yemekleriYukle(): MutableLiveData<List<Yemekler>> = yds.yemekleriYukle()

    fun kategorileriYukle():MutableLiveData<List<Kategoriler>> = kds.kategorileriYukle()

    fun ara(aramaKelimesi: String):MutableLiveData<List<Yemekler>> = yds.ara(aramaKelimesi)

    fun kategoriGetir(kategoriId: String):MutableLiveData<List<Yemekler>> = yds.kategoriyeGoreYemekleriYukle(kategoriId)
}