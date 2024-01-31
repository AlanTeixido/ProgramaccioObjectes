package org.example.Activitats_UF4_A5.models

class Pastisseria {

    private var nom : String ?= ""
    private var preu : Double ?= null
    private var pes : Double ?= null
    private var calories : Int ?= null

    constructor(nom : String, preu : Double, pes:Double, calories: Int){
        this.nom = nom
        this.preu = preu
        this.pes = pes
        this.calories = calories
    }

    fun getNom(): String? = nom
    fun setNom(nom: String) { this.nom = nom }

    fun getPreu(): Double? = preu
    fun setPreu(preu: Double) { this.preu = preu }

    fun getPes(): Double? = pes
    fun setPes(pes: Double) { this.pes = pes }

    fun getCalories(): Int? = calories
    fun setCalories(calories: Int) { this.calories = calories }
    override fun toString() :String{
        return "Pasta (nom = $nom, preu = $preu, pes = $pes, calories = $calories"
    }


}