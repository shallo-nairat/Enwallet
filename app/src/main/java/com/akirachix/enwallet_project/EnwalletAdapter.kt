package com.akirachix.enwallet_project

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class EnwalletAdapter(val enalletList: List<Enwallety>:RecyclerView.Adapter<EnwViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EnwalletyViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.enwallet,parent,false)
        return EnwalletyViewHolder(itemView)

    }


}