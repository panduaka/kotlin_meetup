package controlflow

import java.util.*

fun main(args: Array<String>) {

    val fruitItems = listOf("apple", "banana", "kiwifruit")
    val androidVersions = mutableListOf<String>("Cupcake", "Donut", "Eclair")
    /**
     * No More Conventional For loops
     */
    for (i in androidVersions.indices) {
        println("${androidVersions[i]}")
    }
    androidVersions.add("Froyo")

//    for (i in androidVersions.indices) {
//        println("${androidVersions[i]}")
//    }

//    for (i in fruitItems.indices) {
//        println("item at $i is ${fruitItems[i]}")
//    }

    for ((i, c) in androidVersions.withIndex()) {
        println("$i: $c")
    }

    /**
     * if else as an expression
     */

//    val max = getMaxOf(4, 1)
//    println("Max: $max")


    /**
     * When Expression
     */
//    println("${adeFilter(7)}")
}


fun getMaxOf(im: Int, tm: Int) = if (im > tm) im else tm


fun adeFilter(age: Int): String {
    return when (age) {
        0, 1, 2, 3, 4 -> ("Go to preschool")

        5 -> ("Go to Kinder garden")

        in 6..17 -> {
            val grade = age - 5
            ("Grade : $grade")
        }

        else -> ("Go to College")
    }
}

//
//fun showDataTypes(): Unit {
//
//    /**
//     * Casting
//     */
//    println("3.14 to Int:: " + 3.14.toInt())
//    println("5 to Double" + 5.toDouble())
//    println("4.56666: " + 4.56666.toInt())
//    println("109 to String :" + 109.toString())
////    println("functions.A to Int: " + 'functions.A'.toInt())
//    println("109 to Int: " + "109".toInt())
//    println("65 to Char: " + 65.toChar())
//
//    /**
//     * String
//     * Operations
//     */
//
//    var longString: String = """This is Long String ........"""
//    println("Length Of Long Strin: ${longString.length}")
//
//    var fName: String = "Jon"
//    var lName: String = "Snow"
//    var fullName: String = fName + " " + lName
//    println("Full Name: $fullName")
//    var po: Int
//
//
//    val string1: String = "functions.A string"
//    val string2: String = "a String"
//
//    println("String Equal: ${string1.equals(string2)}")
////    println("String compare: ${'functions.A'.compareTo('functions.B')}")
//    println("String compare: ${"functions.A".compareTo("C")}")
//    println("Particular Index: ${string1[3]}")               // Particular Index
//    println("Sub Sequence: ${string1.subSequence(4, 6)}")     // Sub Sequence
//    println("Contains: ${string1.contains("ring")}")
//
//    /**
//     * Arrays
//     */
//    /** Type Non Specified */
//
//    var arr = arrayOf(1, 1.4, "Regar")
//
//    println("array size: " + arr.size)
//    println("Index: " + arr[1])
//    println("Contains: ${arr.contains("Jon")}")
//
//    val partOfArray = arr.copyOfRange(1, 2)
//    println("First: ${arr.first()}")
//    println("Last: ${arr.last()}")
//    println("Last Index of: ${arr.lastIndex}")
//    println("Index of: ${arr.indexOf(1.4)}")
//    println("Index of; ${arr.indexOf(5)}")
//
//    var squareArray = Array(5, { x -> x * x })
//    println("size of : ${squareArray.size}")
//
//
//    for (i in squareArray.indices) {
//        println("Item $i : ${squareArray[i]}")
//    }
//
//
//    /**
//     * Ranges
//     */
//    val oneToTen = 1..10
//    val alpha = "functions.A".."H"
//    println("R in Range: ${"R" in alpha}")
//
//    // Reverse range
//    val tenToOne = 10.downTo(4)
//    val twoToTwenty = 2.rangeTo(20)
//    for (i in twoToTwenty) {
//        println("Range two to Twenty: $i")
//    }
//
//    val subRange = twoToTwenty.step(4)
//    for (i in subRange) {
//        println("Item $i : $i}")
//    }
//    for (i in subRange.reversed()) {
//        println("Reversed : $i")
//    }
//    println("2 in range : ${6 in tenToOne}")
//
//    val x = 10
//    val y = 9
//    if (x in 1..y + 1) {
//        println("fits in range")
//    }
//
//    val list = listOf("a", "b", "c")
//    if (-1 !in 0..list.lastIndex) {
//        println("-1 is out of range")
//    }
//
//    for (x in 1..10 step 2) {
//        println(x)
//    }
//    for (x in 9 downTo 0 step 3) {
//        println(x)
//    }
//}

//fun getMaxVal(im: Int, tm: Int): Int {
//    if (im > tm) {
//        return im
//    } else {
//        return tm
//    }
//}

