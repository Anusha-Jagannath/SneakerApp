package com.example.sneakerapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.sneakerapp.R
import com.example.sneakerapp.databinding.ActivityMainBinding
import com.example.sneakerapp.fragments.SneakerCartFragment
import com.example.sneakerapp.fragments.SneakersFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(SneakersFragment())
        initClickListeners()
    }


    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fContainer, fragment).addToBackStack(null).commit()
    }

    private fun initClickListeners() {
        binding.homeBtn.setOnClickListener {
            replaceFragment(SneakersFragment())
        }

        binding.cartBtn.setOnClickListener {
            replaceFragment(SneakerCartFragment())
        }
    }
}