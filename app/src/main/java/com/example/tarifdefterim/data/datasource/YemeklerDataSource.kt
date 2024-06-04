package com.example.tarifdefterim.data.datasource

import androidx.lifecycle.MutableLiveData
import com.example.tarifdefterim.data.entity.Kategoriler
import com.example.tarifdefterim.data.entity.Yemekler
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.toObject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class YemeklerDataSource(var collectionYemekler: CollectionReference)  {
    var yemeklerlistesi = MutableLiveData<List<Yemekler>>()
    var kategorilerlistesi = MutableLiveData<List<Kategoriler>>()

    fun yemekleriYukle():MutableLiveData<List<Yemekler>>{
        collectionYemekler.addSnapshotListener { value, error ->
            if(value != null){
                val liste = ArrayList<Yemekler>()
                for (d in value.documents){
                    val yemek = d.toObject(Yemekler::class.java)
                    if (yemek != null){
                        yemek.yemek_id = d.id
                        liste.add(yemek)
                    }
                }
                yemeklerlistesi.value = liste
            }
        }
        return yemeklerlistesi
    }


    fun kategoriyeGoreYemekleriYukle(kategoriId:String)/*:MutableLiveData<List<Yemekler>>*/{
        /*collectionYemekler.addSnapshotListener { value, error ->
            if(value != null){
                val liste = ArrayList<Yemekler>()

                for (d in value.documents){
                    val yemek = d.toObject(Yemekler::class.java)
                    if (yemek != null){
                        if (yemek.yemek_kategori!!.lowercase().contains(kategoriId.lowercase())){
                                                    liste.add(yemek)
                        }
                    }
                    yemeklerlistesi.value = liste
                }
            }

        }
        return yemeklerlistesi*/
    }


    fun ara(aramaKelimesi: String):MutableLiveData<List<Yemekler>> {
        collectionYemekler.addSnapshotListener { value, error ->
            if(value != null){
                val liste = ArrayList<Yemekler>()

                for (d in value.documents){
                    val yemek = d.toObject(Yemekler::class.java)
                    if (yemek != null){
                        if (yemek.yemek_ad!!.lowercase().contains(aramaKelimesi.lowercase())){
                        yemek.yemek_id = d.id
                        liste.add(yemek)
                    }
                }
                yemeklerlistesi.value = liste
            }
        }
    }
        return yemeklerlistesi
    }
}