package org.example.Activitat_8_Electrodomestics.models

open class Electrodomestic(
    val preuBase: Int,
    val color: String = "blanc",
    val consum: String = "G",
    val pes: Int = 5
) {
    open fun preuFinal(): Int {
        var preuFinal = preuBase

        // Incremento del precio en función del consum
        preuFinal += when (consum) {
            "A" -> 35
            "B" -> 30
            "C" -> 25
            "D" -> 20
            "E" -> 15
            "F" -> 10
            else -> 0
        }

        // Incremento del precio en función del peso
        preuFinal += when {
            pes in 6..20 -> 20
            pes in 21..50 -> 50
            pes in 51..80 -> 80
            pes >= 81 -> 100
            else -> 0
        }

        return preuFinal
    }

    override fun toString(): String {
        return """
            Electrodomèstic:
            Preu base: $preuBase€
            Color: $color
            Consum: $consum
            Pes: $pes kg
            Preu final: ${preuFinal()}€
        """.trimIndent()
    }
}
