package exercicios
import java.text.DecimalFormat
fun main(args: Array<String>) {

    val nome:String
    val anoNasc:Int
    val salario:Float


    println("${VERMELHO}--------------------------------------")
    println("\t\t CADASTRO ESTUDONAUTA")
    println("--------------------------------------${RESET}")
    print("Nome do Funcionário: ${VERDE}")
    nome = readLine()!!
    print("${RESET}Ano de Nascimento: ${VERDE}")
    anoNasc = readLine()!!.toInt()
    print("${RESET}Salário: R$${VERDE}")
    salario = readLine()!!.toFloat()
    val formatador = DecimalFormat("#.##0,00")
    val numeroFormatado = formatador.format(salario)


    println("\n${AMARELO}---------FICHA FUNCIONAL----------")
    println("Nome: \t\t\t$nome")
    println("Nascimento: \t$anoNasc")
    println("Salário: \t\tR$$numeroFormatado")
    println("-----------------------------$RESET")

}