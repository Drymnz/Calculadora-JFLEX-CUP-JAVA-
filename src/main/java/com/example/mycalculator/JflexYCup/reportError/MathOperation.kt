package com.example.mycalculator.JflexYCup.reportError

import com.example.mycalculator.JflexYCup.Token

data class MathOperation(
    val token: Token,
    val type: ListMathOperation
) {
    override fun toString(): String {
        return "$token-ListMathOperation:$type"
    }
}