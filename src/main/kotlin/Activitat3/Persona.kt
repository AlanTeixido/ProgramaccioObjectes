package org.example.Activitat3

/* Definició de la classe Persona */
class Persona (var nom: String = "Anonimo", var cognoms: String = "Anonimez") {
    // Estructura, coneguda com a propietats o atributs
    var alcada: Int = 0
    var pes: Float = 0f
    var edat: Int = 0

    constructor(nom: String, cognoms: String, edad: Int) : this() {
        this.nom = nom
        this.cognoms = cognoms
        this.edat = edad
    }

    init {
        nom = "Anònim"
        cognoms = "Anònimez"
        edat = 18
        alcada = 170
        pes = 70.5f
    }

    // Comportament, també conegut com mètodes
    fun caminar() {
        println(quiSocJo() + "Estic caminant")
    }

    fun parlar() {
        println(quiSocJo() + "Estic parlant")
    }

    fun neixer() {
        println(quiSocJo() + "Tot just ara he nascut!!!")
    }

    fun morir() {
        println(quiSocJo() + "Ens veiem a l'infern!")
    }

    fun presentacio() {
        println("Nom: $nom\nCognom: $cognoms\nEdad: $edat\nPes: $pes\nAlçada: $alcada")
    }

    private fun quiSocJo(): String {
        return "$nom $cognoms:: "
    }
}