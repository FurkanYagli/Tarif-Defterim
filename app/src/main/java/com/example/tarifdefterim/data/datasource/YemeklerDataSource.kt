package com.example.tarifdefterim.data.datasource

import com.example.tarifdefterim.data.entity.Kategoriler
import com.example.tarifdefterim.data.entity.Yemekler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class YemeklerDataSource {

    suspend fun yemekleriYukle():List<Yemekler> =
        withContext(Dispatchers.IO){
            val yemekListesi = ArrayList<Yemekler>()
            val y1 = Yemekler(2,"adana kebabı",1,"et, biber"," null")
            val y2 = Yemekler(3,"Kek",3,"Un,Yumurta,Süt","null")
            val y3 = Yemekler(4,"alinazik",1,
                "patlıcan,et,yoğurt,Sarımsak,pul biber,yağ",
                "patlıcanları közle, eti sotele , patlıcanları sarımsaklı yoğurtla harmanla ,eti karışımın üstüne koy" )
            yemekListesi.add(y1)
            yemekListesi.add(y2)
            yemekListesi.add(y3)

            return@withContext yemekListesi
        }
    suspend fun kategorileriYukle():List<Kategoriler> =
        withContext(Dispatchers.IO){
            val kategoriListesi = ArrayList<Kategoriler>()
            val k1 = Kategoriler(1,"Ana Yemek","karni_yarik_icon")
            val k2 = Kategoriler(2,"Çorba","soup_icon")
            val k3 = Kategoriler(3,"Tatlı","tatli_icon")
            kategoriListesi.add(k1)
            kategoriListesi.add(k2)
            kategoriListesi.add(k3)

            return@withContext kategoriListesi
        }
    suspend fun ara(aramaKelimesi: String):List<Yemekler> =
            withContext(Dispatchers.IO){
                val yemekListesi = ArrayList<Yemekler>()
                val y1 = Yemekler(2,"adana kebabı",1,"et, biber"," null")
                yemekListesi.add(y1)

                return@withContext yemekListesi
    }

}