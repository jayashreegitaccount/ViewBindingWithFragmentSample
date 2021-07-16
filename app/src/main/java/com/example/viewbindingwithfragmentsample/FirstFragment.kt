package com.example.viewbindingwithfragmentsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewbindingwithfragmentsample.databinding.FragmentFirstBinding


public class FirstFragment : Fragment() {
   lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater,container,false)
        binding.changeTextBtn.setOnClickListener({
            binding.changingText.setText("fragment Changed")
            val secondFragmnt : Fragment = SecondFragment()
            val fragmentTransaction = activity?.supportFragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.fragment_two, secondFragmnt)
            fragmentTransaction?.addToBackStack(null)
            fragmentTransaction?.commit()

        })
        return binding.root
    }
}