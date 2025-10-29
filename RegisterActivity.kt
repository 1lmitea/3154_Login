package com.example.a3154_login

import android.os.Bundle
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

        val spinnerKota: Spinner = findViewById(R.id.spinner_kota)
        val rgGender: RadioGroup = findViewById(R.id.rg_gender)
        val cbAgree: CheckBox = findViewById(R.id.cb_agree)
        val btnRegister: Button = findViewById(R.id.btn_submit_register)

        ArrayAdapter.createFromResource(
            this,
            R.array.daftar_kota,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerKota.adapter = adapter
        }

        btnRegister.setOnClickListener {
            val selectedGenderId = rgGender.checkedRadioButtonId
            val selectedGender = when (selectedGenderId) {
                R.id.rb_pria -> "Pria"
                R.id.rb_wanita -> "Wanita"
                else -> "Belum dipilih"
            }
            val selectedKota = spinnerKota.selectedItem.toString()
            val isChecked = cbAgree.isChecked

            Toast.makeText(
                this,
                "Jenis Kelamin: $selectedGender\nDomisili: $selectedKota\nSetuju: $isChecked",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}