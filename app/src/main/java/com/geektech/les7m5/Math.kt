package com.geektech.les7m5

class Math {
        fun add(a: String, b: String): String {
            var result = ""
            if (a.isInteger() && b.isInteger()){
                result = (a.toInt() + b.toInt()).toString()
            } else if (a.contains(".") || b.contains(".")) {
                result = "Дроби нельзя использовать"
            } else {
                result = "Напишите целые числа"
            }
            return result
        }
        fun divide(a: String, b: String): String {
            var result = ""
            if (a.isInteger() && b.isInteger() && b != "0"){
                if (((a.toDouble() / b.toDouble()) % 1).toString() == "0.0"||((a.toDouble() / b.toDouble()) % 1).toString() == "-0.0" ){
                    result = (a.toInt() / b.toInt()).toString()
                }else{
                result = (a.toDouble() / b.toDouble()).toString()}
            } else if (a.contains(".") || b.contains(".")) {
                result = "Дроби нельзя использовать"
            } else if (b == "0"){
                result = "На ноль делить нельзя"
            } else {
                result = "Напишите целые числа"
            }

            return result
        }


        fun String.isInteger() = this?.toIntOrNull()?.let { true } ?: false
    }
