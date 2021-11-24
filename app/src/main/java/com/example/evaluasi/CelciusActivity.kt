package com.example.evaluasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CelciusActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var suhu:EditText
    private lateinit var hasilReamur:TextView
    private lateinit var hasilFahreit:TextView
    private lateinit var hasilKelfin:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_celcius)

        suhu = findViewById(R.id.input_suhu)
        hasilReamur = findViewById(R.id.reamus)
        hasilFahreit = findViewById(R.id.Fahreit)
        hasilKelfin = findViewById(R.id.Kelfin)

        val btnKonfersi:Button = findViewById(R.id.btn_konfersi)
        btnKonfersi.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_konfersi) {
            val inputSuhu = suhu.text.toString().trim()
            var isEmptyFields = false
            if (inputSuhu.isEmpty()) {
                isEmptyFields = true
                suhu.error = "Field ini tidak boleh kosong"
            }
            if (!isEmptyFields) {
                val fanrenheit = ((9 * inputSuhu.toDouble()) / 5) + 32
                val reamus = (4 * inputSuhu.toDouble()) / 5
                val kelvin = inputSuhu.toDouble() + 273.15
                hasilReamur.text = "$reamus Reamus"
                hasilFahreit.text = "$fanrenheit Farenheit"
                hasilKelfin.text = "$kelvin Kelfin"
            }
        }
    }
}