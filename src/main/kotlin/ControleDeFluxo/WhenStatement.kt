package ControleDeFluxo

// Utilizando a declaração When... similar ao switch ;case.
fun main() { // Exemplos de cases com seus resultados
        cases("Hello")
        cases(1)
        cases(0L)
        cases(MyClass())
        cases("hello")
    }

    fun cases(obj: Any) {// Função cases a serem chamadas
        when (obj) {
            1 -> println("One")
            "Hello" -> println("Greeting")
            is Long -> println("Long")
            !is String -> println("Not a string")
            else -> println("Unknown")
        }
    }

    class MyClass // classe usada apenas para exemplo do case.
