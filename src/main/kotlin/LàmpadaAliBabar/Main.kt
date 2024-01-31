package org.example.LàmpadaAliBabar
import org.example.Utilities.*
fun main() {
    val lampada1 = Lampada("Làmpada del menjador")
    val lampada2 = Lampada("Làmpada de la cuina")

    // Accions per a la primera làmpada
    lampada1.encendre()
    repeat(3) { lampada1.canviarColor() }
    lampada1.canviarIntensitat()

    // Accions per a la segona làmpada
    lampada2.encendre()
    repeat(2) { lampada2.canviarColor() }
    lampada2.canviarIntensitat()
    lampada2.apagar()
    lampada2.canviarColor()
    lampada2.encendre()
    lampada2.canviarColor()
    lampada2.canviarIntensitat()
}
