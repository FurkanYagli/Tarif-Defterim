package com.example.tarifdefterim.data.datasource

import androidx.navigation.Navigation
import com.example.tarifdefterim.R

class KullanicilarDataSource {

    suspend fun girisYap(ad:String,sifre:String){
        Navigation.findNavController(binding.button).navigate(R.id.LogindenRegistera)
    }
}