package com.example.sneakerapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sneakerapp.R
import com.example.sneakerapp.Utils
import com.example.sneakerapp.adapter.SneakerAdapter
import com.example.sneakerapp.databinding.SneakersFragmentBinding
import com.example.sneakerapp.model.Sneaker
import com.example.sneakerapp.viewmodel.SneakerViewModel

class SneakersFragment : Fragment() {

    private lateinit var binding: SneakersFragmentBinding
    private lateinit var adapter: SneakerAdapter
    private lateinit var sneakersList: ArrayList<Sneaker>
    private lateinit var viewModel: SneakerViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.sneakers_fragment, container, false)
        binding = SneakersFragmentBinding.bind(view)
        sneakersList = arrayListOf()
        viewModel = ViewModelProvider(requireActivity()).get(SneakerViewModel::class.java)
        setUpRecyclerView()
        callMockSneakersList()
        initClickListeners()
        observeChanges()
        return view
    }

    private fun setUpRecyclerView() {
        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        adapter = SneakerAdapter(sneakersList, requireContext()) { sneaker -> handleClick(sneaker) }
        binding.recyclerView.adapter = adapter
    }

    private fun initClickListeners() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query != null) {
                    filter(query.toString().lowercase())
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                val queryText = newText.toString().lowercase()
                filter(queryText)
                return true
            }

        })
    }

    private fun observeChanges() {
        viewModel.sneakersList.observe(viewLifecycleOwner) {
            it?.let {
                binding.progressBar.visibility = View.GONE
                sneakersList = it as ArrayList<Sneaker>
                adapter.updateList(it as ArrayList<Sneaker>)
            }
        }
    }

    private fun handleClick(sneaker: Sneaker) {
        val fragment = SneakerDetailsFragment()
        val bundle = Bundle()
        bundle.putString("name", sneaker.name)
        bundle.putSerializable(Utils.SNEAKER, sneaker)
        fragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fContainer, fragment)
            .addToBackStack(null)
            .commit()
    }

    private fun filter(queryText: String) {
        val searchList = arrayListOf<Sneaker>()
        if (queryText.isNotEmpty()) {
            for (data in sneakersList) {
                if (data.name.lowercase().contains(queryText)) {
                    searchList.add(data)
                }
            }
            if (searchList.isEmpty()) {
                Toast.makeText(
                    requireContext(),
                    getString(R.string.no_result_found),
                    Toast.LENGTH_SHORT
                ).show()
            }
            adapter.updateList(searchList)
        } else {
            adapter.updateList(sneakersList)
        }
    }

    private fun callMockSneakersList() {
        binding.progressBar.visibility = View.VISIBLE
        viewModel.getSneakersList()
    }
}