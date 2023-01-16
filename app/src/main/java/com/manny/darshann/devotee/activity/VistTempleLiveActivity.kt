package com.manny.darshann.devotee.activity

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.manny.darshann.R
import com.manny.darshann.activity.BaseActivity
import com.manny.darshann.databinding.ActivityViewTempleLiveBinding
import com.manny.darshann.devotee.viewModel.VistTempleLiveViewModel

class VistTempleLiveActivity : BaseActivity() {
    private lateinit var binding: ActivityViewTempleLiveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_temple_live)
        binding.viewModel = VistTempleLiveViewModel()

        openViewLiveActivity()

    }

    private fun openViewLiveActivity() {
        binding.tvViewLive.setOnClickListener {
            val intent = Intent(this@VistTempleLiveActivity,ViewLiveActivity::class.java)
            startActivity(intent)
        }
    }
}