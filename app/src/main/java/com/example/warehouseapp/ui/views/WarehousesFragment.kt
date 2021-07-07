package com.example.warehouseapp.ui.views

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.warehouseapp.R
import com.example.warehouseapp.ui.viewModels.WarehousesViewModel

class WarehousesFragment : Fragment() {

    companion object {
        fun newInstance() = WarehousesFragment()
    }

    private lateinit var viewModel: WarehousesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.warehouses_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(WarehousesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}