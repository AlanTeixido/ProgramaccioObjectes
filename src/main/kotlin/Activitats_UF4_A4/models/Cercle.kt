package org.example.Activitats_UF4_A4.models
/**
 * Clase que representa un círculo con radio y color.
 *
 * @property radi Radio del círculo.
 * @property color Color del círculo.
 * @property perimetre Perímetro del círculo.
 * @property area Área del círculo.
 */
class Cercle {
    private var radi: Float = 0f
    private var color: String = "blanc"
    var perimetre: Float = 0.0f
    var area: Float = 0.0f

    // Constructor principal con un solo parámetro (radio)
    constructor(pRadi: Float) {
        this.radi = pRadi
        this.perimetre = calcPerimetre()
        this.area = calcArea()
    }

    // Constructor con dos parámetros (radio y color)
    constructor(radi: Float, color: String) {
        this.radi = radi
        this.color = color
        this.perimetre = calcPerimetre()
        this.area = calcArea()
    }

    // Método para calcular el perímetro del círculo
    fun calcPerimetre(): Float {
        return (2 * Math.PI * radi).toFloat()
    }

    // Método para calcular el área del círculo
    fun calcArea(): Float {
        return (Math.PI * radi * radi).toFloat()
    }

    // Método toString para representar el círculo como cadena
    override fun toString(): String {
        return "Cercle(radi: $radi, color: $color), perimetre: $perimetre, area: $area"
    }
}