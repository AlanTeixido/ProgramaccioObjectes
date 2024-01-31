package org.example.Activitats_UF4_A5

import org.example.Activitats_UF4_A5.models.Beguda
import org.example.Activitats_UF4_A5.models.Pastisseria

fun main() {

    val croissant = Pastisseria("Crossant", 1.50, 100.0, 300)
    println(croissant)

    val ensaimada = Pastisseria("Ensaimada", 2.00, 50.0, 200)
    println(ensaimada)

    val donut = Pastisseria("Donut", 0.80,20.0, 400)
    println(donut)

    val cocacola = Beguda("Cocacola", 2.50, true)
    println(cocacola)
    val cafe = Beguda("Cafe", 0.50, false)
    println(cafe)
    val aigua = Beguda("Aigua", 1.00, false)
    println(aigua)
    val fanta = Beguda("Fanta", 1.80, true)
    println(fanta)


}