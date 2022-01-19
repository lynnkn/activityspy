package edu.washington.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    // TAG constant
    val TAG = "MainActivity"

    // activity launch callbacks
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate event fired")
        Log.i(TAG, "savedInstanceState is " + savedInstanceState.toString())
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume event fired")
    }

    // activity stop callbacks
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop event fired")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy event fired")
        Log.e(TAG, "We're going down, Captain!")
    }
}