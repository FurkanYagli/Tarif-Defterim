package com.example.tarifdefterim.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.tarifdefterim.R
import com.example.tarifdefterim.data.entity.Kategoriler
import com.example.tarifdefterim.data.entity.Yemekler
import com.example.tarifdefterim.databinding.FragmentMainBinding
import com.example.tarifdefterim.ui.adapter.KategoriAdapter
import com.example.tarifdefterim.ui.adapter.YemeklerAdapter
import com.example.tarifdefterim.ui.viewmodel.AnasayfaViewModel
import com.example.tarifdefterim.ui.viewmodel.GirisViewModel
import com.example.tarifdefterim.ui.viewmodel.TarifDetayViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var viewModel: AnasayfaViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentMainBinding.inflate(inflater, container, false)

        viewModel.yemeklerlistesi.observe(viewLifecycleOwner){
            val yemeklerAdapter = YemeklerAdapter(requireContext(),it)
            binding.yemeklerAdapter = yemeklerAdapter
        }

        viewModel.kategorilerlistesi.observe(viewLifecycleOwner){
            val kategoriAdapter = KategoriAdapter(requireContext(),it)
            binding.kategoriAdapter = kategoriAdapter
        }

        binding.searchView.setOnQueryTextListener(object : OnQueryTextListener {

            override fun onQueryTextChange(newText: String): Boolean {
                viewModel.ara(newText)
                return true
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                viewModel.ara(query)
                return true
            }
        })

        return binding.root

    }
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val tempViewModel: AnasayfaViewModel by viewModels()
        viewModel = tempViewModel

    }

    override fun onResume() {
        super.onResume()
        viewModel.yemekleriYukle()
        viewModel.kategorileriYukle()
    }

}

