/**
 * Representa un vehículo con propiedades como marca, modelo y año.
 *
 * @property brand La marca del vehículo.
 * @property model El modelo del vehículo.
 * @property year El año de fabricación del vehículo.
 */
package org.example

class CarFunction(var brand: String, var model: String, var year: Int) {

    /**
     * Simula la acción de conducir el vehículo imprimiendo el sonido del motor.
     */
    fun drive() {
        println("Wrooom!")
    }

    /**
     * Simula la acción de establecer la velocidad máxima del vehículo e imprime la velocidad máxima proporcionada.
     *
     * @param maxSpeed La velocidad máxima del vehículo.
     */
    fun speed(maxSpeed: Int) {
        println("Max speed is: $maxSpeed")
    }
}

/**
 * Función principal que demuestra el uso de la clase [CarFunction].
 */
fun main() {
    // Crear una instancia de CarFunction
    val c1 = CarFunction("Ford1", "Mustang1", 1969)

    // Imprimir los valores de las propiedades del vehículo
    println("${c1.brand} ${c1.model} ${c1.year}")

    // Llamar a las funciones de la clase
    c1.drive()
    c1.speed(200)
}
