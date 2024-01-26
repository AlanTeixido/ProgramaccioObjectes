package org.example

class Car {
    var brand = ""
    var model = ""
    var year = 0
}

fun main() {
    val c1 = Car()
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    val c2 = Car()
    c2.brand = "BMW"
    c2.model = "X5"
    c2.year = 1999

    println(c1.brand)
    println(c2.brand)
}
class Car2 {
    var brand2 = ""
    var model2 = ""
    var year2 = 0
}

fun main2() {
    val c12 = Car()
    c12.brand = "Ford"
    c12.model = "Mustang"
    c12.year = 1969

    println(c12.brand)
    println(c12.model)
    println(c12.year)
}

class Car3 (var brand3: String, var model3: String, var year3: Int)

fun main3() {
    val c13 = Car3("Ford", "Mustang", 1969)
    val c23 = Car3("BMW", "X5", 1999)
    val c33 = Car3("Tesla", "Model S", 2020)

    println(c13.brand3)
    println(c23.brand3)
    println(c33.brand3)
}