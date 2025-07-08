fun <T> getFirstItem(list: List<T>): T? {
    return list.firstOrNull()
}

fun main() {
    println("Generic Classes")
    println(getFirstItem(listOf(1, 2, 3)))
    println(getFirstItem(listOf("alam", "anna", "kotlin")))
}
