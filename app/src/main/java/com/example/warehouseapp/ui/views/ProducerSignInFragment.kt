package com.example.warehouseapp.ui.views

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.warehouseapp.R
import com.example.warehouseapp.ui.viewModels.ProducerSignInViewModel

class ProducerSignInFragment : Fragment() {

    companion object {
        fun newInstance() = ProducerSignInFragment()
    }

    private lateinit var viewModel: ProducerSignInViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.producer_sign_in_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProducerSignInViewModel::class.java)
        // TODO: Use the ViewModel
    }

}