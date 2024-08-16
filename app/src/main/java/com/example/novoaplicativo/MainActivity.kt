package com.example.novoaplicativo

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//    }
    lateinit var editText: EditText
    lateinit var celsiusRadio: RadioButton
    lateinit var fahrenheitRadio: RadioButton
    lateinit var convertButton: Button
    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        editText = findViewById(R.id.valorTemp) as EditText
        text = findViewById(R.id.valorTemp2) as TextView


        celsiusRadio = findViewById(R.id.CelsiusRadio) as RadioButton
        fahrenheitRadio = findViewById(R.id.FahrenheitRadio) as RadioButton

        convertButton = findViewById(R.id.convertButton) as Button
        convertButton.setOnClickListener { convert(it) }
    }
    fun convert(view: View) {
        var temp = editText.text.toString().toDouble()

        if (celsiusRadio.isChecked) {
            temp = (temp - 32) * 5 / 9
            text.setText(" ${temp.toString()} Celsius")
        } else if (fahrenheitRadio.isChecked) {
            temp = temp * 9 / 5 + 32
            text.setText("${temp.toString()} Fahrenheit")
        }

    }
}