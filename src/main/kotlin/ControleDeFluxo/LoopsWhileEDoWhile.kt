fun eatACake() = println("Eat a Cake") // coma um bolo
fun bakeACake() = println("Bake a Cake") // asse um bolo

fun main() {
    var cakesEaten = 0 // bolos comidos
    var cakesBaked = 0 // bolos assados

    while (cakesEaten < 5) { // enquanto a quantidade de bolos comidos for menor que 5 continue comendo
        eatACake() // coma um bolo
        cakesEaten ++ // acrescente 1 aos bolos comidos
    }
            //-------------------------------------
    do { // faça...
        bakeACake() // asse um bolo
        cakesBaked++ // acrescente 1 aos bolos assados
    } while (cakesBaked < cakesEaten) /* enquanto a quantidade de bolos assados for menor que a quantidade
    de bolos comidos, repita o processo de assar*/
}