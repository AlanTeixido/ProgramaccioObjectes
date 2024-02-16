package org.example.Activitats_UF4_A15_Lladres_legals

import org.example.Activitats_UF4_A15_Lladres_legals.models.*

fun main() {
    val compteCorrent = CompteCorrent("123456", 1000.0)
    val compteEstalvi = CompteEstalvi("789012", 2000.0)

    compteCorrent.retirar(1200.0)
    compteCorrent.consultarSaldo()

    compteEstalvi.ingressar(500.0)
    compteEstalvi.consultarSaldo()

    compteEstalvi.liquidar()
}