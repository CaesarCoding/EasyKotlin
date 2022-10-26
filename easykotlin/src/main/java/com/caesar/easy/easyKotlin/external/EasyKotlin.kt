package com.caesar.easy.easyKotlin.external

import android.content.Context
import com.caesar.easy.easyKotlin.internal.AppGuardianImpl
import com.caesar.easy.easyKotlin.internal.PinStoreImpl

class EasyKotlin(private val context: Context) {

    val appGuardian: AppGuardian by lazy {
        AppGuardianImpl(context)
    }

    val pinStore: PinStore by lazy {
        PinStoreImpl(context)
    }

}