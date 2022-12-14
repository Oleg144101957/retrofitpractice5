package com.vishnevskiypro.retrofitpractice5.screens.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.vishnevskiypro.retrofitpractice5.R
import com.vishnevskiypro.retrofitpractice5.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private lateinit var adapter: SecondAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        val mViewModel = ViewModelProvider(this).get(SecondViewModel::class.java)

        binding = FragmentSecondBinding.inflate(layoutInflater, container, false)
        adapter = SecondAdapter()
        recyclerView = binding.rvSecond
        recyclerView.adapter = adapter

        mViewModel.getBeznalForViewModel()

        mViewModel.myMoneyList.observe(viewLifecycleOwner, { list ->
            list.body()?.let { adapter.setList(it) }
        })

        return binding.root
    }

}