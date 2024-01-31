package org.example.Activitats_UF4_A4.models

class Cercle {
    private var radi: Float = 0f
    private var color: String = "blanc"
    var perimetre: Float = 0.0f
    var area: Float = 0.0f

    constructor(pRadi: Float) {
        this.radi = pRadi
        this.perimetre = calcPerimetre()
        this.area = calcArea()
    }

    constructor(radi: Float, color: String) {
        this.radi = radi
        this.color = color
        this.perimetre = calcPerimetre()
        this.area = calcArea()
    }

     fun calcPerimetre(): Float {
        return (2 * Math.PI * radi).toFloat()
    }

     fun calcArea(): Float {
        return (Math.PI * radi * radi).toFloat()
    }

    override fun toString(): String {
        return "Cercle(radi: $radi, color: $color), perimetre: $perimetre, area: $area"
    }
}
