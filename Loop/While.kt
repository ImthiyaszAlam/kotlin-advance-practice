fun main() {

    val items = listOf("a", "b", "c", "d")

    for (item in items) {
        println("$item,")
    }

    println("")

    for (i in 1..4) {
        print("$i,")
    }


    println("message")


    for(i in 5 downTo 1){
        println("Tick $i ")
    }
   
}
