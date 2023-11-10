package com.example.activity1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi komponen
        var edTglLahir = findViewById<EditText>(R.id.ed_tanggal_lahir)
        var btnKlik = findViewById<Button>(R.id.btn_klik)
        var tvHasil = findViewById<TextView>(R.id.tv_hasil)

        // Tombol diklik - ambil hasil dari edTglLahir
        btnKlik.setOnClickListener {
            var input = edTglLahir.text.toString()
            val hasil = when (input.toInt()) {
                in 1946..1964 -> "Baby Boombers"
                in 1965..1980 -> "X"
                in 1981..1995 -> "Millenial"
                in 1996..2010 -> "Z"

                else -> "Gak tau Mas"
            }

            tvHasil.text = "Kamu generasi ${hasil.toString()}"
        }
    }
}