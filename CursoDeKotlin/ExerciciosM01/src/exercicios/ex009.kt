package exercicios

fun main(args: Array<String>) {
    println("${VERMELHO}--------------------------------------")
    println("\t\t TENTE ADIVINHAR")
    println("--------------------------------------${RESET}")

    println("${AZUL}Vou \"pensar\" em um número entre 0..5${RESET}")
    print("Seu palpite: ${VERDE}")
    val palpite:Int = readLine()!!.toInt()?:0
    val num:Int = (0..5).random()
    println("${AMARELO}------------RESULTADOS--------------")
    println("Você disse que seria o valor ${AZUL}$palpite${AMARELO}")
    println("Eu pensei no número ${num}")
    println("A diferença foi de ${MAGENTA}${palpite.minus(num)}")
    println("${AMARELO}------------------------------------")
}