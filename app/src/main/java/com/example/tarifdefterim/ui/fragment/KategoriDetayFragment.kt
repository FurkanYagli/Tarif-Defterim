package com.example.tarifdefterim.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tarifdefterim.R
import com.example.tarifdefterim.data.entity.Yemekler
import com.example.tarifdefterim.databinding.FragmentKategoriDetayBinding
import com.example.tarifdefterim.databinding.FragmentMainBinding
import com.example.tarifdefterim.ui.adapter.KategoriDetayAdapter
import com.example.tarifdefterim.ui.adapter.YemeklerAdapter
import com.example.tarifdefterim.ui.viewmodel.AnasayfaViewModel
import com.example.tarifdefterim.ui.viewmodel.GirisViewModel
import com.example.tarifdefterim.ui.viewmodel.KategoriDetayViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class KategoriDetayFragment : Fragment() {
    private lateinit var viewModel: KategoriDetayViewModel
    private lateinit var binding: FragmentKategoriDetayBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        val bundle:KategoriDetayFragmentArgs by navArgs()
        val gelenKategori = bundle.kategori

        binding = FragmentKategoriDetayBinding.inflate(inflater, container, false)

        //viewModel.KategoriGetir(gelenKategori.kategori_id)

       /* viewModel.yemeklerlistesi.observe(viewLifecycleOwner){
            val kategoriDetayAdapter = KategoriDetayAdapter(requireContext(),it)
            binding.kategoriDetayAdapter = kategoriDetayAdapter
        }*/


        return binding.root
    }
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val tempViewModel: KategoriDetayViewModel by viewModels()
        viewModel = tempViewModel

    }

}