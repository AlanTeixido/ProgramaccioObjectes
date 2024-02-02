package org.example.Activitat_8_Electrodomestics
import org.example.Activitat_8_Electrodomestics.models.*


fun main() {
    val electrodomestics: Array<Electrodomestic> = arrayOf(
        Electrodomestic(35, "D", 2),
        Electrodomestic(50, "A", 8),
        Electrodomestic(70, "C", 12),
        Electrodomestic(120, "F", 18),
        Electrodomestic(90, "B", 25),
        Electrodomestic(60, "E", 15),
        Rentadora(300, "A", 10, 15, 5),
        Rentadora(595, "B", 20, 25, 8),
        Televisio(400, "C", 15, 10, 28),
        Televisio(1150, "F", 30, 35, 52)
    )

    var preuBaseElectrodomestics = 0
    var preuFinalElectrodomestics = 0
    var preuBaseRentadores = 0
    var preuFinalRentadores = 0
    var preuBaseTelevisions = 0
    var preuFinalTelevisions = 0

    for (electrodomestic in electrodomestics) {
        println(electrodomestic)
        when (electrodomestic) {
            is Rentadora -> {
                preuBaseRentadores += electrodomestic.preuBase
                preuFinalRentadores += electrodomestic.preuFinal()
            }
            is Televisio -> {
                preuBaseTelevisions += electrodomestic.preuBase
                preuFinalTelevisions += electrodomestic.preuFinal()
            }
            else -> {
                preuBaseElectrodomestics += electrodomestic.preuBase
                preuFinalElectrodomestics += electrodomestic.preuFinal()
            }
        }
    }

    println("\nElectrodomèstics:")
    println("Preu base: $preuBaseElectrodomestics€")
    println("Preu final: $preuFinalElectrodomestics€")

    println("\nRentadores:")
    println("Preu base: $preuBaseRentadores€")
    println("Preu final: $preuFinalRentadores€")

    println("\nTelevisions:")
    println("Preu base: $preuBaseTelevisions€")
    println("Preu final: $preuFinalTelevisions€")
}
