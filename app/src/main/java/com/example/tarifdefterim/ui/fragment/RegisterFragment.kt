package com.example.tarifdefterim.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.tarifdefterim.R
import com.example.tarifdefterim.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        binding = FragmentRegisterBinding.inflate(inflater,container,false)

        binding.button2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.registerMain)
        }

        return binding.root


    }

}