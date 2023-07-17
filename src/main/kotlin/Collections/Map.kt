package Collections
// adicionar uma lista imutavel de map == mapOf()
//adicionar uma lista mutavel de map == mutableMapOf()

const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
// 1 chave e valor para cada elemento. elemento 1 com 100, elemento 2 com 100
val EZPassReport: Map<Int, Int> = EZPassAccounts
// 2 copia da lista somente leitura

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        // 3 se existir o Id da conta....
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    // 4 acrescente o valor de points x pass ao saldo da conta...
    } else { // se nao, mensagem de erro
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach {
        // 5 imprimindo a conta com o saldo existente
            k, v -> println("ID $k: credit $v")
    }
}

fun main() {
    accountsReport()                                                                    // 6
    updatePointsCredit(1)                                                               // 7
    updatePointsCredit(1)
    updatePointsCredit(5)                                                               // 8
    accountsReport()                                                                    // 9
}