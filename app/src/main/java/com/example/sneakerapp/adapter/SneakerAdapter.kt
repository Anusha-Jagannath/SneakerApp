package com.example.sneakerapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.sneakerapp.R
import com.example.sneakerapp.databinding.ItemSneakerBinding
import com.example.sneakerapp.model.Sneaker

/**
 * Sneaker Adapter to display all the sneakers
 */
class SneakerAdapter(
    private val sneakersList: ArrayList<Sneaker>,
    private val context: Context,
    private val action: (Sneaker) -> Unit
) :
    RecyclerView.Adapter<SneakerViewHolder>() {

    private lateinit var binding: ItemSneakerBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SneakerViewHolder {
        binding = ItemSneakerBinding.bind(
            LayoutInflater.from(parent.context).inflate(R.layout.item_sneaker, parent, false)
        )
        return SneakerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return sneakersList.size
    }

    override fun onBindViewHolder(holder: SneakerViewHolder, position: Int) {
        val currentItem = sneakersList[position]
        holder.bind(currentItem, context, action)
    }


    fun updateList(list: ArrayList<Sneaker>) {
        sneakersList.clear()
        sneakersList.addAll(list)
        notifyDataSetChanged()
    }

}


class SneakerViewHolder(private val binding: ItemSneakerBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(sneaker: Sneaker, context: Context, action: (Sneaker) -> Unit) {
        binding.image.setImageDrawable(ContextCompat.getDrawable(context, sneaker.media.imageUrl))
        binding.name.text = sneaker.name
        binding.price.text = context.getString(R.string.rs_symbol) + sneaker.retailPrice.toString()

        binding.root.setOnClickListener {
            action(sneaker)
        }
    }
}