open class Electrodomestic(
    var preuBase: Int,
    var color: String = "blanc",
    var consum: Int = 0,
    var pes: Int = 5
) {
    init {
        // Validar el valor de consum para asegurarse de que esté en el rango correcto
        consum = when (consum) {
            in 1..7 -> consum
            else -> 0 // Si está fuera del rango, se asigna el valor por defecto (G)
        }
    }

    open fun preuFinal(): Int {
        var preuFinal = preuBase

        // Incremento del precio en función del consum
        preuFinal += when (consum) {
            1 -> 35
            2 -> 30
            3 -> 25
            4 -> 20
            5 -> 15
            6 -> 10
            else -> 0 // G ya tiene 0€ de incremento
        }

        // Incremento del precio en función del pes
        when {
            pes in 6..20 -> preuFinal += 20
            pes in 21..50 -> preuFinal += 50
            pes in 51..80 -> preuFinal += 80
            pes > 80 -> preuFinal += 100
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