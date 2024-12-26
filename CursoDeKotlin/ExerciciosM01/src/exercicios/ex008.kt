package exercicios

fun main(args: Array<String>) {
    // Variaveis
    val saque:Float

    println("${VERMELHO}--------------------------------------")
    println("\t\t BANCO ESTUDONAUTA")
    println("--------------------------------------${RESET}")

    print("Qual valor você quer sacar? R$${VERMELHO} ")
    saque = readLine()!!.toFloat()?:0f

    // De 50
    val cinquenta = saque.toInt().div(50)
    var resto = saque.toInt().mod(50)

    // de 10
    val dez = resto.toInt().div(10)
    resto %= 10

    // de 2
    val dois = resto.toInt().div(2)
    resto %= 2

    // de 1
    val um = resto.toInt().div(1)
    resto %= 1


    println("${AMARELO}------------ REAJUSTANDO --------------")
    println("${AMARELO}R$50,00 \t= ${AZUL}$cinquenta cédula(s)")
    println("${AMARELO}R$10,00 \t= ${AZUL}${dez} cédula(s)")
    println("${AMARELO}R$2,00 \t= ${AZUL}${dois} cédula(s)")
    println("${AMARELO}R$1,00 \t= ${AZUL}${um} cédula(s)")
    println("${AMARELO}-----------------------------------")
}