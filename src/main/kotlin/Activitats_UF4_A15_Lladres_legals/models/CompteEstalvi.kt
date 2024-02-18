package org.example.Activitats_UF4_A15_Lladres_legals.models

class CompteEstalvi : CompteBancari() {

    override fun ingressar(quantitat: Double) {
        val interessos = quantitat * 0.04
        setSaldo((getSaldo() ?: 0.0) + quantitat + interessos)
        println("Interessos afegits al compte: $interessos €")
    }

    fun liquidar() {
        val penalitzacio = (getSaldo() ?: 0.0) * 0.03
        setSaldo((getSaldo() ?: 0.0) - penalitzacio)
        println("Penalització per liquidació anticipada: $penalitzacio €")
        println("Saldo restant després de liquidació: ${getSaldo() ?: 0.0} €")
    }
}
