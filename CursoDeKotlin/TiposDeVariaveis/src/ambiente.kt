    //n.inc() // para funcionar tem que ser n = n.inc()
fun main(args: Array<String>) {
    var a = 3
    var b = 4
    var c = 5

    var res = a++ + --b + ++c

    println("O valores são $a, $b e $c")
    println("O resultado é $res")
}
/*
    a = 4
    b = 3
    c = 6

    res = 12
 */