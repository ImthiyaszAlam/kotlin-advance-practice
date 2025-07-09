import kotlinx.coroutines.*


suspend fun fetchUser(): String {
    delay(1000)
    return "👤 User Fetched"
}

fun main() = runBlocking {
    println("🔄 Loading user...")

    val result = fetchUser()
    println("✅ Result: $result")

    launch(Dispatchers.Default) {
        println("📦 Background Work on: ${Thread.currentThread().name}")
    }

    println("🏁 Main Finished")
}
