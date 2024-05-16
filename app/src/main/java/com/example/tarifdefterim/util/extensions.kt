package com.example.tarifdefterim.util

import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.example.tarifdefterim.R

fun Navigation.gecisYap(it:View, id:Int){
    findNavController(it).navigate(id)

}
fun Navigation.gecisYap(it:View, id:NavDirections){
    findNavController(it).navigate(id)

}