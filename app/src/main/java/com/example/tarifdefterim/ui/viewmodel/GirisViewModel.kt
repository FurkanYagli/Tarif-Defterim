package com.example.tarifdefterim.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import com.example.tarifdefterim.R
import com.example.tarifdefterim.data.entity.Kategoriler
import com.example.tarifdefterim.data.entity.Kullanicilar
import com.example.tarifdefterim.data.repo.KullanicilarRepository
import com.example.tarifdefterim.data.repo.YemeklerRepository
import com.example.tarifdefterim.util.gecisYap
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GirisViewModel @Inject constructor(var krepo: KullanicilarRepository) : ViewModel() {
    var kategorilerlistesi = MutableLiveData<List<Kategoriler>>()
    var kullanicilarlistesi = MutableLiveData<List<Kullanicilar>>()



    fun girisYap(mail: String, sifre: String){
       kullanicilarlistesi = krepo.girisYap(mail, sifre)

    }

}