package com.axelmonreal.wifiwizzard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class WifiAdapter(private var wifis: List<Wifi>): RecyclerView.Adapter<WifiAdapter.WifiViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WifiViewHolder {

        val inflador = LayoutInflater.from(parent.context)

        val view = inflador.inflate(R.layout.item_wifi, parent, false)
        return WifiViewHolder(view)
    }

    override fun onBindViewHolder(holder: WifiViewHolder, position: Int) {
        val wifi = wifis[position]
        holder.render(wifi)

    }

    override fun getItemCount(): Int {
        return wifis.size
    }

    fun updateTasks(newWifis: List<Wifi>) {
        wifis = newWifis
        notifyDataSetChanged()
    }

    class WifiViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val name: TextView = view.findViewById(R.id.country_name)
        val password: TextView = view.findViewById(R.id.country_capital)
        val disponibility: TextView = view.findViewById(R.id.country_continent)
        val win: ImageView = view.findViewById(R.id.country_flag)
        val image: ImageView = view.findViewById(R.id.country_image)

        fun render(wifi: Wifi) {
            name.text = wifi.name + ", "
            password.text = wifi.passsword
            disponibility.text = wifi.disponibility
            Picasso.get().load(wifi.win).into(win)
            Picasso.get().load(wifi.image).into(image)


        }
    }
}