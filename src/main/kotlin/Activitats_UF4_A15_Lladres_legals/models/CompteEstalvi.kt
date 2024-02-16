package org.example.Activitats_UF4_A15_Lladres_legals.models

class CompteEstalvi(
    numeroCompte: String? = null,
    saldo: Double? = null
) : CompteBancari(numeroCompte, saldo) {

    override fun ingressar(quantitat: Double) {
        val interessos = 0.04
        setSaldo((getSaldo() ?: 0.0) + quantitat + (quantitat * interessos))
        println("Interessos afegits al compte: ${quantitat * interessos} €")
    }

    fun liquidar() {
        val penalitzacio = 0.03
        setSaldo((getSaldo() ?: 0.0) - (getSaldo() ?: 0.0) * penalitzacio)
        println("Penalització per liquidació anticipada: ${(getSaldo() ?: 0.0) * penalitzacio} €")
        println("Saldo restant després de liquidació: ${getSaldo() ?: 0.0} €")
    }
}