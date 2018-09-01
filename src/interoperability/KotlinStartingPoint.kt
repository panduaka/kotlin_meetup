package interoperability

fun main(args: Array<String>) {
    val demo = ChildJavaVersion()
    demo.age = 28
//    demo.name = "Sansa"

    println("Age ${demo.age}")
    println("Name ${demo.name}")
}

/**
 * open is the key word which opposing the final in Java
 * open allows you to extend a class or override a method
 * without open key word you can not extend any class or override any method
 * as by default every class and method is final in Kotlin
 */
open class ParentClass {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    open val d = 4  // public by default

    protected class Nested {
        val e: Int = 5
    }

    open fun parentMethod() {
        println("Parent Method")
    }
}

class ChildClass : ParentClass() {
    override val d: Int = 6
    val e = Nested().e
    override fun parentMethod() {
        println("Child Method")
//        super.parentMethod()
    }
}