package com.example.tarifdefterim.data.repo

import com.example.tarifdefterim.data.datasource.KullanicilarDataSource

class KullanicilarRepository {
    var kds = KullanicilarDataSource()

    suspend fun girisYap(ad:String,sifre:String) = kds.girisYap(ad, sifre)

    }