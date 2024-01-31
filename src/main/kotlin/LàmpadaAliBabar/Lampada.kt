package org.example.LàmpadaAliBabar
import org.example.Utilities.*

class Lampada(private val identificador: String) {
    private var encesa: Boolean = false
    private var color: String = "Blanc"
    private var intensitat: Int = 0

    fun encendre() {
        encesa = true
        mostrarEstat()
    }

    fun apagar() {
        encesa = false
        mostrarEstat()
    }

    fun canviarColor() {
        color = readWord("Introdueix el color de la làmpada:", "Cal introduir un color.")
        mostrarEstat()
    }

    fun canviarIntensitat() {
        intensitat = readInt("Introdueix la intensitat de la làmpada (de 1 a 5):", "Cal introduir un valor numèric.", "La intensitat ha de ser entre 1 i 5.", 1, 5)
        mostrarEstat()
    }

    private fun mostrarEstat() {
        val estat = if (encesa) "encés" else "apagat"
        println("$identificador - Estat: $estat, Color: $color, Intensitat: $intensitat")
    }
}
