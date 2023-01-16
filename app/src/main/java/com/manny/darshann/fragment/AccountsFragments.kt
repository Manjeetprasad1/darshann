package com.manny.darshann.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.manny.darshann.R
import com.manny.darshann.activity.AccountActivity
import com.manny.darshann.adapter.UserAdapter
import com.manny.darshann.databinding.FragmentAccountBinding
import com.manny.darshann.databinding.FragmentRemindersBinding
import com.manny.darshann.viewModel.AccountViewModel
import com.manny.darshann.viewModel.RemindersViewModel

class AccountsFragments : BaseFragment() {

    private lateinit var binding : FragmentAccountBinding
    private lateinit var gridLayoutManager: GridLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_account,container,false)
        binding.viewModel = ViewModelProvider(this).get(AccountViewModel::class.java)
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUserAdapter()
        openSecondAccountActivity()
    }

    private fun openSecondAccountActivity() {
        binding.tvAccount.setOnClickListener {
            val intent = Intent(requireContext(),AccountActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setUserAdapter() {
        gridLayoutManager = GridLayoutManager(requireContext(),2,GridLayoutManager.HORIZONTAL,false)
        binding.viewModel?.userEntityLiveData?.observe(viewLifecycleOwner, Observer {
            if (it!=null){
                binding.rvUser.apply {
                    adapter = UserAdapter(requireContext(),it)
                    layoutManager = gridLayoutManager
                    adapter?.notifyDataSetChanged()
                }
            }
        })
    }
}