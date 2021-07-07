package com.example.warehouseapp.data.api

import androidx.lifecycle.MutableLiveData
import com.example.warehouseapp.data.model.Producer

interface ApiService {

    fun signInProducer(): MutableLiveData<Producer>

}