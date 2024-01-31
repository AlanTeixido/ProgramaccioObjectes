package org.example.Activitats_UF4_A5

import org.example.Activitats_UF4_A5.models.Beguda
import org.example.Activitats_UF4_A5.models.Pastisseria

/**
 * Programa principal que demuestra el uso de las clases [Pastisseria] y [Beguda].
 */
fun main() {
    // Crear instancias de Pastisseria
    val croissant = Pastisseria("Croissant", 1.50, 100.0, 300)
    println(croissant)

    val ensaimada = Pastisseria("Ensaimada", 2.00, 50.0, 200)
    println(ensaimada)

    val donut = Pastisseria("Donut", 0.80, 20.0, 400)
    println(donut)

    // Crear instancias de Beguda
    val cocacola = Beguda("Cocacola", 2.50, true)
    println(cocacola)

    val cafe = Beguda("Cafe", 0.50, false)
    println(cafe)

    val aigua = Beguda("Aigua", 1.00, false)
    println(aigua)

    val fanta = Beguda("Fanta", 1.80, true)
    println(fanta)
}
