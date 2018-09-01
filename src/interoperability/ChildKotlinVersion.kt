package interoperability

class ChildKotlinVersion {
    val age: Int = 2
    val name: String = "Jhon"

    fun getEducationLevel() {
        when (age) {
            in 0..3 -> println("$name is a baby and not going to pre school")
            in 4..5 -> println("$name  goes to pre school")
            5 -> println("$name goes to Kinder garden")
            in 6..17 -> {
                val grade = age - 5
                println("$name is in grade : $grade")
            }
            else -> println("$name goes to college")
        }
    }
}