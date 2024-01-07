package com.example.sneakerapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sneakerapp.Utils
import com.example.sneakerapp.model.Sneaker
import kotlinx.coroutines.launch

class SneakerViewModel : ViewModel() {


    private val _sneakersList = MutableLiveData<List<Sneaker>>()
    val sneakersList = _sneakersList as LiveData<List<Sneaker>>

    private val _sneakerCartList = MutableLiveData<List<Sneaker>>()
    val sneakerCartList = _sneakerCartList as LiveData<List<Sneaker>>


    fun getSneakersList() {
        viewModelScope.launch {
            _sneakersList.value = Utils.getSneakersData()
        }
    }

    fun addToCart(sneaker: Sneaker) {
        viewModelScope.launch {
            _sneakerCartList.value = Utils.addToList(sneaker)
        }
    }

    fun removeFromCart(sneaker: Sneaker) {
        viewModelScope.launch {
            _sneakerCartList.value = Utils.removeFromList(sneaker)
        }
    }
}