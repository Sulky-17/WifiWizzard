package com.axelmonreal.wifiwizzard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    private val wifiLiveData = MutableLiveData<List<Wifi>>(listOf(
        Wifi(
            1,
            "Arries AD-13",
            "123456789",
            "Privada",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fmantenimientoinformatico.madrid%2Ftodos-los-articulos%2Fconexion-a-internet-tipos-ventajas-y-desventajas%2F&psig=AOvVaw1eb--8iLdmSzPilrsR6Du9&ust=1702055183747000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCPjJt__n_YIDFQAAAAAdAAAAABAQ.jpg",
            "https://as1.ftcdn.net/v2/jpg/04/41/71/62/1000_F_441716250_ahJleqJ5MbFkn0D51Ftj0afmAgCrCqPr.jpg"
        ),
        Wifi(
            2,
            "Arries AD-14",
            "macarronesDqueso",
            "Privada",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fmantenimientoinformatico.madrid%2Ftodos-los-articulos%2Fconexion-a-internet-tipos-ventajas-y-desventajas%2F&psig=AOvVaw1eb--8iLdmSzPilrsR6Du9&ust=1702055183747000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCPjJt__n_YIDFQAAAAAdAAAAABAQ.jpg",
            "https://as1.ftcdn.net/v2/jpg/04/41/71/62/1000_F_441716250_ahJleqJ5MbFkn0D51Ftj0afmAgCrCqPr.jpg"
        ),
        Wifi(
            3,
            "Arries AD-13",
            "123456789",
            "Privada",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fmantenimientoinformatico.madrid%2Ftodos-los-articulos%2Fconexion-a-internet-tipos-ventajas-y-desventajas%2F&psig=AOvVaw1eb--8iLdmSzPilrsR6Du9&ust=1702055183747000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCPjJt__n_YIDFQAAAAAdAAAAABAQ.jpg",
            "https://as1.ftcdn.net/v2/jpg/04/41/71/62/1000_F_441716250_ahJleqJ5MbFkn0D51Ftj0afmAgCrCqPr.jpg"
        ),
        Wifi(
            4,
            "Arries AD-14",
            "9gOqdiO",
            "Publica",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fmantenimientoinformatico.madrid%2Ftodos-los-articulos%2Fconexion-a-internet-tipos-ventajas-y-desventajas%2F&psig=AOvVaw1eb--8iLdmSzPilrsR6Du9&ust=1702055183747000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCPjJt__n_YIDFQAAAAAdAAAAABAQ.jpg",
            "https://as1.ftcdn.net/v2/jpg/04/41/71/62/1000_F_441716250_ahJleqJ5MbFkn0D51Ftj0afmAgCrCqPr.jpg"
        ),
        Wifi(
            5,
            "Arries AD-15",
            "uzumymw",
            "Privada",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fmantenimientoinformatico.madrid%2Ftodos-los-articulos%2Fconexion-a-internet-tipos-ventajas-y-desventajas%2F&psig=AOvVaw1eb--8iLdmSzPilrsR6Du9&ust=1702055183747000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCPjJt__n_YIDFQAAAAAdAAAAABAQ.jpg",
            "https://as1.ftcdn.net/v2/jpg/04/41/71/62/1000_F_441716250_ahJleqJ5MbFkn0D51Ftj0afmAgCrCqPr.jpg"
        ),
    ))

    fun getWifis(): LiveData<List<Wifi>> = wifiLiveData

    fun addWifi(newWifi: Wifi) {
        wifiLiveData.value = wifiLiveData.value?.plus(newWifi)
    }

}