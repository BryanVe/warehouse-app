package com.example.warehouseapp.ui.views

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.warehouseapp.R
import com.example.warehouseapp.ui.viewModels.WarehouseDetailsViewModel

class WarehouseDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = WarehouseDetailsFragment()
    }

    private lateinit var viewModel: WarehouseDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.warehouse_details_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(WarehouseDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}