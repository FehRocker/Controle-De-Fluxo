package ControleDeFluxo

// Expressao when
fun main() {// Exemplos de resultados
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MClass()))
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {// when passado como expressao condicional para atribuir a uma variavel
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class MClass