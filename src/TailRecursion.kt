fun main(args: Array<String>) {

    println("factorial: ${fact(5)}")

}

fun fact(x: Int): Int {
    tailrec fun factorialTail(y: Int, z: Int): Int {
        return if (y == 0) z
        else factorialTail(y - 1, y * z)
    }
    return factorialTail(x, 1)
}