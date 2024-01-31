package org.example.Activitats_UF4_A4.models

class Persona {
    private var dni: String? = null
    private var nom: String = ""
    private var cognoms: String = ""
    private var edat: Int? = null
    private var estatCivil: Boolean? = null

    // Constructor secundari 1
    constructor(nom: String, cognoms: String) {
        this.nom = nom
        this.cognoms = cognoms
    }

    // Constructor secundari 2
    constructor(dni: String, nom: String, cognoms: String, edat: Int, estatCivil: Boolean) {
        this.dni = dni
        this.nom = nom
        this.cognoms = cognoms
        this.edat = edat
        this.estatCivil = estatCivil
    }

    fun aniversari() {
        if (this.edat == null)
            this.edat = 0
        else
            this.edat = this.edat!! + 1
    }

    fun setEdat(edat : Int){
        this.edat = edat
    }

    fun casament() {
        this.estatCivil = true
    }

    fun divorci() {
        this.estatCivil = false
    }

    /**
     * El mètode toString ens defineix com s'imprimeixen els objectes de la classe Persona
     * @return un String amb la info
     * @author Alan
     */
    override fun toString(): String {
        return "La persona té dni='${this.dni}' i nom='${this.nom}'" +
                " i cognoms='${this.cognoms}', edat=${this.edat}, estatCivil=${this.estatCivil}"
    }
}
