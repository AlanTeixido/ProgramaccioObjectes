/**
 * Classe que representa una rentadora, una subclasse d'Electrodomestic.
 *
 * @property carrega Càrrega màxima de la rentadora.
 * @constructor Crea una rentadora amb els paràmetres especificats.
 */
class Rentadora(
    preuBase: Int,
    color: String = "blanc",
    consum: String = "G",  // Cambiado a String
    pes: Int = 5,
    var carrega: Int = 5
) : Electrodomestic(preuBase, color, consum, pes) {
    /**
     * Calcula el preu final de la rentadora, tenint en compte la càrrega addicional.
     *
     * @return Preu final de la rentadora.
     */
    override fun preuFinal(): Int {
        var preuFinal = super.preuFinal()

        // Increment del preu en funció de la càrrega
        when (carrega) {
            in 6..7 -> preuFinal += 55
            8 -> preuFinal += 70
            9 -> preuFinal += 85
            10 -> preuFinal += 100
        }

        return preuFinal
    }

    /**
     * Retorna una representació en format de cadena de l'objecte Rentadora.
     *
     * @return Representació en format de cadena de l'objecte.
     */
    override fun toString(): String {
        return """
            Rentadora:
            Preu base: $preuBase€
            Color: $color
            Consum: $consum
            Pes: $pes kg
            Càrrega: $carrega kg
            Preu final: ${preuFinal()}€
        """.trimIndent()
    }
}