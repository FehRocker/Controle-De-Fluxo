package Collections
// os Sets nao sao ordenados como uma List, e nao permitem valores duplicados
// adicionar uma lista imutavel de set == setOf()
//adicionar uma lista mutavel de set == mutableSetOf()

val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")
// 1 variavel imutavel com uma lista de Set mutavel

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
// 2 adicionando itens a lista
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."
// 3 condição de estatus da lista, se foi adicionado corretamente ou nao.
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")   // 4 adicionando um novo valor valido
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")
// 5 adicionando um valor ja existente
}