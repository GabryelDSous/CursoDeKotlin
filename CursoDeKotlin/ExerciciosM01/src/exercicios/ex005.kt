package exercicios

fun main(args: Array<String>) {
    println("${VERMELHO}--------------------------------------")
    println("\t\t NOTAS ESTUDONAUTA")
    println("--------------------------------------${RESET}")
    print("Nota 1: $VERDE")
    val nota1:Float = readLine()!!.toFloat()?:0f
    print("${RESET}Nota 2: $VERDE")
    val nota2:Float = readLine()!!.toFloat()?:0f

    println("${AMARELO}------------RESULTADO--------------")
    println("As notas do aluno foram $nota1 e $nota2")
    println("A média final foi ${(nota1.plus(nota2)).div(2)}")
    println("${AMARELO}-----------------------------------")
}