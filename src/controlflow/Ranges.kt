package controlflow

fun main(args: Array<String>) {
    /**
     * Ranges In Kotlin
     * Marvelous
     */

    val x = 10
    val y = 9
//    if (x in 1..y+1) {
//        println("fits in range")
//    }


    val oneToTen = 1..10
    val reverseRange = 100.downTo(10)

//    for (i in oneToTen.iterator()) {
//        println("$i")
//    }

//    for (i in reverseRange.step(10)) {
//        println("$i")
//    }

    val alpha = "A".."U"
    println("R in Range: ${"R" in alpha}")



//    val list = listOf("a", "b", "c")
//    if (-1 !in 0..list.lastIndex) {
//        println("-1 is out of range")
//    }
//
//    if (list.size !in list.indices) {
//        println("list size is out of valid list indices range too")
//    }

}