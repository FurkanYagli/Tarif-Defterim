package com.example.tarifdefterim.ui.fragment

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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




        return binding.root


    }
   override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val tempViewModel: KayitViewModel by viewModels()
        viewModel = tempViewModel

    }
    fun buttonKayitOl(){
        Navigation.gecisYap(binding.button2,R.id.registerMain)
    }
}