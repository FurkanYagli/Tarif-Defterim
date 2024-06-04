package com.example.tarifdefterim.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tarifdefterim.data.entity.Kategoriler
import com.example.tarifdefterim.data.entity.Yemekler
import com.example.tarifdefterim.data.repo.YemeklerRepository
import javax.inject.Inject

class KategoriDetayViewModel@Inject constructor(var yrepo: YemeklerRepository) : ViewModel() {
    var kategorilerlistesi = MutableLiveData<List<Kategoriler>>()
    var yemeklerlistesi = MutableLiveData<List<Yemekler>>()
    /*init {
        KategoriGetir(kategoriId = "")
    }*/

    fun KategoriGetir(kategoriId:String){
        yemeklerlistesi = yrepo.yemekleriYukle()
    }
}