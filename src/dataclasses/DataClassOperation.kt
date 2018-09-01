package dataclasses

fun main(args: Array<String>) {
    val c = Employee("Jhon", 25)

    /**
     * Copy function
     * is used to alter some properties of an object
     * and keep others remain as it is
     */
    val d = c.copy()
    println("Copy Operation: ${d.age}")

    val f = c.copy(age = 40, name = "Martin")
    println("Copy Operation: ${f.age}")

    /**
     * Returning Multiple values
     * Apart from Pair<> option
     * using Data classes is the other way of
     * Getting multiple values returned
     */
    val createdEmployee = createEmployee(name = "David", age = 40)
    val (name, age) = createdEmployee
    println("Created dataclasses.Employee name: $name")
    println("Created dataclasses.Employee age: $age")

    /**
     * componentN().function
     * Destructuring declaration is compiled down to the following code:
     */
    val employeeName = c.component1()
    val employeeAge = c.component2()
    println("Component name:  $employeeName")
    println("Component age:  $employeeAge")

    /**
     * equals()
     */
    val smith1: Employee = Employee("Smith", 23)
    val smith2: Employee = Employee("Smith", 40)

    println("Are the equal? ${if (smith1.equals(smith2)) "Yes" else "No"}")
}


data class Employee(val name: String, var age: Int)

fun createEmployee(name: String = "Tom", age: Int = 30): Employee {
    return Employee(name, age)
}