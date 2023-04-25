package com.polodarb.volans.ui.recyclers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.polodarb.volans.R
import com.polodarb.volans.databinding.RvHomeCardBinding

class HomeFlightCardAdapter(
    private val list: List<Int>
): RecyclerView.Adapter<HomeFlightCardAdapter.HomeFlightCardViewHolder>() {

    class HomeFlightCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val card: CardView = itemView.findViewById<CardView>(R.id.flightCard)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeFlightCardViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = RvHomeCardBinding.inflate(inflater, parent, false)

        return HomeFlightCardViewHolder(view.root)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: HomeFlightCardViewHolder, position: Int) {
        val item = list[position]
        holder.card
    }

}