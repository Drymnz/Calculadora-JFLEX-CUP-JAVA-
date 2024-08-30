package com.example.mycalculator

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mycalculator.JflexYCup.reportError.MathOperation
import java.util.ArrayList

class TableLayoutMathOperation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val listMath = getIntent().getSerializableExtra("list_MathOperation")
        val stringData = intent.getStringExtra("result").toString()
        if (listMath != null && stringData != null) {
            val textInput = findViewById<TextView>(R.id.textInputTable)
            textInput.setText(stringData.toString())
        }

        if (stringData != null) {
            val textInput = findViewById<TextView>(R.id.OtraOPortunida)
            println(stringData)
            textInput.text = stringData
            //textInput.setText("hola mundo")
            //textInput.setText("hola mundo")
        }

        enableEdgeToEdge()
        setContentView(R.layout.activity_table_layout_math_operation)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        fun drawTable(list: ArrayList<MathOperation>) {

        }
    }
}