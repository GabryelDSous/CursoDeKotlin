package exercicios

import java.time.LocalDateTime


fun main(args: Array<String>) {
    println("${VERMELHO}--------------------------------------")
    println("\t\t SUA IDADE")
    println("--------------------------------------${RESET}")
    println("${AZUL}Vou conseguir descobrir sua idade${RESET}")
    print("Em que ano você nasceu? ")
    val ano:Int = readLine()!!.toInt()?:2000

    val ANO = LocalDateTime.now()

    println("${AMARELO}------------RESULTADOS--------------")
    println("Atualmente estamos em ${ANO.year}")
    println("Você, que nasceu em ${ano}")
    println("Completa ${AZUL}${ANO.year.minus(ano)} ${AMARELO}esse ano.")
    println("${AMARELO}------------------------------------")
}