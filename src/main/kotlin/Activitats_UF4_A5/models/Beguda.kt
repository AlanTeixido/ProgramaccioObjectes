package org.example.Activitats_UF4_A5.models

class Beguda {
    private var nom: String ?= ""
    private var preu: Double ?= null
    private var teIncrement : Boolean ?= false

    constructor(nom : String, preu :Double, teIncrement: Boolean){
        this.nom = nom
        this.preu = preu
        this.teIncrement = teIncrement
    }

    override fun toString(): String {
        return "Beguda (nom = $nom, preu = $preu, teIncrement = $teIncrement)"
    }


}