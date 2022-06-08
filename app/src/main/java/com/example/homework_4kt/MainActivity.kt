package com.example.homework_4kt

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import androidx.lifecycle.ViewModelProvider

import com.example.homework_4kt.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: FragmentViewModel

    private val fragmentList = listOf(
        FirstFragment(), SecondFragment(), ThirdFragment()
    )

    private val fragmentListTitles = listOf(
        "First Fragment", "Second Fragment", "Third Fragment"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[FragmentViewModel::class.java]

        val adapter = ViewPagerAdapter(this, fragmentList)
        binding.viewPager.adapter = adapter
        TabLayoutMediator(binding.tab, binding.viewPager) { tab, pos ->
            tab.text = fragmentListTitles[pos]
        }.attach()
    }
}