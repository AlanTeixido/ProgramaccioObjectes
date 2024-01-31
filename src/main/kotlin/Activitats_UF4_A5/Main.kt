package org.example.Activitats_UF4_A5

import org.example.Activitats_UF4_A5.models.Beguda
import org.example.Activitats_UF4_A5.models.Pastisseria

/**
 * Programa principal que demuestra el uso de las clases [Pastisseria] y [Beguda].
 */
fun main() {
    // Crear instancias de Pastisseria
    val croissant = Pastisseria("Croissant", 1.50, 100.0, 300)
    println("Nom: ${croissant.getNom()}, Preu: ${croissant.getPreu()}, Pes: ${croissant.getPes()}, Calories: ${croissant.getCalories()}")

    val ensaimada = Pastisseria("Ensaimada", 2.00, 50.0, 200)
    println("Nom: ${ensaimada.getNom()}, Preu: ${ensaimada.getPreu()}, Pes: ${ensaimada.getPes()}, Calories: ${ensaimada.getCalories()}")

    val donut = Pastisseria("Donut", 0.80, 20.0, 400)
    println("Nom: ${donut.getNom()}, Preu: ${donut.getPreu()}, Pes: ${donut.getPes()}, Calories: ${donut.getCalories()}")

    // Crear instancias de Beguda
    val cocacola = Beguda("Cocacola", 2.50, true)
    println("Nom: ${cocacola.getNom()}, Preu: ${cocacola.getPreu()}, Té increment sucre: ${cocacola.getIncrementSucre()}")

    val cafe = Beguda("Cafe", 0.50, false)
    println("Nom: ${cafe.getNom()}, Preu: ${cafe.getPreu()}, Té increment sucre: ${cafe.getIncrementSucre()}")

    val aigua = Beguda("Aigua", 1.00, false)
    println("Nom: ${aigua.getNom()}, Preu: ${aigua.getPreu()}, Té increment sucre: ${aigua.getIncrementSucre()}")

    val fanta = Beguda("Fanta", 1.80, true)
    println("Nom: ${fanta.getNom()}, Preu: ${fanta.getPreu()}, Té increment sucre: ${fanta.getIncrementSucre()}")
}
