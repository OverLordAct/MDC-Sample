package com.joydeep.mdcsample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.joydeep.mdcsample.R

class RecyclerAdapter: RecyclerView.Adapter<RecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {}

    override fun getItemCount(): Int = 10
}

class RecyclerViewHolder(
    parent: ViewGroup
): RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.custom_viewholder, parent, false)
)