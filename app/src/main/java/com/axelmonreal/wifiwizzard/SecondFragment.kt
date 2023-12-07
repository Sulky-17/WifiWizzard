package com.axelmonreal.wifiwizzard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController

class  SecondFragment : Fragment() {

    private val sharedViewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val wifiNameEditText: EditText = view.findViewById(R.id.editWifiName)
        val wifiPasswordEditText: EditText = view.findViewById(R.id.editWifiPassword)
        val wifiDisponibilityEditText: EditText = view.findViewById(R.id.editWifiDisponibility)
        val wifiWinEditText: EditText = view.findViewById(R.id.editWifiWin)
        val wifiImageEditText: EditText = view.findViewById(R.id.editWifiImage)
        val addWifiButton: Button = view.findViewById(R.id.btnAddWifi)

        addWifiButton.setOnClickListener {
            val wifiName = wifiNameEditText.text.toString().trim()
            val wifiPassword = wifiPasswordEditText.text.toString().trim()
            val wifiDisponibility = wifiDisponibilityEditText.text.toString().trim()
            val wifiWin = wifiWinEditText.text.toString().trim()
            val wifiImage = wifiImageEditText.text.toString().trim()

            if (validateInput(wifiName, wifiPassword, wifiDisponibility, wifiWin, wifiImage)) {
                val newTask = Wifi(0, wifiName, wifiPassword, wifiDisponibility, wifiWin, wifiImage)
                sharedViewModel.addTask(newTask)

                findNavController().popBackStack()
            } else {
            }
        }

        return view
    }
    private fun validateInput(vararg inputs: String): Boolean {
        inputs.forEach {
            if (it.isEmpty()) {
                return false
            }
        }
        return true
    }
}