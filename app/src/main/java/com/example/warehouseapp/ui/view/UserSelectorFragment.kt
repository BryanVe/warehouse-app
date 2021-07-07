package com.example.warehouseapp.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.warehouseapp.R
import com.example.warehouseapp.databinding.UserSelectorFragmentBinding
import com.example.warehouseapp.ui.viewModel.UserSelectorViewModel

class UserSelectorFragment : Fragment() {
    private var _binding: UserSelectorFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: UserSelectorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = UserSelectorFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(UserSelectorViewModel::class.java)

        binding.btnStorerSignIn.setOnClickListener {
            findNavController().navigate(R.id.storerSignInFragment)
        }

        binding.btnProducerSignIn.setOnClickListener {
            findNavController().navigate(R.id.producerSignInFragment)
        }

        binding.btnProducerSignUp.setOnClickListener {
            findNavController().navigate(R.id.producerSignUpFragment)
        }
    }

}