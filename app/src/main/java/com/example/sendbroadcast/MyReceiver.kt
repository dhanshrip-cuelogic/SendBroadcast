package com.example.sendbroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        println("inside onReceive()")
       Toast.makeText(context,"Broadcas received",Toast.LENGTH_LONG).show()
    }
}
