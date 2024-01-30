package org.example.Activitats_UF4_A4

class EXClassePersona () {

    var dni: String
    var nom: String
    var cognoms: String
    var edat: Int = 0
    var estatCivil: Boolean = false

    init {
        dni = "44942045r"
        nom = "Alan"
        cognoms = "Teixidó"
        edat = 18
        estatCivil = true
    }


    constructor(nom: String, cognoms: String) : this() {
        this.dni = dni
        this.nom = nom
        this.cognoms = cognoms
        this.edat = 0
        this.estatCivil = false
    }

    constructor(dni: String, nom: String, cognoms: String, edat: Int, estatCivil: Boolean) : this() {
        this.dni = dni
        this.nom = nom
        this.cognoms = cognoms
        this.edat = edat
        this.estatCivil = estatCivil
    }

    fun aniversari() {
        edat++
    }

    fun casament() {
        estatCivil = true
    }

    fun divorci() {
        estatCivil = false
    }

    override fun toString(): String {
        return "Persona(dni='$dni', nom='$nom', cognoms='$cognoms', edat=$edat, estatCivil=$estatCivil)"
    }
}
