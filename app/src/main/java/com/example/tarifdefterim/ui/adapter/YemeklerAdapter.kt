package com.example.tarifdefterim.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.tarifdefterim.R
import com.example.tarifdefterim.data.entity.Yemekler
import com.example.tarifdefterim.databinding.CardTasarimBinding
import com.example.tarifdefterim.databinding.FragmentMainBinding
import com.example.tarifdefterim.ui.fragment.MainFragmentDirections
import com.example.tarifdefterim.ui.viewmodel.AnasayfaViewModel
import com.example.tarifdefterim.util.gecisYap

class YemeklerAdapter(var mContext:Context, var yemeklerListesi: MutableLiveData<List<Yemekler>>, var viewModel: AnasayfaViewModel)
    : RecyclerView.Adapter<YemeklerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {

        val binding:CardTasarimBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext),R.layout.card_tasarim , parent, false)
        return CardTasarimTutucu(binding)

    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val yemek = yemeklerListesi.value!!.get(position)
        val t = holder.tasarim

        t.yemekNesnesi = yemek

        t.cardViewSatir.setOnClickListener {
            val gecis = MainFragmentDirections.tarifDetayGecis(yemek)
            //Navigation.findNavController(it).navigate(gecis)
            Navigation.gecisYap(it,gecis)
        }
    }

    override fun getItemCount(): Int {
        if (yemeklerListesi != null){
            if (yemeklerListesi.value != null){
                return yemeklerListesi.value!!.size
            }else{
                return yemeklerListesi.value!!.size
            }
        }
        else{
            return yemeklerListesi.value!!.size
        }

    }
}
