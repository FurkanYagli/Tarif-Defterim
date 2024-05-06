package com.example.tarifdefterim.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tarifdefterim.data.entity.Yemekler
import com.example.tarifdefterim.data.repo.YemeklerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnasayfaViewModel : ViewModel() {
    var yrepo = YemeklerRepository()
    var yemeklerlistesi = MutableLiveData<List<Yemekler>>()

    init {
        yemekleriYukle()
    }

    fun yemekleriYukle(){
        CoroutineScope(Dispatchers.Main).launch {
            yemeklerlistesi.value = yrepo.yemekleriYukle()
        }
    }



}