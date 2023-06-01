package com.polodarb.volans.ui.recyclers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.polodarb.volans.R
import com.polodarb.volans.databinding.RvHomeCardBinding

interface ItemClickListener {
    fun itemOnClick(item: Int)
}

class HomeFlightCardAdapter(
    private val list: List<Int>,
    private val mItemClickListener: ItemClickListener
): RecyclerView.Adapter<HomeFlightCardAdapter.HomeFlightCardViewHolder>(), View.OnClickListener {

    class HomeFlightCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val card: CardView = itemView.findViewById<CardView>(R.id.flightCard)
        val textDeparture = itemView.findViewById<TextView>(R.id.town_departure)
        val textLanding = itemView.findViewById<TextView>(R.id.town_landing)
        val textCodeDeparture = itemView.findViewById<TextView>(R.id.code_airport_departure)
        val textCodeLanding = itemView.findViewById<TextView>(R.id.code_airport_landing)
        val textDateDeparture = itemView.findViewById<TextView>(R.id.tv_date_departure)
        val textDateLanding = itemView.findViewById<TextView>(R.id.tv_date_landing)
        val textTimeDeparture = itemView.findViewById<TextView>(R.id.tv_time_departure)
        val textTimeLanding = itemView.findViewById<TextView>(R.id.tv_time_landing)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeFlightCardViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = RvHomeCardBinding.inflate(inflater, parent, false)

        view.root.setOnClickListener(this)

        return HomeFlightCardViewHolder(view.root)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: HomeFlightCardViewHolder, position: Int) {
        val item = list[position]
        with (holder) {
//            holder.textDeparture.text = item.toString()
//            holder.textLanding.text = item.toString()
//            holder.textCodeDeparture.text = item.toString()
//            holder.textCodeLanding.text = item.toString()
//            holder.textDateDeparture.text = item.toString()
//            holder.textDateLanding.text = item.toString()
//            holder.textTimeDeparture.text = item.toString()
//            holder.textTimeLanding.text = item.toString()
            itemView.tag = position
        }
    }

    override fun onClick(v: View?) {
        val item = v?.tag as Int
        mItemClickListener.itemOnClick(item)
    }
}