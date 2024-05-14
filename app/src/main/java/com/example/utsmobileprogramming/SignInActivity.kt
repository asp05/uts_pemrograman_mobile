package com.example.utsmobileprogramming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    val Tag = "SignIn Activity";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val textRegister = findViewById<TextView>(R.id.sgu);

        textRegister.setOnClickListener({
            goToSignUpActivity();
        })

        val buttonRegister = findViewById<Button>(R.id.btn_signin)
        buttonRegister.setOnClickListener({
            Toast.makeText(this,"Selamat anda berhasil login", Toast.LENGTH_SHORT).show();
            Log.d(Tag,"Button login di klik");
            goToMainActivity();
        })
    }

    private fun goToSignUpActivity() {
        Intent(this, SignUpActivity::class.java).also {
            startActivity(it)
        }
    }

    private fun goToMainActivity() {
        Intent(this, MainActivity::class.java).also {
            startActivity(it)
        }
    }
}