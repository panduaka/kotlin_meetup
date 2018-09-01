package returnmultiple

fun main(args: Array<String>) {
    val (returnOne, retunrTwo) = functionReturningTwoValues(10)
    println("Returned Values:$returnOne & $retunrTwo")

    val (x1, x2) = functionReturningTwoValues(10, 9)
    println("Larger Number: $x1 and if 10 is larger: $x2")
}


fun functionReturningTwoValues(num1: Int): Pair<Int, Int> {
    return Pair(num1 - 1, num1 + 1)
}

fun functionReturningTwoValues(num1: Int, num2: Int): Pair<Int, Boolean> {
    return if (num1 > num2) Pair(num1, true) else Pair(num2, false)
}