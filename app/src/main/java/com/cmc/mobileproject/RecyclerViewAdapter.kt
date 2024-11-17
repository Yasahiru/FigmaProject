package com.cmc.mobileproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(val titles: List<String>): RecyclerView.Adapter<RecyclerViewAdapter.cardViewHolder>() {

    override fun onCreateViewHolder(parent:ViewGroup,viewType:Int): cardViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager,parent,false)
        return cardViewHolder(view)
    }

    override fun onBindViewHolder(holder:cardViewHolder,position:Int){
        holder.title.text =titles[position]
    }

    override fun getItemCount():Int{
        return titles.size
    }

    class cardViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val title: TextView = itemView.findViewById(R.id.textView)
    }
}