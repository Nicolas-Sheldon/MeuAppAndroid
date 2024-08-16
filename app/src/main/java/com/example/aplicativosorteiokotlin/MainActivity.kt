package com.example.aplicativosorteiokotlin

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun sortear(view: View) {

        val textResultado = findViewById<TextView>(R.id.text_resultado)
//        val numeroaleatorio = (1..10).random() // Gerar um número aleatório entre 1 e 10

        val numero = Random.nextInt(101) // Gerar um número aleatório entre 1 e 10

        textResultado.setText("Número Sorteado:  $numero")


    }

}