package org.example.Activitat3

/* Definició de la classe Persona */
class Persona {
    //Estructura, coneguda com a propietats o atributs
    var nom: String
    var cognoms: String
    var edat: Int = 0
    var alcada: Int = 0
    var pes: Float = 0f

    init {
        nom = "Anònim"
        cognoms = "Anònimez"
        edat = 18
        alcada = 170
        pes = 70.5f
    }

    //Comportament, també conegut com mètodes
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

    private fun quiSocJo() : String {
        return nom + cognoms + ":: "
    }
}