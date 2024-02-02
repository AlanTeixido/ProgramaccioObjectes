package org.example.Activitat_8_Electrodomestics.models
import org.example.Activitat_8_Electrodomestics.models.*


class Televisio(
    preuBase: Int,
    color: String = "blanc",
    consum: String = "G",
    pes: Int = 5,
    var mida: Int = 28
) : Electrodomestic(preuBase, color, consum, pes) {

    override fun preuFinal(): Int {
        var preuFinal = super.preuFinal()

        // Incremento del precio en función de la medida
        when {
            mida in 29..32 -> preuFinal += 50
            mida in 33..42 -> preuFinal += 100
            mida in 43..50 -> preuFinal += 150
            mida >= 51 -> preuFinal += 200
        }

        return preuFinal
    }

    override fun toString(): String {
        return """
            Televisió:
            Preu base: $preuBase€
            Color: $color
            Consum: $consum
            Pes: $pes kg
            Mida: $mida”
            Preu final: ${preuFinal()}€
        """.trimIndent()
    }
}
