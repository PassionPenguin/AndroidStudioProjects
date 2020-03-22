package com.passionpenguin.helloworldtemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class DisplayMsgActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_msg)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra("value")
        findViewById<TextView>(R.id.resultText).text = message
    }
}