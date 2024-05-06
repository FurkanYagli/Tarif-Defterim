package com.example.tarifdefterim.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.tarifdefterim.R
import com.example.tarifdefterim.databinding.FragmentTarifDetayBinding
import com.example.tarifdefterim.ui.viewmodel.TarifDetayViewModel

class TarifDetayFragment : Fragment() {

    private lateinit var binding: FragmentTarifDetayBinding
    private lateinit var viewModel: TarifDetayViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_tarif_detay, container,false)
        binding.tarifDetayFragment = this



        val bundle: TarifDetayFragmentArgs by navArgs()
        val gelenTarif = bundle.tarif

        binding.yemekNesnesi = gelenTarif


        return binding.root
    }
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val tempViewModel:TarifDetayViewModel by viewModels()
        viewModel = tempViewModel

    }

}