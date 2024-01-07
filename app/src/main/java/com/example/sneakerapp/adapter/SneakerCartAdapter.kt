package com.example.sneakerapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.sneakerapp.R
import com.example.sneakerapp.databinding.ItemCartBinding
import com.example.sneakerapp.model.Sneaker

/**
 * SneakerCartAdapter to display all the data from cart
 */

class SneakerCartAdapter(
    private val sneakerList: ArrayList<Sneaker>,
    private val action: (Sneaker) -> Unit
) : RecyclerView.Adapter<SneakerCartViewHolder>() {

    private lateinit var binding: ItemCartBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SneakerCartViewHolder {
        binding = ItemCartBinding.bind(
            LayoutInflater.from(parent.context).inflate(R.layout.item_cart, parent, false)
        )
        return SneakerCartViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return sneakerList.size
    }

    override fun onBindViewHolder(holder: SneakerCartViewHolder, position: Int) {
        val currentItem = sneakerList[position]
        holder.bind(currentItem, action)
    }


    fun updateList(list: ArrayList<Sneaker>) {
        sneakerList.clear()
        sneakerList.addAll(list)
        notifyDataSetChanged()
    }


}


class SneakerCartViewHolder(private val binding: ItemCartBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(sneaker: Sneaker, action: (Sneaker) -> Unit) {
        binding.sneakerImage.setImageDrawable(
            ContextCompat.getDrawable(
                binding.root.context,
                sneaker.media.imageUrl
            )
        )
        binding.nameTv.text = sneaker.name
        binding.priceTv.text =
            binding.root.context.getString(R.string.rs_symbol) + sneaker.retailPrice.toString()
        binding.deleteBtn.setOnClickListener {
            action(sneaker)
        }
    }
}