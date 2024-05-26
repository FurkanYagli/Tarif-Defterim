package com.example.tarifdefterim.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tarifdefterim.data.entity.Kategoriler
import com.example.tarifdefterim.data.entity.Yemekler
import com.example.tarifdefterim.data.repo.YemeklerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnasayfaViewModel @Inject constructor(var yrepo:YemeklerRepository) : ViewModel() {
    var yemeklerlistesi = MutableLiveData<List<Yemekler>>()
    var kategorilerlistesi = MutableLiveData<List<Kategoriler>>()

    init {
        yemekleriYukle()
        kategorileriYukle()
    }

    fun yemekleriYukle(){
        yemeklerlistesi = yrepo.yemekleriYukle()
    }
    fun kategorileriYukle(){
     //  kategorilerlistesi = yrepo.kategorileriYukle()
      //  yrepo.kategorileriYukle()
    }

    fun ara(aramaKelimesi: String) {
        yemeklerlistesi = yrepo.ara(aramaKelimesi)
    }
}