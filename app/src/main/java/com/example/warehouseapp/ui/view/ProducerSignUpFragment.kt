package com.example.warehouseapp.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.warehouseapp.R
import com.example.warehouseapp.databinding.ProducerSignUpFragmentBinding
import com.example.warehouseapp.ui.viewModel.ProducerSignUpViewModel

class ProducerSignUpFragment : Fragment() {
    private var _binding: ProducerSignUpFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: ProducerSignUpViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ProducerSignUpFragmentBinding.inflate(inflater, container, false)
        this.setHasOptionsMenu(true);
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProducerSignUpViewModel::class.java)

        binding.btnSignUp.setOnClickListener {
            findNavController().navigate(R.id.producerSignInFragment)
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id: Int = item.itemId
        //do something with your id
        return super.onOptionsItemSelected(item)
    }

}