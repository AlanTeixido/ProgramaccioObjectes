package Electrodomèstics

class Endoll {
    private var tipus:String="Schuko"
    @JvmField var descripcio:String="El gruixut amb pressa de terra"

    constructor(){ }
    constructor(tipus:String){ this.tipus=tipus }

    fun setTipus(tipus:String){ this.tipus=tipus }
    fun setDescripcio(descripcio:String){ this.descripcio=descripcio }

    fun getTipus():String{ return this.tipus }
    fun getDescripcio():String{ return this.descripcio }
}