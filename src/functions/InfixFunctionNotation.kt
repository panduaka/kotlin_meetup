package functions

fun main(args: Array<String>) {
    val a: Boolean = true
    val b: Boolean = false
    var result: Boolean

    result = a or b // a.or(b)
    println("result = $result")

    result = a and b // a.and(b)
    println("result = $result")

    val pyramid = Structure()

    /**
     * Don't need . and parenthesis
     */
    pyramid createPyramid 6
    /**
     * As same as
     */
//    pyramid.createPyramid(6)
}

//class x
//
infix fun Int.foo(b: Boolean) {

}

class Structure {
    infix fun createPyramid(rows: Int): Unit {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows - i) {
                print("  ")
            }
            while (k != 2 * i - 1) {
                print("* ")
                ++k
            }
            println()
        }
    }
}