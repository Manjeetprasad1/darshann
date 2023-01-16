package com.manny.darshann.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.manny.darshann.R
import com.manny.darshann.databinding.FragmentEventsBinding
import com.manny.darshann.databinding.FragmentRemindersBinding
import com.manny.darshann.viewModel.EventsViewModel
import com.manny.darshann.viewModel.RemindersViewModel

class RemindersFragments : BaseFragment() {

    private lateinit var binding : FragmentRemindersBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_reminders,container,false)
        binding.viewModel = ViewModelProvider(this).get(RemindersViewModel::class.java)
        binding.lifecycleOwner = this

        return binding.root
    }
}