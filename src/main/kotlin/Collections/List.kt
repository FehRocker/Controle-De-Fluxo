package Collections
// adicionar uma lista imutavel == listOf()
//adicionar uma lista mutavel == mutableListOf()

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3) // 1 variavel imutavel mas a lista é mutavel
val sudoers: List<Int> = systemUsers          // 2 cópia somente de leitura dentro da variavel sodoers

fun addSystemUser(newUser: Int) {    // 3 função para adicionar elementos na lista
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {     // 4 retornar a cópia de leitura da lista
    return sudoers
}

fun main() {
    addSystemUser(4)                            // 5 adicionar um novo usuário com o ID 4
    println("Tot sudoers: ${getSysSudoers().size}")     // 6 imprimir o total da lista de leitura
    getSysSudoers().forEach {                           // 7 imprimir cada usuário da lista de leitura
            i -> println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error!   // 8 não pode adicionar usuario na lista de leitura pois é imutavel
}