package com.example.customviewstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customviewstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), TestView.Listener {

    private lateinit var binding: ActivityMainBinding
    private val menuList = listOf(
        "Edit", "Delete", "Remove", "Exit", "Paint", "Next", "Pause", "Play"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.testView.listener = this
    }

    override fun onClick(index: Int) {
        binding.title.text = menuList[index]
    }
}