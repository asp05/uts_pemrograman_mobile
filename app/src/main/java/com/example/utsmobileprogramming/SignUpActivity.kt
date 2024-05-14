package com.example.utsmobileprogramming

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    private val Tag = "SignUp Activity";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val textRegister = findViewById<TextView>(R.id.sgi);

        textRegister.setOnClickListener({
            goToSignInActivity();
        })


        val buttonRegister = findViewById<Button>(R.id.btn_register)
        buttonRegister.setOnClickListener({
            Toast.makeText(this,"Selamat anda berhasil mendaftar",Toast.LENGTH_SHORT).show();
            Log.d(Tag,"Button register di klik");
            goToMainActivity();
        })

    }
    private fun goToSignInActivity() {
        Intent(this, SignInActivity::class.java).also {
            startActivity(it)
        }
    }
    private fun goToMainActivity() {
        Intent(this, MainActivity::class.java).also {
            startActivity(it)
        }
    }
}