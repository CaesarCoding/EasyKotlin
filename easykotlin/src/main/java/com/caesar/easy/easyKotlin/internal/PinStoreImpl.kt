package com.caesar.easy.easyKotlin.internal

import android.content.Context
import com.caesar.easy.easyKotlin.external.PinStore
import org.mindrot.jbcrypt.BCrypt

class PinStoreImpl(private val context: Context) : PinStore {
    override fun savePin(pin: String) {
        BCrypt.hashpw(pin, BCrypt.gensalt()).let { pinCode ->
            context.getSharedPreferences(PIN_STORE, Context.MODE_PRIVATE).edit().apply {
                putString(PIN_CODE, pinCode)
                apply()
            }
        }
    }

    override fun checkPin(pin: String): Boolean {
        return context.getSharedPreferences(PIN_STORE, Context.MODE_PRIVATE)
            .getString(PIN_CODE, null)?.let { pinCode ->
            BCrypt.checkpw(pin, pinCode)
        } ?: false
    }

    companion object {
        const val PIN_STORE = "PIN_STORE"
        const val PIN_CODE = "PIN_CODE"
    }
}