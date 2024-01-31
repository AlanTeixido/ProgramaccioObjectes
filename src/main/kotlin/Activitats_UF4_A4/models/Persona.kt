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

    /**
     * Clase que representa a una persona con datos como DNI, nombre, apellidos, edad y estado civil.
     *
     * @property dni DNI de la persona.
     * @property nom Nombre de la persona.
     * @property cognoms Apellidos de la persona.
     * @property edat Edad de la persona.
     * @property estatCivil Estado civil de la persona.
     */
    class Persona {
        private var dni: String? = null
        private var nom: String = ""
        private var cognoms: String = ""
        private var edat: Int? = null
        private var estatCivil: Boolean? = null

        // Constructor secundario 1
        constructor(nom: String, cognoms: String) {
            this.nom = nom
            this.cognoms = cognoms
        }

        // Constructor secundario 2
        constructor(dni: String, nom: String, cognoms: String, edat: Int, estatCivil: Boolean) {
            this.dni = dni
            this.nom = nom
            this.cognoms = cognoms
            this.edat = edat
            this.estatCivil = estatCivil
        }

        // Método para incrementar la edad en 1 año
        fun aniversari() {
            if (this.edat == null)
                this.edat = 0
            else
                this.edat = this.edat!! + 1
        }

        // Método para establecer la edad
        fun setEdat(edat: Int) {
            this.edat = edat
        }

        // Método para cambiar el estado civil a casado
        fun casament() {
            this.estatCivil = true
        }

        // Método para cambiar el estado civil a divorciado
        fun divorci() {
            this.estatCivil = false
        }

        /**
         * El método toString define cómo se imprimen los objetos de la clase Persona.
         *
         * @return Un String con la información de la persona.
         * @author Alan
         */
        override fun toString(): String {
            return "La persona tiene dni='${this.dni}' y nombre='${this.nom}'" +
                    " y apellidos='${this.cognoms}', edad=${this.edat}, estadoCivil=${this.estatCivil}"
        }
    }
}