package com.example.tarifdefterim.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tarifdefterim.R
import com.example.tarifdefterim.data.entity.Yemekler
import com.example.tarifdefterim.databinding.FragmentMainBinding
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
        binding.rv.layoutManager = LinearLayoutManager(requireContext())
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

        binding.rv.adapter = yemeklerAdapter

        return binding.root

    }

}

