package com.example.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.snack1).setOnClickListener {
            val context = findViewById<Button>(R.id.snack1)
            Snackbar.make(context , "Snack bar is here...", Snackbar.LENGTH_SHORT)
                .show()
        }
    }
}