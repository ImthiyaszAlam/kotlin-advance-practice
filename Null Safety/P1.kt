fun main() {
    val name: String? = "Alam"

    val length = name?.length
    println(length)

    val language: String = "Kotlin"
    val result = language?.substring(2)
    println(result)

    val input: String? = null
    val output = input ?: "Not empty"
    println(output)
}
