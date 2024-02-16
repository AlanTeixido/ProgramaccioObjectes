package org.example.Activitats_UF4_A15_Lladres_legals.models

class CompteCorrent(
    numeroCompte: String? = null,
    saldo: Double? = null
) : CompteBancari(numeroCompte, saldo) {

    override fun retirar(quantitat: Double) {
        val comissioDescobert = 0.10
        if (quantitat > (getSaldo() ?: 0.0)) {
            setSaldo((getSaldo() ?: 0.0) - quantitat - (quantitat * comissioDescobert))
            println("Comissió per descobert aplicada: ${quantitat * comissioDescobert} €")
        } else {
            setSaldo((getSaldo() ?: 0.0) - quantitat)
        }
    }
}
