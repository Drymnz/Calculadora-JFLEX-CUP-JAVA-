package com.example.mycalculator.JflexYCup

open class Token(line: Int, column: Int, lexeme: String?)  {
    private var line = 0
    private var column = 0
    private var lexeme: String? = null

    init{
        this.line = line
        this.column = column
        this.lexeme = lexeme
    }

    fun getX(): Int {
        return line
    }

    fun getY(): Int {
        return column
    }

    fun getLexeme(): String? {
        return lexeme
    }

    fun setLexeme(lexeme: String?) {
        this.lexeme = lexeme
    }

}