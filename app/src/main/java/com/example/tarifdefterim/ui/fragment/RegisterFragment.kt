package com.example.tarifdefterim.ui.fragment

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.example.tarifdefterim.R
import com.example.tarifdefterim.databinding.FragmentRegisterBinding
import com.example.tarifdefterim.ui.viewmodel.AnasayfaViewModel
import com.example.tarifdefterim.ui.viewmodel.KayitViewModel
import com.example.tarifdefterim.ui.viewmodel.TarifDetayViewModel
import com.example.tarifdefterim.util.gecisYap
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterFragment : Fragment() {
private lateinit var binding: FragmentRegisterBinding
private lateinit var viewModel: KayitViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_register, container,false)
        binding.registerFragment = this


        binding.button2.setOnClickListener {
            val ad = binding.textAd.text.toString()
            val soyad = binding.textSoyad.text.toString()
            val mail = binding.textMail.text.toString()
            val sifre = binding.textSifre.text.toString()
            val sifreTekrar = binding.textSifreTekrar.text.toString()
            buttonKontrol(ad, soyad, mail, sifre, sifreTekrar)
        }

        return binding.root


    }
   override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val tempViewModel: KayitViewModel by viewModels()
        viewModel = tempViewModel

    }
    //
    fun buttonKayitOl(ad:String, soyad:String, mail:String, sifre:String, sifreTekrar:String){
        viewModel.kayitOl(ad, soyad, mail, sifre, sifreTekrar)
        Navigation.gecisYap(binding.button2,R.id.registerLogin)
    }
    fun buttonKontrol(ad:String, soyad:String, mail:String, sifre:String, sifreTekrar:String){
        if (sifre.toString() == sifreTekrar.toString()){
            if (ad != null && soyad != null && mail != null && sifre != null && sifreTekrar != null){
                if (binding.checkBox.isChecked == true) {
                    buttonKayitOl(ad, soyad, mail, sifre, sifreTekrar)

                } else {
                    Toast.makeText(requireContext(), "Sözleşmeyi Kabul Etmelisiniz", Toast.LENGTH_LONG).show()
                }
            }else{
                Toast.makeText(requireContext(), "Eksik Bilgi Girdiniz", Toast.LENGTH_LONG).show()
            }
        }
        else{
            Toast.makeText(requireContext(), "Şifreler Aynı Olmalı", Toast.LENGTH_LONG).show()
        }
        
        viewModel.kayitOl(ad, soyad, mail, sifre, sifreTekrar)
      //  Navigation.gecisYap(binding.button2,R.id.registerMain)
    }
}