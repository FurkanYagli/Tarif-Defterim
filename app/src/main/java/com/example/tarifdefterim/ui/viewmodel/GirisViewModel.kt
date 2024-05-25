package com.example.tarifdefterim.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tarifdefterim.data.entity.Kategoriler
import com.example.tarifdefterim.data.repo.KullanicilarRepository
import com.example.tarifdefterim.data.repo.YemeklerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GirisViewModel @Inject constructor(var krepo: KullanicilarRepository) : ViewModel() {
    var kategorilerlistesi = MutableLiveData<List<Kategoriler>>()

    fun girisYap(mail: String, sifre: String)/*:Boolean*/{
        krepo.girisYap(mail, sifre)
         /*kategorilerlistesi = krepo.girisYap(mail, sifre)

        if (kategorilerlistesi != null){
            if (kategorilerlistesi.value!!.size == 1 ){
                return true
            }else{return false}
        }else{
            return false
        }*/

    }

}