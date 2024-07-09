package com.akirachix.enwallet_project

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class EnwalletAdapter(val IncomeTrack:List<Enwallet>):RecyclerView.Adapter<IncomeViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IncomeViewHolder {
        var itemView= LayoutInflater.from(parent.context).inflate(R.layout.enwallety,parent,false)
        return IncomeViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return IncomeTrack.size
    }

    override fun onBindViewHolder(holder: IncomeViewHolder, position: Int) {
       var income = IncomeTrack[position]
        holder.salary.text=income.salary
        holder.amount.text=income.amount
        holder.date.text=income.date

    }

}

class IncomeViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val salary= itemView.findViewById<TextView>(R.id.tvSalary)
    val amount= itemView.findViewById<TextView>(R.id.tvAmount)
    val date= itemView.findViewById<TextView>(R.id.tvDate)
}