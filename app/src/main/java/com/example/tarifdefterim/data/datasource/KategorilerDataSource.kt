package com.example.tarifdefterim.data.datasource

import androidx.lifecycle.MutableLiveData
import com.example.tarifdefterim.data.entity.Kategoriler
import com.example.tarifdefterim.data.entity.Yemekler
import com.google.firebase.firestore.CollectionReference

class KategorilerDataSource(var collectionKategoriler: CollectionReference) {
    var kategorilerlistesi = MutableLiveData<List<Kategoriler>>()


    fun kategorileriYukle(): MutableLiveData<List<Kategoriler>> {
        collectionKategoriler.addSnapshotListener { value, error ->
            if(value != null){
                val liste = ArrayList<Kategoriler>()

                for (d in value.documents){
                    val kategori = d.toObject(Kategoriler::class.java)
                    if (kategori != null){
                        kategori.kategori_id = d.id
                        liste.add(kategori)
                    }
                }
                kategorilerlistesi.value = liste
            }
        }
        return kategorilerlistesi
    }
}