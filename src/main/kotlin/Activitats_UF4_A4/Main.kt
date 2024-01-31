package org.example.Activitats_UF4_A4

import org.example.Activitats_UF4_A4.models.Cercle
import org.example.Activitats_UF4_A4.models.Persona

fun main() {
    mostrarMenuPersona()
    mostrarMenuCercle()
}

// Función para mostrar el menú de operaciones con Cercle
fun mostrarMenuCercle() {
    var cercle: Cercle? = null
    println("\nAHORA EL CIRCULO\n")

    while (true) {
        println("\nMenu:")
        println("1.- Crear un círculo con radio y color")
        println("2.- Crear un círculo con radio")
        println("3.- Mostrar último círculo creado")
        println("4.- Mostrar perímetro del último círculo creado")
        println("5.- Mostrar área del último círculo creado")
        println("6.- Salir")

        print("Escoge una opción: ")
        val opcion = readLine()

        when (opcion) {
            "1" -> {
                println("Introduce el radio del círculo")
                val radio = readLine()?.toFloat() ?: 0f

                println("Introduce el color del círculo")
                val color = readLine() ?: ""
                cercle = Cercle(radio, color)
                println("Círculo: $cercle")
            }

            "2" -> {
                println("Introduce el radio del círculo")
                val radio = readLine()?.toFloat() ?: 0f
                cercle = Cercle(radio)
                println("Círculo: $cercle")
            }

            "3" -> {
                println("Último círculo creado: ${cercle.toString()}")
            }

            "4" -> {
                println("Perímetro del último círculo creado: ${cercle?.calcPerimetre()}")
            }

            "5" -> {
                println("Área del último círculo creado: ${cercle?.calcArea()}")
            }

            "6" -> {
                println("Adiós Andreu")
                break
            }

            else -> {
                println("Opción incorrecta... :(")
            }
        }
    }
}

// Función para mostrar información sobre personas
fun mostrarMenuPersona() {
    println("\nAHORA LA PERSONA\n")

    val persona2 = Persona("Calva", "Maria")
/*
    val persona3 = Persona("123456789A", "Laura", "Mares", 12, true)
*/

    println(persona2)
/*
    println(persona3)
*/
/*
    persona2.aniversari()
    persona2.casament()
    persona3.divorci()
*/

    println(persona2)
}

