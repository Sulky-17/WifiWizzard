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
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fmantenimientoinformatico.madrid%2Ftodos-los-articulos%2Fconexion-a-internet-tipos-ventajas-y-desventajas%2F&psig=AOvVaw1eb--8iLdmSzPilrsR6Du9&ust=1702055183747000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCPjJt__n_YIDFQAAAAAdAAAAABAQ",
            "https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.definicionabc.com%2Fcontenido%2Fimp%2FTipo-Conexion-Internet.jpg&tbnid=yOMKuZtOkFzISM&vet=12ahUKEwjK0Jjm5_2CAxXLh-4BHXsZAGgQMygMegUIARCJAQ..i&imgrefurl=https%3A%2F%2Fwww.definicionabc.com%2Fimportancia%2Fim-tipo-de-conexion-a-internet.php&docid=FA5jkmLPZ9JzgM&w=600&h=412&q=conexion&ved=2ahUKEwjK0Jjm5_2CAxXLh-4BHXsZAGgQMygMegUIARCJAQ"
        ),
        Wifi(
            2,
            "Arries AD-14",
            "macarronesDqueso",
            "Privada",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fmantenimientoinformatico.madrid%2Ftodos-los-articulos%2Fconexion-a-internet-tipos-ventajas-y-desventajas%2F&psig=AOvVaw1eb--8iLdmSzPilrsR6Du9&ust=1702055183747000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCPjJt__n_YIDFQAAAAAdAAAAABAQ",
            "https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.definicionabc.com%2Fcontenido%2Fimp%2FTipo-Conexion-Internet.jpg&tbnid=yOMKuZtOkFzISM&vet=12ahUKEwjK0Jjm5_2CAxXLh-4BHXsZAGgQMygMegUIARCJAQ..i&imgrefurl=https%3A%2F%2Fwww.definicionabc.com%2Fimportancia%2Fim-tipo-de-conexion-a-internet.php&docid=FA5jkmLPZ9JzgM&w=600&h=412&q=conexion&ved=2ahUKEwjK0Jjm5_2CAxXLh-4BHXsZAGgQMygMegUIARCJAQ"
        ),
        Wifi(
            3,
            "Arries AD-13",
            "123456789",
            "Privada",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fmantenimientoinformatico.madrid%2Ftodos-los-articulos%2Fconexion-a-internet-tipos-ventajas-y-desventajas%2F&psig=AOvVaw1eb--8iLdmSzPilrsR6Du9&ust=1702055183747000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCPjJt__n_YIDFQAAAAAdAAAAABAQ",
            "https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.definicionabc.com%2Fcontenido%2Fimp%2FTipo-Conexion-Internet.jpg&tbnid=yOMKuZtOkFzISM&vet=12ahUKEwjK0Jjm5_2CAxXLh-4BHXsZAGgQMygMegUIARCJAQ..i&imgrefurl=https%3A%2F%2Fwww.definicionabc.com%2Fimportancia%2Fim-tipo-de-conexion-a-internet.php&docid=FA5jkmLPZ9JzgM&w=600&h=412&q=conexion&ved=2ahUKEwjK0Jjm5_2CAxXLh-4BHXsZAGgQMygMegUIARCJAQ"
        ),
        Wifi(
            4,
            "Arries AD-14",
            "9gOqdiO",
            "Publica",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fmantenimientoinformatico.madrid%2Ftodos-los-articulos%2Fconexion-a-internet-tipos-ventajas-y-desventajas%2F&psig=AOvVaw1eb--8iLdmSzPilrsR6Du9&ust=1702055183747000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCPjJt__n_YIDFQAAAAAdAAAAABAQ",
            "https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.definicionabc.com%2Fcontenido%2Fimp%2FTipo-Conexion-Internet.jpg&tbnid=yOMKuZtOkFzISM&vet=12ahUKEwjK0Jjm5_2CAxXLh-4BHXsZAGgQMygMegUIARCJAQ..i&imgrefurl=https%3A%2F%2Fwww.definicionabc.com%2Fimportancia%2Fim-tipo-de-conexion-a-internet.php&docid=FA5jkmLPZ9JzgM&w=600&h=412&q=conexion&ved=2ahUKEwjK0Jjm5_2CAxXLh-4BHXsZAGgQMygMegUIARCJAQ"
        ),
        Wifi(
            5,
            "Arries AD-15",
            "uzumymw",
            "Privada",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fmantenimientoinformatico.madrid%2Ftodos-los-articulos%2Fconexion-a-internet-tipos-ventajas-y-desventajas%2F&psig=AOvVaw1eb--8iLdmSzPilrsR6Du9&ust=1702055183747000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCPjJt__n_YIDFQAAAAAdAAAAABAQ",
            "https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.definicionabc.com%2Fcontenido%2Fimp%2FTipo-Conexion-Internet.jpg&tbnid=yOMKuZtOkFzISM&vet=12ahUKEwjK0Jjm5_2CAxXLh-4BHXsZAGgQMygMegUIARCJAQ..i&imgrefurl=https%3A%2F%2Fwww.definicionabc.com%2Fimportancia%2Fim-tipo-de-conexion-a-internet.php&docid=FA5jkmLPZ9JzgM&w=600&h=412&q=conexion&ved=2ahUKEwjK0Jjm5_2CAxXLh-4BHXsZAGgQMygMegUIARCJAQ"
        ),
    ))

    fun getTasks(): LiveData<List<Wifi>> = wifiLiveData

    fun addTask(newTask: Wifi) {
        wifiLiveData.value = wifiLiveData.value?.plus(newTask)
    }

}