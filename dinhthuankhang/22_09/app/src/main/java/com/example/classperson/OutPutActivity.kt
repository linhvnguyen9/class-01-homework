package com.example.classperson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OutPutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_out_put)
        val intent = intent
        val fullName: TextView = findViewById(R.id.tV_fullName)
        val age : TextView = findViewById(R.id.tV_age)
        val job : TextView = findViewById(R.id.tV_job)
        fullName.text = intent.getStringExtra("Name")
        age.text = intent.getStringExtra("Age")
        job.text = intent.getStringExtra("Job")
    }
}