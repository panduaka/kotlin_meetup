package functions

fun main(args: Array<String>) {
//    add()
//    add(30, 9)
    A().foo()
    B().foo(100)
}

fun add(a: Int = 10, b: Int = 13): Unit {
    println("Mutable list:${a + b}")
}

open class A {
    open fun foo(i: Int = 10) {
        println("i=$i")
    }
}

class B : A() {
    override fun foo(i: Int) {
        println("i=$i")
    }
}