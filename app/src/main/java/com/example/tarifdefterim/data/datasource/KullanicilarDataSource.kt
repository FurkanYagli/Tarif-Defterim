package com.example.tarifdefterim.data.datasource

import android.net.Uri
import androidx.navigation.Navigation
import com.example.tarifdefterim.R
import com.example.tarifdefterim.data.entity.Kullanicilar
import com.example.tarifdefterim.databinding.FragmentLoginBinding
import com.google.firebase.firestore.CollectionReference

class KullanicilarDataSource(var collectionKullanicilar:CollectionReference) {
    fun girisYap(mail: String, sifre: String){

    }

    fun kayitOl(ad:String, soyad:String, mail:String, sifre:String, sifreTekrar:String){
        val yeniKullanici = Kullanicilar(kullanici_id = "", ad, soyad, mail, sifre)
        collectionKullanicilar.document().set(yeniKullanici)
    }


}