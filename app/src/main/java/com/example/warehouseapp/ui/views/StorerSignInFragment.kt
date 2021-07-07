package com.example.warehouseapp.ui.views

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.warehouseapp.R
import com.example.warehouseapp.ui.viewModels.StorerSignInViewModel

class StorerSignInFragment : Fragment() {

    companion object {
        fun newInstance() = StorerSignInFragment()
    }

    private lateinit var viewModel: StorerSignInViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.storer_sign_in_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(StorerSignInViewModel::class.java)
        // TODO: Use the ViewModel
    }

}