package com.manny.darshann.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.manny.darshann.R
import com.manny.darshann.databinding.ActivityOnboardingBinding
import com.manny.darshann.databinding.ItemTempleBinding
import com.manny.darshann.fragment.PhoneNoFragment

class OnBoardingActivity : BaseActivity() {

    private lateinit var binding: ActivityOnboardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        replaceFragment(PhoneNoFragment(),false)

    }

    fun replaceFragment(fragment: Fragment, addToBackStack : Boolean){
        if (addToBackStack){
            val trasition = supportFragmentManager.beginTransaction()
            trasition.replace(R.id.container,fragment)
            trasition.addToBackStack(null)
            trasition.commit()
        }else{
            val trasition = supportFragmentManager.beginTransaction()
            trasition.replace(R.id.container,fragment)
            supportFragmentManager.popBackStack()
            trasition.commit()
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}