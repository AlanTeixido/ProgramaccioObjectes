package org.example.Activitats_UF4_A5.models

/**
 * Clase que representa un producto de pastelería con nombre, precio, peso y contenido calórico.
 *
 * @property nom Nombre del producto de pastelería.
 * @property preu Precio del producto de pastelería.
 * @property pes Peso del producto de pastelería.
 * @property calories Contenido calórico del producto de pastelería.
 */
class Pastisseria {

    private var nom: String? = ""
    private var preu: Double? = null
    private var pes: Double? = null
    private var calories: Int? = null

    /**
     * Constructor principal de la clase [Pastisseria].
     *
     * @param nom Nombre del producto de pastelería.
     * @param preu Precio del producto de pastelería.
     * @param pes Peso del producto de pastelería.
     * @param calories Contenido calórico del producto de pastelería.
     */
    constructor(nom: String, preu: Double, pes: Double, calories: Int) {
        this.nom = nom
        this.preu = preu
        this.pes = pes
        this.calories = calories
    }

    /**
     * Obtiene el nombre del producto de pastelería.
     *
     * @return Nombre del producto de pastelería.
     */
    fun getNom(): String? = nom

    /**
     * Establece el nombre del producto de pastelería.
     *
     * @param nom Nuevo nombre del producto de pastelería.
     */
    fun setNom(nom: String) {
        this.nom = nom
    }

    /**
     * Obtiene el precio del producto de pastelería.
     *
     * @return Precio del producto de pastelería.
     */
    fun getPreu(): Double? = preu

    /**
     * Establece el precio del producto de pastelería.
     *
     * @param preu Nuevo precio del producto de pastelería.
     */
    fun setPreu(preu: Double) {
        this.preu = preu
    }

    /**
     * Obtiene el peso del producto de pastelería.
     *
     * @return Peso del producto de pastelería.
     */
    fun getPes(): Double? = pes

    /**
     * Establece el peso del producto de pastelería.
     *
     * @param pes Nuevo peso del producto de pastelería.
     */
    fun setPes(pes: Double) {
        this.pes = pes
    }

    /**
     * Obtiene el contenido calórico del producto de pastelería.
     *
     * @return Contenido calórico del producto de pastelería.
     */
    fun getCalories(): Int? = calories

    /**
     * Establece el contenido calórico del producto de pastelería.
     *
     * @param calories Nuevo contenido calórico del producto de pastelería.
     */
    fun setCalories(calories: Int) {
        this.calories = calories
    }

    /**
     * Devuelve una representación en formato de cadena del producto de pastelería.
     *
     * @return Representación en formato de cadena del producto de pastelería.
     */
    override fun toString(): String {
        return "Pastisseria (nom = $nom, preu = $preu, pes = $pes, calories = $calories)"
    }
}
