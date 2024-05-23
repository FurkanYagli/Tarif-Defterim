package com.example.tarifdefterim.data.entity

import java.io.Serializable

data class Yemekler(var yemek_id:String? = "",
                    var yemek_ad:String? = "",
                    var yemek_kategori:String? = "",
                    var yemek_malzemeler:String? = "",
                    var yemek_tarif:String? = ""
) : Serializable {


}