package com.example.sentmessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonHelp : Button = findViewById(R.id.btn_help)
        val buttonSignUp : Button = findViewById(R.id.btn_signUp)
        val textFacebook : TextView = findViewById(R.id.tv_facebook)
        val loginUser : EditText = findViewById(R.id.et_loginUser)
        val loginPass : EditText = findViewById(R.id.et_loginPass)
        val buttonLogin: Button = findViewById(R.id.btn_login)
        buttonLogin.setOnClickListener {
            textFacebook.textSize = 20F
            textFacebook.text = when{
                loginUser.text.isBlank() && loginPass.text.isBlank() -> "Chưa nhập gì cả"
                loginUser.text.isBlank() || loginPass.text.isBlank() -> "Nhập thiếu rồi"
                else -> "Đăng nhập thành công"
            }
        }

        buttonHelp.setOnClickListener {
            Toast.makeText(this, "Hãy liên hệ email abc@gmail.com", Toast.LENGTH_SHORT).show()
        }

        buttonSignUp.setOnClickListener {
            Toast.makeText(this, "Chúng tôi hiện đang sửa chữa Đăng ký. Xin lỗi vì sự bất tiện này", Toast.LENGTH_SHORT).show()
        }
    }
}