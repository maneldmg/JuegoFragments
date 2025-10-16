package com.maneldam.juegofragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.maneldam.juegofragments.databinding.FragmentFirstBinding
import com.maneldam.juegofragments.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentSecondBinding.inflate(inflater)

        binding.Score.setOnClickListener{
            findNavController().navigate(R.id.action_secondFragment_to_scoreFragment, null)
        }

        binding.Final.setOnClickListener{
            findNavController().navigate(R.id.action_secondFragment_to_finalFragment, null)
        }

        return  binding.root
    }

}