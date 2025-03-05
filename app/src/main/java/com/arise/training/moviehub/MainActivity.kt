package com.arise.training.moviehub

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.arise.training.moviehub.SplashActivity.Companion.EXTRA_NAME

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt(STATE_COUNT)
        }

        val name = intent.getStringExtra(EXTRA_NAME)
        val textView = findViewById<TextView>(R.id.mainTv)
        textView.text = name
        val button = findViewById<Button>(R.id.mainBtn)
        button.setOnClickListener {
            count += 1
            goToDetailActivity()
            Log.d("testapp main", "onClick $count")
        }

        Log.d("testapp main", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("testapp main", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("testapp main", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("testapp main", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("testapp main", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(STATE_COUNT, count)
        Log.d("testapp main", "onSaveInstanceState")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("testapp main", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("testapp main", "onRestart")
    }

    fun goToDetailActivity() {
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }

    companion object {
        const val STATE_COUNT = "STATE_COUNT"
    }
}