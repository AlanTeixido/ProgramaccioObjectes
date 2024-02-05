/**
 * Classe que representa un electrodomèstic.
 *
 * @property preuBase Preu base de l'electrodomèstic.
 * @property color Color de l'electrodomèstic.
 * @property consum Consum d'energia de l'electrodomèstic.
 * @property pes Pes de l'electrodomèstic.
 * @constructor Crea un electrodomèstic amb els paràmetres especificats.
 */
open class Electrodomestic(
    var preuBase: Int,
    var color: String = "blanc",
    var consum: String = "G",
    var pes: Int = 5
) {
    /**
     * Inicialitzador que valida el valor del consum per assegurar-se que està dins del rang correcte.
     */
    init {
        consum = when (consum) {
            in "A".."G" -> consum
            else -> "G" // Si està fora del rang, s'assigna el valor per defecte (G)
        }
    }

    /**
     * Calcula el preu final de l'electrodomèstic.
     *
     * @return Preu final de l'electrodomèstic.
     */
    /**
     * Calcula el preu final de l'electrodomèstic.
     *
     * @return Preu final de l'electrodomèstic.
     */
    open fun preuFinal(): Int {
        var preuFinal = preuBase

        preuFinal += when (consum) {
            "A" -> 35
            "B" -> 30
            "C" -> 25
            "D" -> 20
            "E" -> 15
            "F" -> 10
            else -> 0 // "G" ya tiene 0€ de incremento
        }

        when {
            pes in 6..20 -> preuFinal += 20
            pes in 21..50 -> preuFinal += 50
            pes in 51..80 -> preuFinal += 80
            pes > 80 -> preuFinal += 100
        }

        return preuFinal
    }




    /**
     * Retorna una representació en format de cadena de l'objecte Electrodomestic.
     *
     * @return Representació en format de cadena de l'objecte.
     */
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
