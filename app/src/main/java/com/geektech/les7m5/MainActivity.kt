package com.geektech.les7m5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.geektech.les7m5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
        Log.e("xvr", ((-4.toDouble() / 2.toDouble()) % 1).toString())
    }

    private fun initClickers() {
        with(binding){
            calculateBtn.setOnClickListener{
                resultTv.text = Math().add(firstEd.text.toString(),secondEd.text.toString())
            }
            calculateBtn.setOnClickListener{
                resultTv.text = Math().divide(firstEd.text.toString(),secondEd.text.toString())
            }
        }
    }
}