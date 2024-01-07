package com.example.sneakerapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sneakerapp.R
import com.example.sneakerapp.Utils
import com.example.sneakerapp.adapter.SneakerAdapter
import com.example.sneakerapp.adapter.SneakerCartAdapter
import com.example.sneakerapp.databinding.SneakersCartFragmentBinding
import com.example.sneakerapp.databinding.SneakersDetailsFragmentBinding
import com.example.sneakerapp.model.Sneaker
import com.example.sneakerapp.viewmodel.SneakerViewModel

class SneakerCartFragment : Fragment() {

    private lateinit var binding: SneakersCartFragmentBinding
    private lateinit var sneakersList: ArrayList<Sneaker>
    private lateinit var adapter: SneakerCartAdapter
    private lateinit var viewModel: SneakerViewModel
    private var subTotal = 0f;
    private var total = 0f;
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.sneakers_cart_fragment, container, false)
        binding = SneakersCartFragmentBinding.bind(view)
        sneakersList = arrayListOf()

        viewModel = ViewModelProvider(requireActivity()).get(SneakerViewModel::class.java)
        setUpRecyclerView()
        initClickListeners()
        observeChanges()
        return view
    }

    private fun setUpRecyclerView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter = SneakerCartAdapter(sneakersList) { sneaker -> handleDeleteClick(sneaker) }
        binding.recyclerView.adapter = adapter
    }

    private fun handleDeleteClick(sneaker: Sneaker) {
        viewModel.removeFromCart(sneaker)
        Toast.makeText(requireContext(), "Deleted ${sneaker.name} successfully", Toast.LENGTH_SHORT)
            .show()
    }

    private fun observeChanges() {
        viewModel.sneakerCartList.observe(viewLifecycleOwner) {
            subTotal = 0f
            total = 0f
            if (it.isEmpty()) {
                binding.detailsLayout.visibility = View.GONE
                binding.emptyImage.visibility = View.VISIBLE
            } else {
                binding.emptyImage.visibility = View.GONE
                binding.recyclerView.visibility = View.VISIBLE
                binding.detailsLayout.visibility = View.VISIBLE

                for (data in it) {
                    subTotal += data.retailPrice
                }

                total = subTotal + Utils.TAX

                binding.subtotalTv.text = getString(R.string.subtotal)+": "+getString(R.string.rs_symbol) + subTotal.toString()
                binding.taxesTv.text = getString(R.string.taxes_and_charges)+": "+ getString(R.string.rs_symbol) + Utils.TAX
                binding.totalTv.text = getString(R.string.rs_symbol) + total

            }
            adapter.updateList(it as ArrayList<Sneaker>)
        }
    }

    private fun initClickListeners() {
        binding.backButton.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStackImmediate()
        }
    }
}