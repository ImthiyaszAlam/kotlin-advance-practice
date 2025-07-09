import kotlinx.coroutines.*

fun main() {

    println("Start")
    GlobalScope.launch {
        delay(100)
        println("Inside coroutines")
    }


}
