package org.example.Activitats_UF4_A4

import org.example.Activitats_UF4_A4.models.Cercle
import org.example.Activitats_UF4_A4.models.Persona

fun main() {
    mostrarMenuPersona()
    mostrarMenuCercle()
}

fun mostrarMenuCercle() {
    var cercle: Cercle? = null
    println("\nARA EL CERCLE\n")

    while (true) {
        println("\nMenu:")
        println("1.- Crear un cercle d'un radi  i d'un color ")
        println("2.- Crear un cercle d'un radi ")
        println("3.- Mostrar últim cercle creat")
        println("4.- Mostrar perímetre últim cercle creat")
        println("5.- Mostrar àrea últim cercle creat")
        println("6.- Sortir")

        print("Escull una opció: ")
        val opcio = readLine()

        when (opcio) {
            "1" -> {
                println("Introdueix el radi del cercle")
                val radi = readLine()?.toFloat() ?: 0f

                println("Introdueix el color del cercle")
                val color = readLine() ?: ""
                cercle = Cercle(radi, color)
                println("Cercle de: $cercle")
            }

            "2" -> {
                println("Introdueix el radi del cercle")
                val radi = readLine()?.toFloat() ?: 0f
                cercle = Cercle(radi)
                println("Cercle de: $cercle")
            }

            "3" -> {
                println("Ultim cercle creat ${cercle.toString()}")
            }

            "4" -> {
                println("Perímetre del ultim cercle creat: ${cercle?.calcPerimetre()}")
            }

            "5" -> {
                println("Area ultim cercle ${cercle?.calcArea()}")
            }

            "6" -> {
                println("Adeu Andreu")
                break
            }

            else -> {
                println("Opcio incorrecte... :(")
            }
        }
    }
}

fun mostrarMenuPersona (){
    println("\n ARA LA PERSONA \n")

    //val persona1 = Persona()
    val persona2 = Persona("Calva", "Maria")
    val persona3 = Persona("123456789A","Laura", "Mares",12,true)


    //println(persona1)
    println(persona2)
    println(persona3)
    persona2.aniversari()
    //persona1.aniversari()
    persona2.casament()
    persona3.divorci()

    // println(persona1)
    println(persona2)
    println(persona3)
}
