package org.example.Activitats_UF4_A15_Lladres_legals.models

class CompteCorrent : CompteBancari() {

    override fun retirar(quantitat: Double) {
        if (quantitat > (getSaldo() ?: 0.0)) {
            val comissioDescobert = quantitat * 0.10
            setSaldo((getSaldo() ?: 0.0) - quantitat - comissioDescobert)
            println("Comissió per descobert aplicada: $comissioDescobert €")
        } else {
            setSaldo((getSaldo() ?: 0.0) - quantitat)
        }
    }
}