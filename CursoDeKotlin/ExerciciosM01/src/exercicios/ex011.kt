package exercicios

import java.time.LocalDateTime

fun main(args: Array<String>) {
    val ano = LocalDateTime.now()
    val mes = ano.monthValue
    val ANO = ano.year
    val semestre = (mes + 5) / 6
    val trimestre = (mes + 2) / 3

    println("${VERMELHO}--------------------------------------")
    println("\t\t ANALISANDO O MÊS ATUAL")
    println("--------------------------------------${AMARELO}")
    println("Estamos no mês ${AZUL}${ano.monthValue} de ${ano.year}${AMARELO}")
    println("Esse mês está no ${AZUL}${semestre}º semestre${AMARELO}")
    println("E está no ${AZUL}${trimestre}º trimestre${AMARELO}")
    println("--------------------------------------")
}