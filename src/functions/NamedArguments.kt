package functions

fun main(args: Array<String>) {
    foo(11, age = 16, nameOfWorker = "Arya")
    foo(null, permanentEmployee = false, nameOfWorker = "Jhon")
    foo(null, age = 26, nameOfWorker = "Panduka", permanentEmployee = true)

    numberOfArguments(names = *arrayOf("Jon", "Rob", "Ned"))

    numberOfArguments("j", "b", "k")

    numberOfArguments(names = *arrayOf("Jon", "Rob", "Ned", "Ramsy"))

    println("Summation: ${getSummation(1, 2, 3, 4, 5, 6)}")

}

fun foo(grade: Int?, nameOfWorker: String = "Default", age: Int = 0, permanentEmployee: Boolean = false) {
    println("$nameOfWorker is $age years of age ${if (permanentEmployee) "Permanent dataclasses.Employee" else "Not Permanent yet"}") // If Expression used in Kotlin
}

/*
Variable number of Arguments
 */
/**
 * Where you can pass number of arguments
 * every time the function is called
 * But a certain type
 */
fun numberOfArguments(vararg names: String) {
    println("$names")

    for (i in names.indices) {
        println("${names[i]}")
    }
}

private fun getSummation(vararg numbers: Int): Int {
    var sum: Int = 0
    numbers.forEach { n:Int -> sum += n }
    return sum
}