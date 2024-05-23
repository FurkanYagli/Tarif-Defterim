package com.example.tarifdefterim.data.entity

import java.io.Serializable

data class Kullanicilar(var kullanici_id:String? = "",
                   var kullanici_ad:String? = "",
                   var kullanici_soyad:String? = "",
                   var kullanici_mail:String? = "",
                   var kullanici_sifre:String? = ""
) : Serializable {


}