package com.example.tugasbmi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tugasbmi.ui.theme.TugasBmiTheme

class MainActivity : ComponentActivity() {
    lateinit var edTinggiBadan : EditText
    lateinit var btnhitung : Button
    lateinit var tvhasil :TextView
    lateinit var radioGroup: RadioGroup
    lateinit var radioButtonL: RadioButton
    lateinit var radioButtonP: RadioButton
    lateinit var selectedradio : RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tugasbmilayout)

        edTinggiBadan =findViewById(R.id.edTinggiBadan)
        btnhitung =findViewById(R.id.btnhitung)
        tvhasil =findViewById(R.id.tvhasil)
        radioGroup =findViewById(R.id.rdgroup)
        radioButtonL =findViewById(R.id.laki)
        radioButtonP =findViewById(R.id.perempuan)

        btnhitung.setOnClickListener {
            val selected: Int=radioGroup.checkedRadioButtonId
            if (selected != -1){
                selectedradio=findViewById(selected)

                var jk: String =selectedradio.text.toString()
                if (jk=="Laki-Laki") {
                    var hasil = (edTinggiBadan.text.toString()
                        .toInt() - 100) - ((edTinggiBadan.text.toString().toInt() - 100) * 0.1)
                    tvhasil.text = hasil.toString()
                }else{
                    var hasil = (edTinggiBadan.text.toString().toInt() -100)- ((edTinggiBadan.text.toString().toInt()-100)*0.15)
                    tvhasil.text = hasil.toString()
                }
        }
    }
    }
}