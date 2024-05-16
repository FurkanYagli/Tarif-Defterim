package com.example.tarifdefterim.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.example.tarifdefterim.R
import com.example.tarifdefterim.databinding.FragmentLoginBinding
import com.example.tarifdefterim.ui.viewmodel.GirisViewModel
import com.example.tarifdefterim.util.gecisYap

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    private lateinit var viewModel: GirisViewModel

     override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

         binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
         binding.loginFragment = this




        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val tempViewModel: GirisViewModel by viewModels()
        viewModel = tempViewModel

    }

    fun buttonGirisYap(){
        Navigation.gecisYap(binding.button,R.id.LogindenRegistera)

    }
}