inline fun operate(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

inline fun product(a: Int, b: Int, pro: (Int, Int) -> Int): Int {
    return pro(a, b)
}

fun main() {
    val result = operate(5, 2) { x, y -> x * y }
    println(result)
    val result1 = product(3, 5) { a, b -> a * b }
    println(result1)
}
