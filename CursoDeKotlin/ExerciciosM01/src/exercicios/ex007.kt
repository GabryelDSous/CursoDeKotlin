package exercicios

fun main(args: Array<String>) {
    println("${VERMELHO}--------------------------------------")
    println("\t\t REAJUSTE SALARIAL")
    println("--------------------------------------${RESET}")

    print("Salário: R$${VERDE}")
    val sal:Float = readLine()!!.toFloat()?:0f
    print("${RESET}Reajuste (%): ${VERDE}")
    val reajuste:Float = readLine()!!.toFloat()?:0f

    val salat = sal.times((reajuste.div(100)))

    println("${AMARELO}------------ REAJUSTANDO --------------")
    println("O salário: anterior era R$$sal")
    println("O aumento será de \t\t$reajuste%")
    println("E passará a ganhar \t\tR$${sal+salat}")
    println("${AMARELO}-----------------------------------")
}