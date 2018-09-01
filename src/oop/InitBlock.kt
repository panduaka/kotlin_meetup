package oop

fun main(args: Array<String>) {

    val person = Person("Jhon", 26)
    person.email = "jhon.s@gmail.com"
    println("Email : ${person.email}")

    val user = User("Jhon", 26)
    var x: String = if (user.equals(person)) "Equal" else "Not Equal"
    println("$x")
    user.age
    user.name
    val user2 = user.copy()
    println("oop.User 2 age ${user2.age}")
}

/**
 *
 */
//class Person internal constructor(name: String, age: Int) {
//    var name: String = name
//    var age: Int = age
//
//    init {
//        println("$name is $age years old")
//    }
//
//    var email: String? = null
//        set(value) {
//            if (value?.length!! > 7) field = value else field = ""
//        }
//}

/**
 *
 */

class Person(private var name: String, private var age: Int) {
    /**
     * There you can have both Mutable and Immutable variables
     * in the Primary Constructor
     */
    init {
        name = name.toUpperCase()
        println("$name")
        println("${this.name}")
    }

    var email: String? = null
        set(value) {
            if (value != null && value.length < 5) {
                field = value
            } else {
                field = "no email"
            }
        }
}

//class oop.Person constructor(name: String, age: Int) {
//    var name: String = name
//    var age: Int = age
//
//    init {
//        println("$name is $age years old")
//    }
//}

//class oop.Person internal (name: String, age: Int) {
//    var name: String = name
//    var age: Int = age
//
//    init {
//        println("$name is $age years old")
//    }
//}

//class oop.Person internal constructor(name: String, age: Int) {
//    /**
//     * member variales can be initialized inside or outsid initializer block
//     */
//    var name: String = name.toUpperCase()
//
//    init {
//        /**
//         * Spot the difference of two outputs
//         */
//        println("This is 1st initializer block")
//        var age: Int = age
//        println("$name is $age years old")
//        println("${this.name} is $age years old")
//    }
//
//    init {
//        this.name = this.name + " Bupendra"
//        println("This is 2nd initializer block")
//        println("Modified Name:${this.name}")
//    }
//}

data class User(val name: String, var age: Int)