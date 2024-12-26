package exercicios

fun main(args: Array<String>) {
    println("${VERMELHO}--------------------------------------")
    println("\t\t DOIS VALORES")
    println("--------------------------------------${RESET}")
    print("Valor 1: $VERDE")
    val valor1:Int = readLine()!!.toInt()?:0
    print("${RESET}Valor 2: $VERDE")
    val valor2:Int = readLine()!!.toInt()?:0

    println("${AMARELO}------------RESULTADO--------------")
    println("SOMA: ${AZUL}\t\t\t $valor1 + $valor2 = ${AMARELO}${valor1.plus(valor2)}")
    println("Subtração: ${AZUL}\t\t $valor1 - $valor2 = ${AMARELO}${valor1.minus(valor2)}")
    println("Multiplicação: ${AZUL}  $valor1 * $valor2 = ${AMARELO}${valor1.times(valor2)}")
    println("Divisão: ${AZUL}\t\t $valor1 / $valor2 = ${AMARELO}${valor1.div(valor2.toFloat())}")
    println("Módulo: ${AZUL}\t\t $valor1 % $valor2 = ${AMARELO}${valor1.mod(valor2)}")
    println("${AMARELO}-----------------------------------")
}