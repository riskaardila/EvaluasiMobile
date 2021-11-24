package com.example.evaluasimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMovekonversiRupiah: Button = findViewById(R.id.btn_konversi_rupiah)
        btnMovekonversiRupiah.setOnClickListener(this)

        val btnMoveKonversiSuhu: Button = findViewById(R.id.btn_konversi_suhu)
        btnMoveKonversiSuhu.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btn_konversi_rupiah -> {
                val konversiRupiah = Intent(this@MainActivity, KonversiRupiah::class.java)
                startActivity(konversiRupiah)
            }
            R.id.btn_konversi_suhu -> {
                val konversiSuhu = Intent(this@MainActivity, KonversiSuhu::class.java)
                startActivity(konversiSuhu)
            }
        }
    }
}