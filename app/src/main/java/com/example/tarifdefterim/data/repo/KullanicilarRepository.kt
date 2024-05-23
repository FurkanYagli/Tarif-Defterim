package com.example.tarifdefterim.data.repo

import android.net.Uri
import com.example.tarifdefterim.data.datasource.KullanicilarDataSource
import com.example.tarifdefterim.data.datasource.YemeklerDataSource
import com.example.tarifdefterim.databinding.FragmentLoginBinding

class KullanicilarRepository(var kds: KullanicilarDataSource)  {

    suspend fun girisYap(mail: String, sifre: String) = kds.girisYap(mail, sifre)
    suspend fun kayitOl(ad:String, soyad:String, mail:String, sifre:String, sifreTekrar:String) = kds.kayitOl(ad, soyad, mail, sifre, sifreTekrar)


}