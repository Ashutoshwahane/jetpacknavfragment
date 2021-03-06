package com.cypherx.jetpacknavigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.cypherx.jetpacknavigationapp.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass.
 */
class SecondFragment : Fragment() {

    lateinit var binding : FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_second, container, false)
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_second,container,false)
        return binding.root
    }

}
