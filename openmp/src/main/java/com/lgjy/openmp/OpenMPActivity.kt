package com.lgjy.openmp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lgjy.openmp.databinding.ActivityOpenmpBinding

/**
 * Created by LGJY on 2023/2/27.
 * Email：longgangjy@gmail.com
 */

class OpenMPActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOpenmpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOpenmpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTry.setOnClickListener {
            binding.tvLog.text = stringFromJNI()
        }
    }

    external fun stringFromJNI(): String

    companion object {

        init {
            System.loadLibrary("mpdemo")
        }
    }
}
