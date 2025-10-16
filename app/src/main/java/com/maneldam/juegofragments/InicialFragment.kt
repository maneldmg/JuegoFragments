package com.maneldam.juegofragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.maneldam.juegofragments.databinding.FragmentInicialBinding



class InicialFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentInicialBinding.inflate(inflater)

        binding.button.setOnClickListener{
            findNavController().navigate(R.id.action_inicialFragment_to_firstFragment, null)
        }
        return binding.root
    }

}