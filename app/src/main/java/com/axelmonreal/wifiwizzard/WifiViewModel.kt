package com.axelmonreal.wifiwizzard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WifiViewModel : ViewModel() {
    private val _wifis = MutableLiveData<List<Wifi>>(emptyList())
    val tasks: LiveData<List<Wifi>> = _wifis

    fun addWifi(wifi: Wifi) {
        _wifis.value = _wifis.value!! + wifi
    }
}