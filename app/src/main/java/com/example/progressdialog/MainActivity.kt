package com.example.progressdialog

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressDialog = ProgressDialog(this@MainActivity)

        val boton = findViewById<Button>(R.id.boton)

        boton.setOnClickListener {
            progressDialog.setTitle("Dialogo en proceso")
            progressDialog.setMessage("Este es un dialogo \n da click en la pantalla")

            progressDialog.show()
        }
    }
}