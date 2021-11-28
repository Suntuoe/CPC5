package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

const val TAG = "AppCompatActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"Есть в России город Луга")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Петербургского округа;")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Хуже не было б сего")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"Городишки на примете,")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Если б не было на свете")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"Новоржева моего.")
        Log.d(TAG,"Есть в России город Луга")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Новоржева моего.")
    }

}