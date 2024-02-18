package org.example.Activitats_UF4_A15_Lladres_legals

import org.example.Activitats_UF4_A15_Lladres_legals.models.*
import org.example.Utilities.*

fun main() {
    val compteCorrent = CompteCorrent()
    val compteEstalvi = CompteEstalvi()

    var opcio: Int

    do {
        println("${BLUE}----- Menú Principal -----")
        println("${YELLOW}1. Crear un compte corrent")
        println("${YELLOW}2. Crear un compte d'estalvi")
        println("${YELLOW}3. Ingressar")
        println("${YELLOW}4. Consultar saldo")
        println("${YELLOW}5. Retirar diners d'un compte corrent")
        println("${YELLOW}6. Liquidar un compte d'estalvi")
        println("${YELLOW}7. Sortir")
        println("${BLUE}--------------------------")
        print("${GREEN}Selecciona una opció: ${RESET}")

        val input = readln() // Llegim l'entrada de l'usuari com una cadena

        // Intentem convertir l'entrada a un enter
        opcio = input?.toIntOrNull() ?: 0

        // Verifiquem si l'opció és vàlida
        if (opcio in 1..7) {
            when (opcio) {
                1 -> {
                    var numeroCompte: String
                    do {
                        numeroCompte = readWord("${YELLOW}Introdueix el número del compte corrent:", "${RED}Entrada invàlida${RESET}")
                    } while (!esNumeroCompteValid(numeroCompte))
                    compteCorrent.setNumeroCompte(numeroCompte)
                    compteCorrent.setSaldo(readFloat("${YELLOW}Introdueix el saldo del compte corrent:", "${RED}Entrada invàlida${RESET}").toDouble())
                    println("${GREEN}Compte corrent creat amb èxit.${RESET}")
                }
                2 -> {
                    var numeroCompte: String
                    do {
                        numeroCompte = readWord("${YELLOW}Introdueix el número del compte d'estalvi:", "${RED}Entrada invàlida${RESET}")
                    } while (!esNumeroCompteValid(numeroCompte))
                    compteEstalvi.setNumeroCompte(numeroCompte)
                    compteEstalvi.setSaldo(readFloat("${YELLOW}Introdueix el saldo del compte d'estalvi:", "${RED}Entrada invàlida${RESET}").toDouble())
                    println("${GREEN}Compte d'estalvi creat amb èxit.${RESET}")
                }
                3 -> {
                    println("${YELLOW}1. Ingressar a compte corrent${RESET}")
                    println("${YELLOW}2. Ingressar a compte d'estalvi${RESET}")
                    print("${GREEN}Selecciona una opció: ${RESET}")
                    val opcioIngressar = readInt("", "${RED}Si us plau, introdueix un número vàlid.${RESET}", "", 1, 2)
                    val quantitat = readFloat("${YELLOW}Introdueix la quantitat a ingressar:", "${RED}Entrada invàlida${RESET}")
                    when (opcioIngressar) {
                        1 -> {
                            compteCorrent.ingressar(quantitat.toDouble())
                            println("${GREEN}Ingressat amb èxit.${RESET}")
                        }
                        2 -> {
                            compteEstalvi.ingressar(quantitat.toDouble())
                            println("${GREEN}Ingressat amb èxit.${RESET}")
                        }
                    }
                }
                4 -> {
                    println("${YELLOW}1. Consultar saldo de compte corrent${RESET}")
                    println("${YELLOW}2. Consultar saldo de compte d'estalvi${RESET}")
                    print("${GREEN}Selecciona una opció: ${RESET}")
                    val opcioConsultar = readInt("", "${RED}Si us plau, introdueix un número vàlid.${RESET}", "", 1, 2)
                    when (opcioConsultar) {
                        1 -> compteCorrent.consultarSaldo()
                        2 -> compteEstalvi.consultarSaldo()
                    }
                }
                5 -> {
                    compteCorrent.retirar(readFloat("${YELLOW}Introdueix la quantitat a retirar:", "${RED}Entrada invàlida${RESET}").toDouble())
                    println("${GREEN}Retirada amb èxit.${RESET}")
                }
                6 -> {
                    compteEstalvi.liquidar()
                }
            }
        } else {
            println("${RED}Si us plau, introdueix un número vàlid.${RESET}")
        }

        if (opcio == 7) {
            break // Sortim del bucle si l'usuari tria sortir
        }
    } while (true)
}

fun esNumeroCompteValid(numeroCompte: String): Boolean {
    return numeroCompte.all { it.isDigit() }
}
