package com.example.sneakerapp.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.example.sneakerapp.R
import com.example.sneakerapp.Utils
import com.example.sneakerapp.adapter.SneakerViewPagerAdapter
import com.example.sneakerapp.databinding.SneakersDetailsFragmentBinding
import com.example.sneakerapp.model.Sneaker
import com.example.sneakerapp.viewmodel.SneakerViewModel
import java.lang.Exception

class SneakerDetailsFragment : Fragment() {

    private lateinit var binding: SneakersDetailsFragmentBinding
    private lateinit var imagesList: ArrayList<Int>

    private lateinit var viewModel: SneakerViewModel
    private lateinit var sneaker: Sneaker
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.sneakers_details_fragment, container, false)
        binding = SneakersDetailsFragmentBinding.bind(view)
        val args = this.arguments
        sneaker = args?.get(Utils.SNEAKER) as Sneaker
        imagesList = arrayListOf()
        imagesList.add(sneaker.media.imageUrl)
        imagesList.add(sneaker.media.smallImageUrl)
        imagesList.add(sneaker.media.thumbUrl)

        viewModel = ViewModelProvider(requireActivity()).get(SneakerViewModel::class.java)

        setUpViewPager()
        initViews(sneaker)
        initClickListeners()
        return view
    }

    private fun initViews(sneaker: Sneaker) {
        binding.title.text = sneaker.name
        binding.subtitle.text = sneaker.title
        binding.priceTv.text = getString(R.string.rs_symbol) + sneaker.retailPrice.toString()
        binding.year.text = getString(R.string.year) + " " + sneaker.year.toString()

        if (sneaker.size == 7) {
            binding.sevenSize.background =
                ContextCompat.getDrawable(requireContext(), R.drawable.orange_bg)
            binding.sevenSize.setTextColor(resources.getColor(R.color.white))
        } else if (sneaker.size == 8) {
            binding.eightSize.background =
                ContextCompat.getDrawable(requireContext(), R.drawable.orange_bg)
            binding.eightSize.setTextColor(resources.getColor(R.color.white))
        } else if (sneaker.size == 9) {
            binding.nineSize.background =
                ContextCompat.getDrawable(requireContext(), R.drawable.orange_bg)
            binding.nineSize.setTextColor(resources.getColor(R.color.white))
        }

        if (sneaker.colorway == "blue") {
            binding.blueTv.text = "\u2713"
            binding.blackTv.alpha = 0.5f
            binding.orangeTv.alpha = 0.5f
        }

        if (sneaker.colorway == "black") {
            binding.blackTv.text = "\u2713"
            binding.blueTv.alpha = 0.5f
            binding.orangeTv.alpha = 0.5f
        }

        if (sneaker.colorway == "orange") {
            binding.orangeTv.text = "\u2713"
            binding.blueTv.alpha = 0.5f
            binding.blackTv.alpha = 0.5f
        }
    }

    private fun initClickListeners() {
        binding.backButton.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStackImmediate()
        }

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrollStateChanged(state: Int) {

                changeColor()
                super.onPageScrollStateChanged(state)
            }


            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                changeColor()
            }


            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
            }
        })

        binding.addToCartTv.setOnClickListener {
            try {
                viewModel.addToCart(sneaker)
                Toast.makeText(requireContext(), "Added to cart successfully", Toast.LENGTH_SHORT)
                    .show()
                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.fContainer, SneakerCartFragment()).addToBackStack(null).commit()

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    private fun setUpViewPager() {
        val adapter = SneakerViewPagerAdapter(imagesList)
        binding.viewPager.adapter = adapter
    }

    /**
     * method to change color on indicator
     */
    private fun changeColor() {
        when (binding.viewPager.currentItem) {

            0 -> {
                binding.iv1.setBackgroundColor(requireActivity().getColor(R.color.black))
                binding.iv2.setBackgroundColor(requireActivity().getColor(R.color.grey))
                binding.iv3.setBackgroundColor(requireActivity().getColor(R.color.grey))
            }

            1 -> {
                binding.iv1.setBackgroundColor(requireActivity().getColor(R.color.grey))
                binding.iv2.setBackgroundColor(requireActivity().getColor(R.color.black))
                binding.iv3.setBackgroundColor(requireActivity().getColor(R.color.grey))
            }

            2 -> {
                binding.iv1.setBackgroundColor(requireActivity().getColor(R.color.grey))
                binding.iv2.setBackgroundColor(requireActivity().getColor(R.color.grey))
                binding.iv3.setBackgroundColor(requireActivity().getColor(R.color.black))
            }
        }
    }
}