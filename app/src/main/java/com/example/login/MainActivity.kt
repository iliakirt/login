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
        binding.loginbtn.setOnClickListener{ loginTip() }

    }
    private fun loginTip() {
        val username = binding.username.text.toString()
        val password = binding.password.text.toString()
        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please fill both fields", Toast.LENGTH_LONG).show()
        }else if (username.length != 11){
            Toast.makeText(this, "AMKA must be 11 digits", Toast.LENGTH_LONG).show()
        }

    }
}


