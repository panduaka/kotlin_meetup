package functions

fun main(args: Array<String>) {
//    println(getStartedWithKotlin { helLoKotlin() })

//    functionReferencesExample("Hello Kotlin ", printFunction)

    println("${mathOperatior(y)}")
}

fun helLoKotlin(): String = "Hello Kotlin," // Inline Function

fun getStartedWithKotlin(hello: () -> String): String = hello() + "Lets get started" // Inline Function

//
//fun functionReferencesExample(str: String, expression: (String) -> Unit) {
//    expression(str)
//}
//
//var printFunction: (String) -> Unit = { println(it) }


var y: (Int, Int) -> Int = { num1, num2 -> num1 * num2 }

fun mathOperatior(x: (Int, Int) -> Int): Int {
    return x(4, 6)
}