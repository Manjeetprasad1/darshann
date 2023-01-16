package com.manny.darshann.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.manny.darshann.R
import com.manny.darshann.activity.OnBoardingActivity
import com.manny.darshann.databinding.FragmentAccountBinding
import com.manny.darshann.databinding.FragmentPhoneNoBinding
import com.manny.darshann.viewModel.AccountViewModel
import com.manny.darshann.viewModel.PhoneNoViewModel

class PhoneNoFragment : BaseFragment() {
    private lateinit var binding : FragmentPhoneNoBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_phone_no,container,false)
        binding.viewModel = ViewModelProvider(this).get(PhoneNoViewModel::class.java)
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        openOtpScreen()
    }

    private fun openOtpScreen() {
        binding.tvVerifyPhone.setOnClickListener {
            (activity as OnBoardingActivity).replaceFragment(OtpFragment(),true)
        }
    }
}