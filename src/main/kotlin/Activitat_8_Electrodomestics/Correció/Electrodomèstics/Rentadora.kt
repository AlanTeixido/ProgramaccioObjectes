package Electrodomèstics

class Rentadora:Electrodomestic {
    private var carrega:Int=5

    constructor():super(){ }
    constructor(color:Color, consum:Consum, pes:Int):super(color, consum, pes){ }
    constructor(color:Color, consum:Consum, pes:Int, carrega:Int):super(color, consum, pes){
        this.carrega=carrega
    }

    fun setCarrega(carrega:Int){ this.carrega=carrega }

    fun getCarrega():Int{ return this.carrega }

    override fun preuFinal():Double{
        var preuFinal:Double = super.preuFinal()

        preuFinal += when(this.carrega){
            6-7 -> 55
            8 -> 70
            9 -> 85
            10 -> 100
            else -> 0
        }
        return preuFinal
    }

    override fun toString():String{
        var text:String
        text = "Preu Base:   ${this.getPreuBase()}€\n"
        text+= "Color:       ${this.getColor()}\n"
        text+= "Cia. Energ.: ${this.getConsum()}\n"
        text+= "Pes:         ${this.getPes()}Kg\n"
        text+= "Càrrega:     ${this.carrega}Kg\n"
        text+= "Preu Final:  ${this.preuFinal()}€\n"

        return text
    }
}