package com.manny.darshann.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.manny.darshann.R
import com.manny.darshann.activity.OnBoardingActivity
import com.manny.darshann.adapter.TempleAdapter
import com.manny.darshann.databinding.FragmentHomeBinding
import com.manny.darshann.viewModel.HomeViewModel

class HomeFragment : BaseFragment() {

    private lateinit var binding : FragmentHomeBinding
    private lateinit var linearLayout : RecyclerView.LayoutManager
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home,container,false)
        binding.viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setTempleAdapter()
        openOnBoardingActivity()
    }

    private fun openOnBoardingActivity() {
        binding.tvLogin.setOnClickListener {
            val intent = Intent(requireContext(),OnBoardingActivity::class.java)
            startActivity(intent)
        }
    }


    private fun setTempleAdapter() {
        linearLayout = LinearLayoutManager(requireContext())
        binding.viewModel?.templeEntityLiveData?.observe(viewLifecycleOwner, Observer {
            if (it!=null){
                binding.rvHome.apply {
                    adapter = TempleAdapter(requireContext(),it)
                    layoutManager = linearLayout
                    adapter?.notifyDataSetChanged()
                }
            }
        })
    }
}