package com.example.warehouseapp.ui.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.warehouseapp.R
import com.example.warehouseapp.ui.viewModel.AddProductOnWarehouseViewModel

class AddProductOnWarehouseFragment : Fragment() {

    companion object {
        fun newInstance() = AddProductOnWarehouseFragment()
    }

    private lateinit var viewModel: AddProductOnWarehouseViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_product_on_warehouse_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddProductOnWarehouseViewModel::class.java)
        // TODO: Use the ViewModel
    }

}