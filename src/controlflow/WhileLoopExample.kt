package controlflow

import java.util.*

fun main(args: Array<String>) {

    /**
     * Random Value
     */
    val rand = Random() // Create an object. No new Key word is used
    val randomInteger: Int = rand.nextInt(50) + 1

    var guess = 0

    while (guess != randomInteger) {
        println("Incremented : ${guess++}")
    }

}

