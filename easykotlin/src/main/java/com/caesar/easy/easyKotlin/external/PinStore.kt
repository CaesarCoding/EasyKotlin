package com.caesar.easy.easyKotlin.external

interface PinStore {
    fun savePin(pin: String)
    fun checkPin(pin: String): Boolean
}