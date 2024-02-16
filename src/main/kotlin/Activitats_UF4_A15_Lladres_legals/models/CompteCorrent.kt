package org.example.Activitats_UF4_A15_Lladres_legals.models

class CompteCorrent(
    numeroCompte: String? = null,
    saldo: Double? = null
) : CompteBancari(numeroCompte, saldo) {
    companion object {
        const val COMISSIO_DESCOBERT = 0.10
    }

    override fun retirar(quantitat: Double) {
        if (quantitat > (saldo ?: 0.0)) {
            val comissioDescobert = quantitat * COMISSIO_DESCOBERT
            saldo = ((saldo ?: 0.0) - comissioDescobert)
            println("Comissió per descobert aplicada: $comissioDescobert €")
        } else {
            saldo = (saldo ?: 0.0) - quantitat
        }
    }
}