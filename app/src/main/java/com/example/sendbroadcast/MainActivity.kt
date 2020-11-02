package com.example.sendbroadcast

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var receiver : MyReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        configureReceiver()
    }

    fun broadcastIntent(view: View) {
        println("ready to send broadcast intent")
        val intent = Intent()
        intent.action = "com.example.sendbroadcast"
        sendBroadcast(intent)
    }

    private fun configureReceiver() {
        println("reciever registered")
        val filter = IntentFilter()
        filter.addAction("com.example.sendbroadcast")
        receiver = MyReceiver()
        registerReceiver(receiver, filter)
    }

    override fun onDestroy() {
        println("stopping registered receiver")
        super.onDestroy()
        unregisterReceiver(receiver)
    }
}