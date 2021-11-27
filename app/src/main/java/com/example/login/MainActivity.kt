package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.loginbtn.setOnClickListener{ login() }
    }
    private fun login() {
        val user = "12345678901"
        val pass = "admin"
        val username = binding.username.text.toString()
        val password = binding.password.text.toString()
        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please fill both fields", Toast.LENGTH_LONG).show()
        } else if (username.length != 11) {
            Toast.makeText(this, "AMKA must be 11 digits", Toast.LENGTH_LONG).show()
        }else {
            if (username == user && password == pass){
                Toast.makeText(this, "Login Successfully", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "incorrect AMKA or password", Toast.LENGTH_LONG).show()
            }
        }
    }
}


