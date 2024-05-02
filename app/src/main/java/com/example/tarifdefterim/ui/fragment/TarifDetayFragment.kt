package com.example.tarifdefterim.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.tarifdefterim.R
import com.example.tarifdefterim.databinding.FragmentTarifDetayBinding

class TarifDetayFragment : Fragment() {

    private lateinit var binding: FragmentTarifDetayBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_tarif_detay, container,false)
        binding.tarifDetayFragment = this


        val bundle: TarifDetayFragmentArgs by navArgs()
        val gelenTarif = bundle.tarif

        binding.yemekNesnesi = gelenTarif


        return binding.root
    }

}