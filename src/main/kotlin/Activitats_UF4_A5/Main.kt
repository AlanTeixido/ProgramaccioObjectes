package org.example.Activitats_UF4_A5

import org.example.Activitats_UF4_A5.models.*
import org.example.Utilities.*

/**
 * Programa principal que demuestra el uso de las clases [Pastisseria] y [Beguda].
 *
 * Este programa crea instancias de [Pastisseria] y [Beguda] utilizando las funciones de entrada
 * proporcionadas por [Utilities] y muestra la información de cada producto en la consola.
 */
fun main() {
    // Crear instancias de Pastisseria
    val croissant = Pastisseria(
        readWord("Nom del croissant:", "Cal introduir un nom."),
        readFloat("Preu del croissant:", "Cal introduir un preu vàlid."),
        readFloat("Pes del croissant:", "Cal introduir un pes vàlid."),
        readInt("Calories del croissant:", "Cal introduir un valor numèric per a les calories.")
    )
    println("Informació del croissant: ${croissant}")

    val ensaimada = Pastisseria(
        readWord("Nom de l'ensaimada:", "Cal introduir un nom."),
        readFloat("Preu de l'ensaimada:", "Cal introduir un preu vàlid."),
        readFloat("Pes de l'ensaimada:", "Cal introduir un pes vàlid."),
        readInt("Calories de l'ensaimada:", "Cal introduir un valor numèric per a les calories.")
    )
    println("Informació de l'ensaimada: ${ensaimada}")

    val donut = Pastisseria(
        readWord("Nom del donut:", "Cal introduir un nom."),
        readFloat("Preu del donut:", "Cal introduir un preu vàlid."),
        readFloat("Pes del donut:", "Cal introduir un pes vàlid."),
        readInt("Calories del donut:", "Cal introduir un valor numèric per a les calories.")
    )
    println("Informació del donut: ${donut}")

    // Crear instancias de Beguda
    val cocacola = Beguda(
        readWord("Nom de la Cocacola:", "Cal introduir un nom."),
        readFloat("Preu de la Cocacola:", "Cal introduir un preu vàlid."),
        readBoolean("Té increment sucre per a la Cocacola:", "Cal introduir un valor boolean.")
    )
    println("Informació de la Cocacola: ${cocacola}")

    val cafe = Beguda(
        readWord("Nom del café:", "Cal introduir un nom."),
        readFloat("Preu del café:", "Cal introduir un preu vàlid."),
        readBoolean("Té increment sucre per al café:", "Cal introduir un valor boolean.")
    )
    println("Informació del café: ${cafe}")

    val aigua = Beguda(
        readWord("Nom de l'aigua:", "Cal introduir un nom."),
        readFloat("Preu de l'aigua:", "Cal introduir un preu vàlid."),
        readBoolean("Té increment sucre per a l'aigua:", "Cal introduir un valor boolean.")
    )
    println("Informació de l'aigua: ${aigua}")

    val fanta = Beguda(
        readWord("Nom de la Fanta:", "Cal introduir un nom."),
        readFloat("Preu de la Fanta:", "Cal introduir un preu vàlid."),
        readBoolean("Té increment sucre per a la Fanta:", "Cal introduir un valor boolean.")
    )
    println("Informació de la Fanta: ${fanta}")
}
