import java.time.LocalDateTime
fun main(args: Array<String>) {
    val dh = LocalDateTime.now()
    println("Dia Atual: ${dh.dayOfMonth}")
    println("Mês Atual: ${dh.monthValue}")
    println("Ano Atual: ${dh.year}")
    println("---------------------------------")
    println("Hora Atual: ${dh.hour}")
    println("Minuto Atual: ${dh.minute}")
    println("Segundo atual: ${dh.second}")
}