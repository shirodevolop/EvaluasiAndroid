package com.example.evaluasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDolar: Button = findViewById(R.id.btn_dolar)
        btnDolar.setOnClickListener(this)

        val btnCelcius: Button = findViewById(R.id.btn_celcius)
        btnCelcius.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_dolar -> {
                val moveIntent = Intent(this@MainActivity, DolarActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_celcius -> {
                val moveIntent = Intent(this@MainActivity, CelciusActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }

}