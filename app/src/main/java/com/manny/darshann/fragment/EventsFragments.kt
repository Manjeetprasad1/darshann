package com.manny.darshann.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.manny.darshann.R
import com.manny.darshann.databinding.FragmentEventsBinding
import com.manny.darshann.databinding.FragmentHomeBinding
import com.manny.darshann.viewModel.EventsViewModel
import com.manny.darshann.viewModel.HomeViewModel

class EventsFragments : BaseFragment() {

    private lateinit var binding : FragmentEventsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_events,container,false)
        binding.viewModel = ViewModelProvider(this).get(EventsViewModel::class.java)
        binding.lifecycleOwner = this

        return binding.root
    }
}