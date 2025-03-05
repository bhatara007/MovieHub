package com.arise.training.moviehub

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.d("testapp detail", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("testapp detail", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("testapp detail", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("testapp detail", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("testapp detail", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("testapp detail", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("testapp detail", "onRestart")
    }
}