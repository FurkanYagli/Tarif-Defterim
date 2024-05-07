package com.example.tarifdefterim.data.repo

import com.example.tarifdefterim.data.datasource.YemeklerDataSource
import com.example.tarifdefterim.data.entity.Yemekler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class YemeklerRepository {

    var yds = YemeklerDataSource()

    suspend fun yemekleriYukle():List<Yemekler> = yds.yemekleriYukle()

    suspend fun ara(aramaKelimesi: String):List<Yemekler> = yds.ara(aramaKelimesi)
}