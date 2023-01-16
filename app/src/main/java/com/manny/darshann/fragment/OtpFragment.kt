package com.manny.darshann.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.manny.darshann.R
import com.manny.darshann.activity.OnBoardingActivity
import com.manny.darshann.databinding.FragmentOtpBinding
import com.manny.darshann.databinding.FragmentPhoneNoBinding
import com.manny.darshann.viewModel.OtpViewModel
import com.manny.darshann.viewModel.PhoneNoViewModel

class OtpFragment : BaseFragment() {
    private lateinit var binding : FragmentOtpBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_otp,container,false)
        binding.viewModel = ViewModelProvider(this).get(OtpViewModel::class.java)
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        openPaymentFragment()
    }

    private fun openPaymentFragment() {
        binding.tvVerifyOtp.setOnClickListener {
            (activity as OnBoardingActivity).replaceFragment(PaymentFragment(),true)
        }
    }
}