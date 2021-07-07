package com.example.warehouseapp.ui.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.warehouseapp.databinding.WarehousesFragmentBinding
import com.example.warehouseapp.ui.viewModel.WarehousesViewModel

class WarehousesFragment : Fragment() {
    private var _binding: WarehousesFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: WarehousesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = WarehousesFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(WarehousesViewModel::class.java)

        binding.btnCreateWarehouse.setOnClickListener {
            // TODO: open dialog for creating warehouse
        }

    }

}