package com.example.tarifdefterim.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.tarifdefterim.R
import com.example.tarifdefterim.databinding.FragmentTarifDetayBinding

class TarifDetayFragment : Fragment() {

    private lateinit var binding: FragmentTarifDetayBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentTarifDetayBinding.inflate(inflater,container,false)

        val bundle: TarifDetayFragmentArgs by navArgs()
        val gelenTarif = bundle.tarif

        binding.textAd.text = gelenTarif.yemek_ad.toString()
        binding.textTarif.text = gelenTarif.yemek_tarif.toString()
        binding.textTarif.text = gelenTarif.yemek_malzemeler.toString()

        return inflater.inflate(R.layout.fragment_tarif_detay, container, false)
    }

}