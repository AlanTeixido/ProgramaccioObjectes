package org.example.Activitats_UF4_A5.models

/**
 * Clase que representa una bebida con nombre, precio y la opción de tener un incremento de azúcar.
 *
 * @property nom Nombre de la bebida.
 * @property preu Precio de la bebida.
 * @property teIncrement Indica si la bebida tiene incremento de azúcar.
 */
class Beguda {
    private var nom: String? = ""
    private var preu: Float? = null
    private var teIncrement: Boolean? = false

    /**
     * Constructor principal de la clase [Beguda].
     *
     * @param nom Nombre de la bebida.
     * @param preu Precio de la bebida.
     * @param teIncrement Indica si la bebida tiene incremento de azúcar.
     */
    constructor(nom: String, preu: Float, teIncrement: Boolean) {
        this.nom = nom
        this.preu = preu
        this.teIncrement = teIncrement
    }

    /**
     * Obtiene el nombre de la bebida.
     *
     * @return Nombre de la bebida.
     */
    fun getNom(): String? {
        return nom
    }

    /**
     * Establece el nombre de la bebida.
     *
     * @param pNom Nuevo nombre de la bebida.
     */
    fun setNom(pNom: String) {
        this.nom = pNom
    }

    /**
     * Obtiene el precio de la bebida.
     *
     * @return Precio de la bebida.
     */
    fun getPreu(): Float? {
        return preu
    }

    /**
     * Establece el precio de la bebida.
     *
     * @param pPreu Nuevo precio de la bebida.
     */
    fun setPreu(pPreu: Float) {
        this.preu = pPreu
    }

    /**
     * Obtiene si la bebida tiene incremento de azúcar.
     *
     * @return `true` si la bebida tiene incremento de azúcar, `false` en caso contrario.
     */
    fun getIncrementSucre(): Boolean? {
        return teIncrement
    }

    /**
     * Establece si la bebida tiene incremento de azúcar.
     *
     * @param pIncrementSucre Indica si la bebida tiene incremento de azúcar.
     */
    fun setIncrementSucre(pIncrementSucre: Boolean) {
        this.teIncrement = pIncrementSucre
    }

    /**
     * Devuelve una representación en formato de cadena de la bebida.
     *
     * @return Representación en formato de cadena de la bebida.
     */
    override fun toString(): String {
        return "Beguda (nom = $nom, preu = $preu, teIncrement = $teIncrement)"
    }
}
