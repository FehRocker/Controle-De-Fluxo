class Animal(val name: String)

class Zoo(val animals: List<Animal>) { // criando uma lista de animais do Zoologico

    operator fun iterator(): Iterator<Animal> {/* operator fun = permite que faça uma estrura de repetição
        dentro da classe Zoo retornando a lista Animal */
        return animals.iterator()
    }
}

fun main() {

    val animals = listOf(Animal("zebra"), Animal("lion"));// colocando a lista de animais
    // dentro da variavel animals
    val zoo = Zoo(animals)// e a variavel animals dentro da variavel zoo.

    for (animal in zoo) { // para cada animal do zoo...
        println("Watch out, it's a ${animal.name}") //frase concatenada com nome do animal
    }

}