package Electrodomèstics

fun main(){
    /*var torradora:Electrodomestic = Electrodomestic(Color.PLATEJAT, Consum.D, 2)
    var microones:Electrodomestic = Electrodomestic(Color.BLANC, Consum.E, 7)
    var rentadora:Rentadora = Rentadora(Color.BLANC, Consum.A, 73)

    torradora.setPreuBase(19.95)
    microones.setPreuBase(97.50)
    rentadora.setPreuBase(345.95)
    rentadora.setCarrega(10)

    println(torradora)
    println(microones)
    println(rentadora)*/

    var electrodomestics: Array<Electrodomestic> = arrayOf(
        Electrodomestic(Color.PLATEJAT, Consum.D, 2),
        Electrodomestic(Color.BLANC, Consum.E, 7),
        Rentadora(Color.BLANC, Consum.A, 73)
    )

    var rentadora:Rentadora = Rentadora(Color.BLANC, Consum.A, 73)
    rentadora.setPreuBase(299.99)
    rentadora.setCarrega(10)

    electrodomestics[0].setPreuBase(19.95)
    electrodomestics[1].setPreuBase(97.50)
    electrodomestics[2]=rentadora

    var total=0.0
    var totalPreuBaseElectrodomestics=0.0
    var totalPreuFinalElectrodomestics=0.0
    var totalPreuBaseRentadores=0.0
    var totalPreuFinalRentadores=0.0

    for(e in electrodomestics){
        if(e is Rentadora){
            totalPreuBaseRentadores+=e.getPreuBase()
            totalPreuFinalRentadores+=e.preuFinal()
        } else {
            totalPreuBaseElectrodomestics+=e.getPreuBase()
            totalPreuFinalElectrodomestics+=e.preuFinal()
        }
        println(e)
    }

    println("Electrodomèstics NO rentadora NI televisió:")
    println("Preu base: $totalPreuBaseElectrodomestics€")
    println("Preu final: $totalPreuFinalElectrodomestics€\n")
    println("Rentadores:")
    println("Preu base: $totalPreuBaseRentadores")
    println("Preu final: $totalPreuFinalRentadores")

}