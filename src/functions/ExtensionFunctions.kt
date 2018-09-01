package functions

fun main(args: Array<String>) {
    println(5.multiply(10))

    println("Panduka".welcome())

    val l = mutableListOf(1, 2, 3)

    println("Mutable list:$l")
    l.swap(1, 2) // 'this' inside 'functions.swap()' will hold the value of 'l'
    println("Mutable list after swapping:$l")
}

fun Int.multiply(a: Int) = this * a

fun String.welcome() = this.plus("  Welcome")

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}