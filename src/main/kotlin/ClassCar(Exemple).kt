/**
 * Clase que representa un vehículo con propiedades como marca, modelo y año.
 */
package org.example

class Car {
    var brand = ""
    var model = ""
    var year = 0
}

/**
 * Función principal que demuestra la creación y asignación de valores a instancias de la clase [Car].
 */
fun main() {
    // Crear instancias de Car
    val c1 = Car()
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    val c2 = Car()
    c2.brand = "BMW"
    c2.model = "X5"
    c2.year = 1999

    // Imprimir la marca de cada vehículo
    println(c1.brand)
    println(c2.brand)
}

/**
 * Clase que representa un vehículo con propiedades como marca, modelo y año.
 */
class Car2 {
    var brand2 = ""
    var model2 = ""
    var year2 = 0
}

/**
 * Función principal que demuestra la creación y asignación de valores a una instancia de la clase [Car2].
 */
fun main2() {
    // Crear una instancia de Car2
    val c12 = Car()
    c12.brand = "Ford"
    c12.model = "Mustang"
    c12.year = 1969

    // Imprimir la marca, modelo y año del vehículo
    println(c12.brand)
    println(c12.model)
    println(c12.year)
}

/**
 * Clase que representa un vehículo con propiedades como marca, modelo y año.
 *
 * @property brand3 La marca del vehículo.
 * @property model3 El modelo del vehículo.
 * @property year3 El año de fabricación del vehículo.
 */
class Car3(var brand3: String, var model3: String, var year3: Int)

/**
 * Función principal que demuestra la creación y asignación de valores a instancias de la clase [Car3].
 */
fun main3() {
    // Crear instancias de Car3
    val c13 = Car3("Ford", "Mustang", 1969)
    val c23 = Car3("BMW", "X5", 1999)
    val c33 = Car3("Tesla", "Model S", 2020)

    // Imprimir la marca de cada vehículo
    println(c13.brand3)
    println(c23.brand3)
    println(c33.brand3)
}
