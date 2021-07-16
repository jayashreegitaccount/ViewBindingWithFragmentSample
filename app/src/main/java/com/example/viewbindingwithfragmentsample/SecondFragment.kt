package com.example.viewbindingwithfragmentsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.viewbindingwithfragmentsample.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        binding.changeFragmentBtn.setOnClickListener({
            val fragment1: Fragment = FirstFragment()
            val fragmentTranscation  = activity?.supportFragmentManager?.beginTransaction()
            fragmentTranscation?.replace(R.id.fragment_one, fragment1)
            fragmentTranscation?.addToBackStack(null)
            fragmentTranscation?.commit()

        })
        return binding.root
    }
}