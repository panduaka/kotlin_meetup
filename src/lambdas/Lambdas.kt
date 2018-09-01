package lambdas

fun main(args: Array<String>) {

    val sum = { num1: Int, num2: Int -> num1 + num2 }
    /**
     * If we take optional annotations out
     */
    val sum2: (Int, Int) -> Int = { num1: Int, num2: Int -> num1 + num2 }

    println("Summation of 4 & 5: ${sum(4, 5)}")

    println("Summation of 10 & 5: ${sum2(10, 5)}")

    /**
     * Here more importantly
     * a function is stored in a value
     */
    val square: (Int) -> Int = { number ->
        number * number
        number + 7

    }
    println("Square  of 8 = ${square(8)}")


    val magnitude100String: (Int) -> String = { input ->
        val magnitude = input * 100
        magnitude.toString()
    }

    val magnitude = magnitude100String(4)
    println("4 * 100 = $magnitude")

    /**
     * We can use Lambdas as Class Extensions
     * See the Example mentioned below
     */

    fun extendString(name: String = "Jhon", age: Int = 20): String {

        val another: String.(Int) -> String = { this + " " + it }
        return name.another(age)

//        val another : (Int) -> String = { it.toString() }
//        return another(age)
    }

    println("Extended Class ${extendString("Martin", 26)}")
    println("Extended Class ${extendString()}")

}