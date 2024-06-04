package com.example.tarifdefterim.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.example.tarifdefterim.R
import com.example.tarifdefterim.databinding.FragmentLoginBinding
import com.example.tarifdefterim.ui.viewmodel.GirisViewModel
import com.example.tarifdefterim.util.gecisYap
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    private lateinit var viewModel: GirisViewModel


     override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

         binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
         binding.loginFragment = this



         binding.buttonGiris.setOnClickListener {
             val mail = binding.TextInputMail.text.toString()
             val sifre = binding.TextInputParola.text.toString()
             buttonGirisYap(mail, sifre)
         }



        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val tempViewModel: GirisViewModel by viewModels()
        viewModel = tempViewModel

    }

    fun buttonKayitOl(){
        Navigation.gecisYap(binding.buttonGiris,R.id.LogindenRegistera)

    }
    fun buttonGirisYap(mail:String,sifre:String){
        try {
            viewModel.girisYap(mail, sifre)
            if (viewModel.kullanicilarlistesi != null){
                if (viewModel.kullanicilarlistesi.value!!.size == 1){
                    Navigation.gecisYap(binding.buttonGiris, R.id.loginMaine)
                    //Toast.makeText(requireContext(), "True", Toast.LENGTH_LONG).show()

                }
                else{Toast.makeText(requireContext(), "Hatalı Bilgi Lütfen Bilgilerinizi Kontrol Ediniz", Toast.LENGTH_SHORT).show()}
            }
            else{Toast.makeText(requireContext(), "Sistemde Arıza Var Kısa Süre Sonra Tekrar Deneyiniz", Toast.LENGTH_LONG).show()}

            //viewModel.kullanicilarlistesi.observe(viewLifecycleOwner){}


        }catch (e: Exception){
            Toast.makeText(requireContext(), "Beklenmeyen Hata" , Toast.LENGTH_SHORT).show()
            Log.e("Hata", "Hata mesajı: Bir hata oluştu! ${e}")

        }
    }

}