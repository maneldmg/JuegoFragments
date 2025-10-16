package com.maneldam.juegofragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.maneldam.juegofragments.databinding.FragmentFirstBinding
import com.maneldam.juegofragments.databinding.FragmentInicialBinding

class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentFirstBinding.inflate(inflater)

        binding.GoButton.setOnClickListener{
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment, null)
        }

       return  binding.root
    }


}