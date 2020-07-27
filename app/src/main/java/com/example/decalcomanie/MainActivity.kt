package com.example.decalcomanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         *
         * permission allowed => goto ProcessingActivity.
         * permission denied => goto CheckPermissionActivity.
         *
         */
        val btnStart: TextView = findViewById(R.id.btn_start)
        btnStart.setOnClickListener {
            // check permission.
        }


    }
}