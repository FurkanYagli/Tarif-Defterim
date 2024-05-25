package com.example.tarifdefterim.data.datasource

import android.net.Uri
import androidx.lifecycle.MutableLiveData
import androidx.navigation.Navigation
import com.example.tarifdefterim.R
import com.example.tarifdefterim.data.entity.Kategoriler
import com.example.tarifdefterim.data.entity.Kullanicilar
import com.example.tarifdefterim.data.entity.Yemekler
import com.example.tarifdefterim.databinding.FragmentLoginBinding
import com.google.firebase.firestore.CollectionReference

class KullanicilarDataSource(var collectionKullanicilar:CollectionReference) {
    var kullanicilarListesi = MutableLiveData<List<Kullanicilar>>()


    fun girisYap(mail: String, sifre: String)/*:MutableLiveData<List<Kullanicilar>>*/{
       /*collectionKullanicilar.addSnapshotListener { value, error ->
            if(value != null){
                val liste = ArrayList<Kullanicilar>()

                for (d in value.documents){
                    val kullanici = d.toObject(Kullanicilar::class.java)
                    if (kullanici != null){
                        if (kullanici.kullanici_mail!!.lowercase().contains(mail.lowercase()))
                            if (kullanici.kullanici_sifre!!.lowercase().contains(sifre.lowercase())){
                                kullanici.kullanici_id = d.id

                                liste.add(kullanici)
                            }
                    }
                }
                kullanicilarListesi.value = liste
            }
        }
        return kullanicilarListesi*/
    }

    fun kayitOl(ad:String, soyad:String, mail:String, sifre:String, sifreTekrar:String){
        val yeniKullanici = Kullanicilar(kullanici_id = "", ad, soyad, mail, sifre)
        collectionKullanicilar.document().set(yeniKullanici)
    }


}