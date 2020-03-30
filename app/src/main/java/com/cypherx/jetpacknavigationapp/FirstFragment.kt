package com.cypherx.jetpacknavigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.cypherx.jetpacknavigationapp.databinding.FragmentFirstBinding
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {
    lateinit var binding : FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_first, container, false)

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_first,container,false)

        binding.letstryButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_firstFragment2_to_secondFragment2)
        }

        return binding.root

    }

}