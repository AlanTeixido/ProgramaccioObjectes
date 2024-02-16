package org.example.Activitats_UF4_A15_Lladres_legals.models

class CompteEstalvi(
    numeroCompte: String? = null,
    saldo: Double? = null
) : CompteBancari(numeroCompte, saldo) {
    companion object {
        const val INTERESSOS = 0.04
        const val PENALITZACIO_LIQUIDACIO_ANTICIPADA = 0.03
    }

    override fun ingressar(quantitat: Double) {
        val interessos = quantitat * INTERESSOS
        saldo = ((saldo ?: 0.0) + quantitat + interessos)
        println("Interessos afegits al compte: $interessos €")
    }

    fun liquidar() {
        val penalitzacio = (saldo ?: 0.0) * PENALITZACIO_LIQUIDACIO_ANTICIPADA
        saldo = ((saldo ?: 0.0) - penalitzacio)
        println("Penalització per liquidació anticipada: $penalitzacio €")
        println("Saldo restant després de liquidació: ${saldo ?: 0.0} €")
    }
}