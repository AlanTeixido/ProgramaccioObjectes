package org.example.Activitats_UF4_A4

class Cercle() {
    var radi: Float = 0f
    var color: String = "blanc"

    init {
        radi = 10f
        color = "blanc"
    }

    constructor(radi: Float) : this() {
        this.radi = radi
    }

    constructor(radi: Float, color: String) : this() {
        this.radi = radi
        this.color = color
    }

    fun perimetre(): Float {
        return (2 * Math.PI * radi).toFloat()
    }

    fun area(): Float {
        return (Math.PI * radi * radi).toFloat()
    }

    override fun toString(): String {
        return "Cercle(radi: $radi, color: $color)"
    }
}
