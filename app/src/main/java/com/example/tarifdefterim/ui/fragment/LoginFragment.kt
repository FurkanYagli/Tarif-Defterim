package com.example.tarifdefterim.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.tarifdefterim.R
import com.example.tarifdefterim.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

     override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

         binding = FragmentLoginBinding.inflate(inflater, container, false)
         binding.button.setOnClickListener {
             Navigation.findNavController(it).navigate(R.id.LogindenRegistera)
         }
        return binding.root
    }
}