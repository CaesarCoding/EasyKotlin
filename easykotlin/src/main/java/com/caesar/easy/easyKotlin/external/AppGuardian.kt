package com.caesar.easy.easyKotlin.external

interface AppGuardian {
    fun isEmulator(): Boolean
    fun isAppTampered(localPackageName: String): Boolean
}