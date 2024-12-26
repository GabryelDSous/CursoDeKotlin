package exercicios
import kotlin.math.pow
import java.security.Principal

fun main(args: Array<String>) {
    println("${VERMELHO}--------------------------------------")
    println("\t\t CÁCULO DE POTÊNCIA")
    println("--------------------------------------${RESET}")

    print("Base: ${VERDE}")
    val base:Double = readLine()!!.toDouble()
    print("${RESET}Expoente: ${VERDE}")
    val expoente:Double = readLine()!!.toDouble()


    println("${AMARELO}------------RESULTADO--------------")
    println("As notas do aluno foram ${AZUL}$base ${AMARELO}elevado a ${AZUL}$expoente${AMARELO}")
    println("O resultado é ${Math.pow(base,expoente)}")
    println("${AMARELO}-----------------------------------")
}