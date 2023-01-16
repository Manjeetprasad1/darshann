package com.manny.darshann.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.manny.darshann.databinding.ItemTempleBinding
import com.manny.darshann.databinding.ItemUserBinding
import com.manny.darshann.itemViewModel.TempleItemViewModel
import com.manny.darshann.itemViewModel.UserItemViewModel
import com.root.sole.Interface.ItemProvider

class UserAdapter(val context: Context, private val canvassingEntity: ArrayList<ItemProvider>) : RecyclerView.Adapter<UserAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: ItemUserBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(entity: ItemProvider) {
            binding.itemViewModel = entity as UserItemViewModel?
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): UserAdapter.MyViewHolder {
        val inflate = LayoutInflater.from(context)

        val listItemBinding = ItemUserBinding.inflate(inflate,parent,false)
        return MyViewHolder(listItemBinding)
    }

    override fun onBindViewHolder(holder: UserAdapter.MyViewHolder, position: Int) {
        holder.bind(canvassingEntity[position])
    }

    override fun getItemCount(): Int {
        return canvassingEntity.size
    }
}