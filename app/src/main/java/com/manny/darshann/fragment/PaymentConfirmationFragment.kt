package com.manny.darshann.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.manny.darshann.R
import com.manny.darshann.databinding.FragmentPaymentBinding
import com.manny.darshann.databinding.FragmentPaymentConfirmationBinding
import com.manny.darshann.devotee.activity.VistTempleLiveActivity
import com.manny.darshann.viewModel.PaymentConfirmationViewModel
import com.manny.darshann.viewModel.PaymentViewModel

class PaymentConfirmationFragment : BaseFragment() {
    private lateinit var binding : FragmentPaymentConfirmationBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_payment_confirmation,container,false)
        binding.viewModel = ViewModelProvider(this).get(PaymentConfirmationViewModel::class.java)
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        openLiveTempleActivity()
    }

    private fun openLiveTempleActivity() {
        binding.tvVisitTemple.setOnClickListener {
            val intent = Intent(requireContext(),VistTempleLiveActivity::class.java)
            startActivity(intent)
        }
    }
}