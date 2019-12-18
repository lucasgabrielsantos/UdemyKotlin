package br.com.digitalhouse.ktempconverter

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var celciusRadio: RadioButton
    private lateinit var fahrenheitRadio: RadioButton
    private lateinit var converterBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

        converterBtn.setOnClickListener { converter(it) }

    }

    private fun initView() {
        editText = findViewById(R.id.valorTemp)
        celciusRadio = findViewById(R.id.CelsiusRadio)
        fahrenheitRadio = findViewById(R.id.fahrenheitRadio)
        converterBtn = findViewById(R.id.converterButton)
    }


    private fun converter(view: View) {
        var temp: Double = editText.text.toString().toDouble()

        if (celciusRadio.isChecked) {
            temp = (temp - 32 * 5 / 9)

        } else if (fahrenheitRadio.isChecked) {
            temp = (temp * 9 / 5 + 32)
        }
        editText.setText(temp.toString())
    }
}