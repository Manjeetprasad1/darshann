package com.manny.darshann.activity

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.manny.darshann.R
import com.manny.darshann.databinding.ActivityDashboardBinding
import com.manny.darshann.fragment.AccountsFragments
import com.manny.darshann.fragment.EventsFragments
import com.manny.darshann.fragment.HomeFragment
import com.manny.darshann.fragment.RemindersFragments
import com.manny.darshann.viewModel.DashboardViewModel

class DashboardActivity : BaseActivity() {

    private lateinit var binding : ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_dashboard)
        binding.viewModel = DashboardViewModel()



        /*
       set home fragment default screen
        */

        if (savedInstanceState == null) {
            binding.bottomNavigationView.selectedItemId = R.id.home; // change to whichever id should be default
        }
        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.home -> {
                    // Respond to navigation item click
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.events -> {
                    replaceFragment(EventsFragments())
                    true
                }
                R.id.remainder -> {
                    replaceFragment(RemindersFragments())
                    true
                }
                R.id.account->{
                    replaceFragment(AccountsFragments())
                    true
                }
                else -> false
            }
        }




    }



    private fun replaceFragment(fragment: Fragment){
        val trasition = supportFragmentManager.beginTransaction()
        trasition.replace(R.id.flFragment,fragment)
        trasition.commit()
    }
}