package com.manny.darshann.activity

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.manny.darshann.R
import com.manny.darshann.databinding.ActivityAccountSecondBinding
import com.manny.darshann.viewModel.AccountTwoViewModel
import java.nio.channels.InterruptedByTimeoutException


class AccountActivity : BaseActivity() {

    private lateinit var binding: ActivityAccountSecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_account_second)
        binding.viewModel = AccountTwoViewModel()

        openAddAccountActivity()
    }

    private fun openAddAccountActivity() {
        binding.ivEdit.setOnClickListener {
            val intent = Intent(this,AddAccountDetails::class.java)
            startActivity(intent)
        }
    }

}