package com.axelmonreal.wifiwizzard

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {

    private var users: List<User> = emptyList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val user = view.findViewById<EditText>(R.id.username)
        val password = view.findViewById<EditText>(R.id.password)
        val button = view.findViewById<Button>(R.id.submit)

        button.setOnClickListener {
            validUsers()

            if(user.text != null && password.text != null) {

                val email = user.text.toString()
                val pass = password.text.toString()

                if(checkUser(email, pass, users)){
                    Toast.makeText(context,"Login Correcto", Toast.LENGTH_SHORT)
                        .show()

                    //TODO Cambiar a MainActivity
                    val i = Intent(view.context, MainActivity::class.java)
                    startActivity(i)
                    activity?.finish()

                } else {
                    Toast.makeText(context,
                        "Las credenciales no coinciden",
                        Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(
                    context,
                    "Ambos campos son requeridos",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        return view
    }

    private fun checkUser(username: String, password: String, users: List<User>): Boolean {
        return users.any { user ->
            username == user.email && password == user.password
        }
    }

    private fun validUsers() {
        users = listOf(
            User(1, "axelM@email.com", "12345"),
            User(2, "nina@minina.com", "cacerola1"),
            User(3, "komarov1313@outlook.com", "Melodia123")
        )
    }
}