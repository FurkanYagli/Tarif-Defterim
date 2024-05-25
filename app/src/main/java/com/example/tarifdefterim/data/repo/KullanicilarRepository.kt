package com.example.tarifdefterim.data.repo

import android.net.Uri
import androidx.lifecycle.MutableLiveData
import com.example.tarifdefterim.data.datasource.KullanicilarDataSource
import com.example.tarifdefterim.data.datasource.YemeklerDataSource
import com.example.tarifdefterim.data.entity.Kullanicilar
import com.example.tarifdefterim.databinding.FragmentLoginBinding

class KullanicilarRepository(var kds: KullanicilarDataSource)  {

    fun girisYap(mail: String, sifre: String)/*: MutableLiveData<List<Kullanicilar>>*/ = kds.girisYap(mail, sifre)
    fun kayitOl(ad:String, soyad:String, mail:String, sifre:String, sifreTekrar:String) = kds.kayitOl(ad, soyad, mail, sifre, sifreTekrar)


}