package org.example.Activitats_UF4_A15_Lladres_legals.models
import java.util.*

open class CompteBancari(
    var numeroCompte: String? = null,
    var saldo: Double? = null
) {
    val dataObertura: Date? = Date()

    open fun ingressar(quantitat: Double) {
        saldo = (saldo ?: 0.0) + quantitat
    }

    open fun retirar(quantitat: Double) {
        saldo = (saldo ?: 0.0) - quantitat
    }

    open fun consultarSaldo() {
        println("Saldo actual del compte ${numeroCompte ?: "Desconegut"}: ${saldo ?: 0.0} €")
    }
}