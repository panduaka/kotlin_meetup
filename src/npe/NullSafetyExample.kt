package npe

fun main(args: Array<String>) {
    var a: String? = null
    a = null
    if (a != null) {
        println("a length:${a.length}")
    }
    var t: String = "Dre"
    t.length
    /**
     * Check closely
     */
//    t = null
    println("t length:${t.length}")

    /**
     * If a is null
     * Accessing properties on b will throw an error
     * So before accessing we need to ensure if a is not null
     * There are certain ways to do that
     */

    /**
     * 1
     * Checking for null explicitly
     */

    if (a != null) println("a length:${a.length}") else println("a is null")

    /**
     * 2
     * Safe Calls
     */
    a= null
    println("a length:${a?.length}")
    println("a length:${t?.length}")

    /**
     * Important in Chains
     *bob?.department?.head?.name
     */

    /**
     * 3
     * Elvis Operator
     * No need of if else
     *   ?:
     */


    println("Length a: ${a?.length ?: "a is null"}")

    /**
     * 4
     * The !! operator
     * !! Operator explicitly tells compiler that the property is not null
     * if it is null please throw NPE
     */

    try {
        a = null
        println("a...... length:${a!!.length}")
    } catch (e: NullPointerException) {
        println("a is null.....................")
    }


}