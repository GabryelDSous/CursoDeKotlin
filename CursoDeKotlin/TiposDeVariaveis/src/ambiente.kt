import kotlin.math.r
fun main(args: Array<String>) {
    var v1 = 5
    var v2 = 8
    var v3 = 3
    var v4 = 2

    var res = v1 < v2 && !(v3 - 1 != v1 / v4)

    println("O resultado da expressão é [$res]")
}
/*
    false
 */