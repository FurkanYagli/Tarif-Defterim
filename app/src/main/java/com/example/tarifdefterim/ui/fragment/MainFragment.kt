package com.example.tarifdefterim.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.tarifdefterim.R
import com.example.tarifdefterim.data.entity.Kategoriler
import com.example.tarifdefterim.data.entity.Yemekler
import com.example.tarifdefterim.databinding.FragmentMainBinding
import com.example.tarifdefterim.ui.adapter.KategoriAdapter
import com.example.tarifdefterim.ui.adapter.YemeklerAdapter

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

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
        val yemekListesi = ArrayList<Yemekler>()
        val y1 = Yemekler(2,"adana kebabı",1,"et, biber"," null")
        val y2 = Yemekler(3,"Kek",3,"Un,Yumurta,Süt","null")
        val y3 = Yemekler(4,"alinazik",1,
            "patlıcan,et,yoğurt,Sarımsak,pul biber,yağ",
            "patlıcanları közle, eti sotele , patlıcanları sarımsaklı yoğurtla harmanla ,eti karışımın üstüne koy" )
        yemekListesi.add(y1)
        yemekListesi.add(y2)
        yemekListesi.add(y3)

        val yemeklerAdapter = YemeklerAdapter(requireContext(),yemekListesi)


        val kategoriListesi = ArrayList<Kategoriler>()
        val k1 = Kategoriler(1,"Ana Yemek","karni_yarik_icon")
        val k2 = Kategoriler(2,"Çorba","soup_icon")
        val k3 = Kategoriler(3,"Tatlı","tatli_icon")
        kategoriListesi.add(k1)
        kategoriListesi.add(k2)
        kategoriListesi.add(k3)

        val kategoriAdapter = KategoriAdapter(requireContext(),kategoriListesi)

        binding.rvListe.adapter = yemeklerAdapter
        binding.rvKategori.adapter = kategoriAdapter

        return binding.root

    }

}

