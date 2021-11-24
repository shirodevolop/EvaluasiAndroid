package com.example.evaluasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class DolarActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var rupiah:EditText
    private lateinit var hasilDolar:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dolar)

        rupiah = findViewById(R.id.input_rupiah)
        hasilDolar = findViewById(R.id.hasil_dolar)

        val btnKnfersi:Button= findViewById(R.id.btn_konfersi)
        btnKnfersi.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_konfersi) {
            val inputRupiah = rupiah.text.toString().trim()
            var isEmptyFields = false
            if (inputRupiah.isEmpty()) {
                isEmptyFields = true
                rupiah.error = "Field ini tidak boleh kosong"
            }
            if (!isEmptyFields) {
                val dolar = inputRupiah.toDouble() / 15000
                hasilDolar.text = "$ $dolar "
            }
        }
    }

}