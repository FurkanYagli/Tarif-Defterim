package com.example.tarifdefterim.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.tarifdefterim.data.repo.KullanicilarRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GirisViewModel : ViewModel() {

    var krepo = KullanicilarRepository()

    fun girisYap(){
        CoroutineScope(Dispatchers.Main).launch {
            krepo.girisYap()
        }
    }

}