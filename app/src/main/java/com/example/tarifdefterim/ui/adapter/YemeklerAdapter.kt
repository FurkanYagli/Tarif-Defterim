package com.example.tarifdefterim.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tarifdefterim.data.entity.Yemekler
import com.example.tarifdefterim.databinding.CardTasarimBinding
import com.example.tarifdefterim.databinding.FragmentMainBinding

class YemeklerAdapter(var mContext:Context, var yemeklerListesi:List<Yemekler>)
    : RecyclerView.Adapter<YemeklerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {

        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)

    }

    override fun getItemCount(): Int {


    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        return yemeklerListesi.size
    }

}