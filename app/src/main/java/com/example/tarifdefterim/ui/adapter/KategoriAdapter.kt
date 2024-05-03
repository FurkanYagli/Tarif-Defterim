package com.example.tarifdefterim.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tarifdefterim.data.entity.Kategoriler
import com.example.tarifdefterim.data.entity.Yemekler
import com.example.tarifdefterim.databinding.CardTasarimBinding
import com.example.tarifdefterim.databinding.FiltreTasarimBinding

class KategoriAdapter(var mContext: Context, var kategoriler:List<Kategoriler>)
    :RecyclerView.Adapter<KategoriAdapter.FiltreTasarimTutucu>(){

    inner class FiltreTasarimTutucu(var tasarim:FiltreTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FiltreTasarimTutucu {
        val binding = FiltreTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return FiltreTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: FiltreTasarimTutucu, position: Int) {
        val kategori = kategoriler.get(position)
        val t = holder.tasarim

        t.imageViewKategori.setImageResource(
            mContext.resources.getIdentifier(kategori.kategori_resim, "drawable", mContext.packageName)
        )
        t.txtKategoriAd.text = "${kategori.kategori_ad}"

    }

    override fun getItemCount(): Int {
        return kategoriler.size
    }
}
