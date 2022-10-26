package com.caesar.easy.easyKotlin.internal

import android.content.Context
import android.os.Build
import com.caesar.easy.easyKotlin.BuildConfig
import com.caesar.easy.easyKotlin.external.AppGuardian

class AppGuardianImpl(private val context: Context) : AppGuardian {
    override fun isEmulator(): Boolean {
        if (BuildConfig.DEBUG) {
            return false
        }
        return Build.FINGERPRINT.startsWith("generic")
                || Build.FINGERPRINT.startsWith("unknown")
                || Build.MODEL.contains("google_sdk")
                || Build.MODEL.contains("Emulator")
                || Build.MODEL.contains("Android SDK built for x86")
                || Build.MANUFACTURER.contains("Genymotion")
                || (Build.BOARD.startsWith("generic") && Build.DEVICE.startsWith("generic"))
                || Build.PRODUCT.equals("google_sdk")
                || Build.HARDWARE.equals("goldfish")
    }

    override fun isAppTampered(localPackageName: String): Boolean {
        if (BuildConfig.DEBUG) {
            return false
        }
        return context.packageName.equals(localPackageName).not()
    }

}