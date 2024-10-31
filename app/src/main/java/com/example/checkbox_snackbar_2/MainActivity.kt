package com.example.checkbox_snackbar_2

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

      private lateinit var textcheckbox: TextView
      private lateinit var textTv: TextView
      private lateinit var checkbox: CheckBox




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        textcheckbox = findViewById(R.id.editText)
        textTv = findViewById(R.id.textView2)
        checkbox = findViewById(R.id.checkBox)

        checkbox.setOnCheckedChangeListener { button,isChecked ->

                if(isChecked) { textcheckbox.text = "Правила дорожного движения"; textTv.text = Rules().getText()}
                    else { textcheckbox.text = "Информация"; textTv.setText("")}
        }


        }
    }
         class Rules(){
         private val text = "12.1. Остановка и стоянка транспортных средств разрешаются на правой стороне дороги на обочине, а при ее отсутствии — на проезжей части у ее края и в случаях, установленных пунктом 12.2 Правил, — на тротуаре.\n" +
                 "\n" +
                 "На левой стороне дороги остановка и стоянка разрешаются в населенных пунктах на дорогах с одной полосой движения для каждого направления без трамвайных путей посередине и на дорогах с односторонним движением (грузовым автомобилям с разрешенной максимальной массой более 3,5 т на левой стороне дорог с односторонним движением разрешается лишь остановка для загрузки или разгрузки)."
           fun getText()= text
        }