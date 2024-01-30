package org.example.Activitats_UF4_A4

import org.example.Activitat3.Persona

fun main() {
    // Exemple d'ús de la classe Persona
    val persona1 = EXClassePersona()
    val persona2 = EXClassePersona("Calva", "Maria")
    val persona3 = EXClassePersona("123456789A","Laura", "Mares",12,true)


    println(persona1)
    println(persona2)
    println(persona3)

    persona1.aniversari()
    persona2.casament()
    persona3.divorci()

    println(persona1)
    println(persona2)
    println(persona3)
}

