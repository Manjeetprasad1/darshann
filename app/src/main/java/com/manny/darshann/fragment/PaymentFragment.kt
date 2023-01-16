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
import com.manny.darshann.databinding.FragmentPaymentBinding
import com.manny.darshann.viewModel.OtpViewModel
import com.manny.darshann.viewModel.PaymentViewModel

class PaymentFragment : BaseFragment() {
    private lateinit var binding : FragmentPaymentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_payment,container,false)
        binding.viewModel = ViewModelProvider(this).get(PaymentViewModel::class.java)
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        openPaymentConfirmationFragment()
    }

    private fun openPaymentConfirmationFragment() {
        binding.tvConfirmPayment.setOnClickListener {
            (activity as OnBoardingActivity).replaceFragment(PaymentConfirmationFragment(),true)
        }
    }
}