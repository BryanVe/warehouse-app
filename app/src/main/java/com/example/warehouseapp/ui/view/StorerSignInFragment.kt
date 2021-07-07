package com.example.warehouseapp.ui.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.warehouseapp.R
import com.example.warehouseapp.databinding.StorerSignInFragmentBinding
import com.example.warehouseapp.ui.viewModel.StorerSignInViewModel

class StorerSignInFragment : Fragment() {
    private var _binding: StorerSignInFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: StorerSignInViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = StorerSignInFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(StorerSignInViewModel::class.java)

        binding.btnSignIn.setOnClickListener {
            findNavController().navigate(R.id.warehousesFragment)
        }

    }

}