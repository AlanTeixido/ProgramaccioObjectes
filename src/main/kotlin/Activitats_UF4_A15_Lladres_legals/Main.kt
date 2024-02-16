package org.example.Activitats_UF4_A15_Lladres_legals

import org.example.Activitats_UF4_A15_Lladres_legals.models.*
import org.example.Utilities.*

fun main() {
    val numeroCompteCorrent = readWord("Introdueix el número del compte corrent:", "Entrada invàlida")
    val saldoCompteCorrent = readFloat("Introdueix el saldo del compte corrent:", "Entrada invàlida")

    val numeroCompteEstalvi = readWord("Introdueix el número del compte d'estalvi:", "Entrada invàlida")
    val saldoCompteEstalvi = readFloat("Introdueix el saldo del compte d'estalvi:", "Entrada invàlida")

    val compteCorrent = CompteCorrent()
    compteCorrent.setNumeroCompte(numeroCompteCorrent)
    compteCorrent.setSaldo(saldoCompteCorrent.toDouble())

    val compteEstalvi = CompteEstalvi()
    compteEstalvi.setNumeroCompte(numeroCompteEstalvi)
    compteEstalvi.setSaldo(saldoCompteEstalvi.toDouble())

    compteCorrent.retirar(1200.0)
    compteCorrent.consultarSaldo()

    compteEstalvi.ingressar(500.0)
    compteEstalvi.consultarSaldo()

    compteEstalvi.liquidar()
}