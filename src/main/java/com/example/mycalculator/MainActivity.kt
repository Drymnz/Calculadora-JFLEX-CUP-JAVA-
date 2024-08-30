package com.example.mycalculator

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mycalculator.JflexYCup.Code.Lexema
import com.example.mycalculator.JflexYCup.Code.parser
import com.example.mycalculator.JflexYCup.reportError.ReportErrorInterpreter
import java.io.Reader
import java.io.StringReader


class MainActivity : AppCompatActivity() {
    var editText: EditText? = null
    var firtsTouch = false

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        editText = findViewById<EditText>(R.id.editText)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun clicOne(view: View) {
        this.editText = findViewById<EditText>(R.id.editText)
        val text = editText!!.text.toString()
        analyzer(text)
    }

    fun analyzer(text: String) {
        val reader: Reader = StringReader(text)
        val lexema: Lexema = Lexema(reader)
        val parse: parser = parser(lexema)

        val send: Bundle = Bundle()

        try {
            parse.parse()
            val textInput = findViewById<TextView>(R.id.textInput)
            // Mostrar el texto
            textInput.setText(parse.resultFinal)
        } catch (e: Exception) {
            println(e)
            println("ERRORRORO")
        }


        //val intent = Intent(this, TableLayoutMathOperation::class.java)
        //intent.putExtra("list_MathOperation",parse.listMathOperation)
        //intent.putExtra("result",parse.resultFinal.toString())
        //println(parse.resultFinal)
        //startActivity(intent)
    }

}