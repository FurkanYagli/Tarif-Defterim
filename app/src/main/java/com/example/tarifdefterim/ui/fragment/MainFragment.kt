package com.example.tarifdefterim.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.navigation.Navigation
import com.example.tarifdefterim.R
import com.example.tarifdefterim.data.entity.Yemekler
import com.example.tarifdefterim.databinding.FragmentMainBinding

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

        binding.button3.setOnClickListener {
            val yemek = Yemekler(1,"musakka",1)
            val gecis = MainFragmentDirections.tarifDetayGecis(yemek)
            Navigation.findNavController(it).navigate(gecis)
        }

        return binding.root

    }

}

