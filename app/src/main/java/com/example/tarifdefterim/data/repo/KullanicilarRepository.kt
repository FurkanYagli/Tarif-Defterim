package com.example.tarifdefterim.data.repo

import android.net.Uri
import com.example.tarifdefterim.data.datasource.KullanicilarDataSource
import com.example.tarifdefterim.databinding.FragmentLoginBinding

class KullanicilarRepository {
    var kds = KullanicilarDataSource()

    suspend fun girisYap() = kds.girisYap()
    suspend fun kayitOl() = kds.kayitOl()


}