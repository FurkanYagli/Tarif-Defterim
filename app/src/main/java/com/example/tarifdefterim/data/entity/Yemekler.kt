package com.example.tarifdefterim.data.entity

import java.io.Serializable

data class Yemekler(var yemek_id:Int, var yemek_ad:String, var yemek_kategori: Int, var yemek_malzemeler:String, var yemek_tarif:String) : Serializable {


}