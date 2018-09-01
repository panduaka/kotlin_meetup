package companionobjects

fun main(args: Array<String>) {
    MySingleton.increaseCounter()
    MySingleton.increaseCounter()
    MySingleton.increaseCounter()


    A.printC()
    A.c = 12
    A.printC()


}

object MySingleton {
    var count: Int = 0

    init {

    }

    fun increaseCounter() {
        println("${++count}")
    }
}

class A {
    init {

    }

    companion object {
        var c = 10

        fun printC() {
            println("${c}")
        }
    }

}