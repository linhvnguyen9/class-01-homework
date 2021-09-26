package com.example.classperson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var birthYear: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstName: EditText = findViewById(R.id.et_firstName)
        val lastName: EditText = findViewById(R.id.et_lastName)
        birthYear= findViewById(R.id.et_birthYear)
        val buttonNext: Button = findViewById(R.id.btn_Next)
        val data = firstName.text
        val data1 = lastName.text
        val data2 = birthYear.text
        buttonNext.setOnClickListener {
            val intent = Intent(applicationContext,OutPutActivity::class.java)
            val person = Person(data,data1, data2.toString().toInt())
            intent.putExtra("Name",person.fullName)
            intent.putExtra("Age",person.dataAge)
            intent.putExtra("Job",person.job)
            startActivity(intent)
        }
    }
}
class Person(var firstName: Editable, var lastName: Editable, var birthYear: Int){
    val fullName: String
        get() = "$firstName $lastName"
    private val age: Int
    get() = 2021 - birthYear
    val dataAge = age.toString()
    val job: String = when{
        age < 18 -> "Học sinh"
        age <= 25 -> "Sinh viên"
        else -> "Đi làm"
    }
}
