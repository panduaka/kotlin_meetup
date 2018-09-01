package oop

fun main(args: Array<String>) {
//    val human = oop.Human(2)
//    val man = oop.Man("Croatia")
    val man2 = Man("Europe", 26)
    val woman = Woman("England")
    println("This oop.Human is a :${if (man2.gender == 1) "oop.Man" else if (man2.gender == 2) "oop.Woman" else "Somewhere in between"}")
    println("oop.Woman is from ${woman.country}")
}

/**
 * Have a look on open keyword here
 * The open annotation on a class is the opposite of Java's final
 */
//open class oop.Human internal constructor(gender: Int) {
//    /**
//     * Note that Initializer Block effectively becomes a part of Primary Constructor
//     */
//    var gender: Int = 0
//
//    init {
//        this.gender = gender
//        println("Super Class oop.Human:${if (this.gender == 1) "oop.Man" else if (this.gender == 2) "oop.Woman" else "Somewhere in between"}")
//    }
//}

/**
 * More concise way of declaring properties and initializing them from the primary constructor
 */
//open class oop.Human internal constructor(val gender: Int) {
//    /**
//     * Note that Initializer Block effectively becomes a part of Primary Constructor
//     */
//
//    init {
//        println("Super Class oop.Human:${if (this.gender == 1) "oop.Man" else if (this.gender == 2) "oop.Woman" else "Somewhere in between"}")
//    }
//}

open class Human internal constructor(val gender: Int) {
    /**
     * Note that Initializer Block effectively becomes a part of Primary Constructor
     */

    init {
        println("Super Class oop.Human:${if (this.gender == 1) "oop.Man" else if (this.gender == 2) "oop.Woman" else "Somewhere in between"}")
    }
}


class Man(c: String) : Human(1) {
//    override val gender:Int = 7
    val country: String = c
    var age: Int = 0

    init {
        println("oop.Man")
    }

    /**
     * Delegated to Primary Constructor
     */
    constructor(continent: String, age: Int) : this(continent) {
        this.age = age
        println("oop.Man is ${this.age} and from ${this.country}")
    }
}


/**
 * You can use constructor keyword if you forget
 * that the primary constructor is here
 */
//class oop.Woman constructor(country: String) : oop.Human(2) {
//    val country: String = country
//    var age: Int = 0
//    init {
//        println("oop.Woman")
//    }
//}

class Woman (val country: String) : Human(2) {
    var age: Int = 0
    init {
        println("oop.Woman is from ${this.country}")
    }
}