package org.example.Activitats_UF4_A15_Lladres_legals.models

import java.util.*

abstract class CompteBancari {
    private var numeroCompte: String? = null
    private var saldo: Double? = null
    private val dataObertura: Date? = Date()

    open fun ingressar(quantitat: Double) {
        saldo = (saldo ?: 0.0) + quantitat
    }

    open fun retirar(quantitat: Double) {
        saldo = (saldo ?: 0.0) - quantitat
    }

    open fun consultarSaldo() {
        println("Saldo actual del compte ${numeroCompte ?: "Desconegut"}: ${saldo ?: 0.0} €")
    }

    fun getNumeroCompte(): String? {
        return numeroCompte
    }

    fun setNumeroCompte(numeroCompte: String) {
        this.numeroCompte = numeroCompte
    }

    fun getSaldo(): Double? {
        return saldo
    }

    fun setSaldo(saldo: Double) {
        this.saldo = saldo
    }
}
