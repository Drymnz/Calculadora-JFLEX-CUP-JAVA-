package com.example.mycalculator.JflexYCup.reportError

import com.example.mycalculator.JflexYCup.Token

data class ReportErrorInterpreter(
    val type: TypeIntreprete,
    val toke: Token,
    val description: String
) {
    override fun toString(): String {
        return "-type:$type-toke$toke-description$description"
    }
}