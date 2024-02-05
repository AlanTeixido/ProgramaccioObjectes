/**
 * Classe que representa una televisió, una subclasse d'Electrodomestic.
 *
 * @property mida Mida de la televisió en polzades.
 * @constructor Crea una televisió amb els paràmetres especificats.
 */
class Televisio(
    preuBase: Int,
    color: String = "blanc",
    consum: String = "G",  // Cambiado a String
    pes: Int = 5,
    var mida: Int = 28
) : Electrodomestic(preuBase, color, consum, pes) {
    /**
     * Calcula el preu final de la televisió, tenint en compte la mida addicional.
     *
     * @return Preu final de la televisió.
     */
    override fun preuFinal(): Int {
        var preuFinal = super.preuFinal()

        // Increment del preu en funció de la mida
        when {
            mida in 29..32 -> preuFinal += 50
            mida in 33..42 -> preuFinal += 100
            mida in 43..50 -> preuFinal += 150
            mida >= 51 -> preuFinal += 200
        }

        return preuFinal
    }

    /**
     * Retorna una representació en format de cadena de l'objecte Televisio.
     *
     * @return Representació en format de cadena de l'objecte.
     */
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