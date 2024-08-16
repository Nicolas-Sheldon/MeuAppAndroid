package com.example.calculadora

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var num1: EditText
    lateinit var num2: EditText
    lateinit var kg1: EditText
    lateinit var kg2: EditText
    lateinit var txt4: TextView



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

    fun calcular(view: View) {

        num1 = findViewById(R.id.preco1)//chamando o id do num1
        num2 = findViewById(R.id.preco2)
        kg1 = findViewById(R.id.kg1)
        kg2 = findViewById(R.id.kg2)
        txt4 = findViewById(R.id.resultado)

        var precoUnitA = 0.00
        var precoUnitB = 0.00
        var n1 = num1.text.toString().toDouble()//convertendo para double
        var n2 = num2.text.toString().toDouble()
        var kg1 = kg1.text.toString().toDouble()
        var kg2 = kg2.text.toString().toDouble()


        precoUnitA = n1 / kg1
        precoUnitB = n2 / kg2

        var precoKgA = 0.00
        var precoKgB = 0.00

        precoKgA = precoUnitA * 1000
        precoKgB = precoUnitB * 1000


        melhorCompra(precoKgA, precoKgB)
    }
    fun melhorCompra(a: Double, b: Double) {
        if (a == b) {
            txt4.setText("Compre qualquer uma")

        } else if (a < b) {
            txt4.setText("Compre o produto 01")
        } else {
            txt4.setText("Compre compre o produto 02")
        }
    }
}