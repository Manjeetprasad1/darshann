package com.manny.darshann.activity

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.manny.darshann.R
import com.manny.darshann.databinding.ActivityAddAccountBinding
import com.manny.darshann.viewModel.AddAccountViewModel


class AddAccountDetails : BaseActivity() {

    private lateinit var binding : ActivityAddAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_account)
        binding.viewModel = AddAccountViewModel()
    }

}