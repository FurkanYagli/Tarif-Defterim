package com.example.tarifdefterim.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.tarifdefterim.data.repo.KullanicilarRepository
import com.example.tarifdefterim.data.repo.YemeklerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class KayitViewModel @Inject constructor(var krepo: KullanicilarRepository) : ViewModel() {


    fun kayitOl(){
        CoroutineScope(Dispatchers.Main).launch {
            krepo.kayitOl()
        }
    }
}