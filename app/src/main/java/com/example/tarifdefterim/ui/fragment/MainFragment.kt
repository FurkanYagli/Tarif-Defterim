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

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var viewModel: AnasayfaViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.searchView.setOnQueryTextListener(object : OnQueryTextListener {

            override fun onQueryTextChange(newText: String?): Boolean {
                return true
            }

            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }
        })
        binding.rvListe.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.rvKategori.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)


        viewModel.yemeklerlistesi.observe(viewLifecycleOwner){
            val yemeklerAdapter = YemeklerAdapter(requireContext(),it)
            binding.rvListe.adapter = yemeklerAdapter


        }


        val kategoriListesi = ArrayList<Kategoriler>()
        val k1 = Kategoriler(1,"Ana Yemek","karni_yarik_icon")
        val k2 = Kategoriler(2,"Çorba","soup_icon")
        val k3 = Kategoriler(3,"Tatlı","tatli_icon")
        kategoriListesi.add(k1)
        kategoriListesi.add(k2)
        kategoriListesi.add(k3)

        val kategoriAdapter = KategoriAdapter(requireContext(),kategoriListesi)

        binding.rvKategori.adapter = kategoriAdapter




        return binding.root

    }
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val tempViewModel: AnasayfaViewModel by viewModels()
        viewModel = tempViewModel

    }

}

