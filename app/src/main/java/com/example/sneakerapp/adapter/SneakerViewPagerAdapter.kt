package com.example.sneakerapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.sneakerapp.R
import com.example.sneakerapp.databinding.ItemImageBinding

/**
 * Sneaker view pager to display sneaker image in the details page
 */
class SneakerViewPagerAdapter(private val imagesList: ArrayList<Int>) :
    RecyclerView.Adapter<SneakerViewPagerHolder>() {

    private lateinit var binding: ItemImageBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SneakerViewPagerHolder {
        binding = ItemImageBinding.bind(
            LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        )
        return SneakerViewPagerHolder(binding)
    }

    override fun getItemCount(): Int {
        return imagesList.size
    }

    override fun onBindViewHolder(holder: SneakerViewPagerHolder, position: Int) {
        val currentItem = imagesList[position]
        holder.bind(currentItem)
    }
}

class SneakerViewPagerHolder(private val binding: ItemImageBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(img: Int) {
        binding.title.setImageDrawable(ContextCompat.getDrawable(binding.root.context, img))
    }
}