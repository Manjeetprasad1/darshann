package com.manny.darshann.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.manny.darshann.databinding.ItemTempleBinding
import com.manny.darshann.itemViewModel.TempleItemViewModel
import com.root.sole.Interface.ItemProvider

class TempleAdapter (val context: Context, private val canvassingEntity: ArrayList<ItemProvider>) : RecyclerView.Adapter<TempleAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: ItemTempleBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(canvassingEntity: ItemProvider) {
            binding.itemViewModel = canvassingEntity as TempleItemViewModel?
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TempleAdapter.MyViewHolder {
        val inflate = LayoutInflater.from(context)

        val listItemBinding = ItemTempleBinding.inflate(inflate,parent,false)
        return MyViewHolder(listItemBinding)
    }

    override fun onBindViewHolder(holder: TempleAdapter.MyViewHolder, position: Int) {
        holder.bind(canvassingEntity[position])
    }

    override fun getItemCount(): Int {
        return canvassingEntity.size
    }
}