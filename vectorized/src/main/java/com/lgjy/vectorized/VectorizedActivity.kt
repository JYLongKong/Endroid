package com.lgjy.vectorized

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lgjy.vectorized.databinding.ActivityVectorizedBinding

/**
 * Created by LGJY on 2023/2/27.
 * Email：longgangjy@gmail.com
 */

class VectorizedActivity: AppCompatActivity() {

    private lateinit var binding: ActivityVectorizedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityVectorizedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTry.setOnClickListener {
            binding.tvLog.text = stringFromJNI()
        }
    }

    private external fun stringFromJNI(): String

    companion object {

        init {
            System.loadLibrary("vectorized")
        }
    }
}
