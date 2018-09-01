package functions

fun main(args: Array<String>) {

    sayHello("Jon")
    println("6+10 = ${letsAddTwoNumbers(6, 10)}")
    val x = letsAddTwoNumbers(8, 90)
    println("$x")
}

fun sayHello(name:String){
    println("Hello $name")
}

fun letsAddTwoNumbers(a: Int, b: Int) = a + b