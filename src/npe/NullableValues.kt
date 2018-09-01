package npe

fun main(args: Array<String>) {

    println("Int value:" + "a".returnIntValue())

    println("Int value:" + "6".returnIntValue())
//    "a".npe.returnIntValue()
}


/**
 * Extension
 */
fun String.returnIntValue(): Int? {
    return this.toIntOrNull()
}
