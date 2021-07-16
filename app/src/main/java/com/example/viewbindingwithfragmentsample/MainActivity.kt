package com.example.viewbindingwithfragmentsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.Fragment
import com.example.viewbindingwithfragmentsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        with(binding){
            setContentView(root)
            clickBtn.setOnClickListener({
                val fragmentTransaction = supportFragmentManager.beginTransaction()
                val firstFragment : Fragment =  FirstFragment()
                fragmentTransaction.add(R.id.fragment_one, firstFragment)
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.commit()
            })


        }
    }
}