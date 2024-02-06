package Electrodomèstics

open class Electrodomestic {
    private var preuBase:Double=0.0
    private var color:Color=Color.BLANC
    private var consum:Consum=Consum.G
    private var pes:Int=5
    private var tipusEndoll:Endoll=Endoll()

    constructor(){}
    constructor(color:Color, consum:Consum, pes:Int):this(){
        this.color=color
        this.consum=consum
        this.pes=pes
    }

    //setters
    fun setPreuBase(preuBase:Double){ this.preuBase=preuBase }
    fun setColor(color:Color){ this.color=color }
    fun setConsum(consum:Consum){ this.consum=consum }
    fun setPes(pes:Int){ this.pes=pes }

    //getters
    fun getPreuBase():Double{ return this.preuBase }
    fun getColor():Color{ return this.color }
    fun getConsum():Consum{ return this.consum }
    fun getPes():Int{ return this.pes }

    open fun preuFinal():Double{
        var preuFinal:Double = this.preuBase

        preuFinal += when(this.consum){
            Consum.A -> 35
            Consum.B -> 30
            Consum.C -> 25
            Consum.D -> 20
            Consum.E -> 15
            Consum.F -> 10
            else -> 0
        }

        preuFinal += when(this.pes){
            in 0..5 -> 0
            in 6..20 -> 20
            in 21..50 -> 50
            in 51..80 -> 80
            else -> 100
        }
        return preuFinal
    }

    override fun toString():String{
        var text:String
        text = "Preu Base:   ${this.preuBase}€\n"
        text+= "Color:       ${this.color}\n"
        text+= "Cia. Energ.: ${this.consum}\n"
        text+= "Pes:         ${this.pes}Kg\n"
        text+= "Endoll:      ${this.tipusEndoll.descripcio}\n"
        text+= "Preu Final:  ${this.preuFinal()}€\n"

        return text
    }
}












