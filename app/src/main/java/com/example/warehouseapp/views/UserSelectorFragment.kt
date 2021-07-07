package com.example.warehouseapp.views

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.warehouseapp.R
import com.example.warehouseapp.viewModels.UserSelectorViewModel

class UserSelectorFragment : Fragment() {

    companion object {
        fun newInstance() = UserSelectorFragment()
    }

    private lateinit var viewModel: UserSelectorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.user_selector_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(UserSelectorViewModel::class.java)
        // TODO: Use the ViewModel
    }

}