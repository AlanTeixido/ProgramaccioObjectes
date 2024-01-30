package org.example.Activitats_UF4_A4
import org.example.Activitat3.Persona

fun main() {

    mostrarMenuCercle()




}

fun mostrarMenuCercle () : String{

    println("\n ARA LA PERSONA \n")

    val persona1 = EXClassePersona()
    val persona2 = EXClassePersona("Calva", "Maria")
    val persona3 = EXClassePersona("123456789A","Laura", "Mares",12,true)


    println(persona1)
    println(persona2)
    println(persona3)

    persona1.aniversari()
    persona2.casament()
    persona3.divorci()

    println(persona1)
    println(persona2)
    println(persona3)

}

fun mostrarMenuPersona () :String{
    println("\n ARA EL CERCLE \n")

    while (true){
        println("\nMenu:")
        println("1.- Crear un cercle d'un radi  i d'un color ")
        println("2.- Crear un cercle d'un radi ")
        println("3.- Mostrar últim cercle creat")
        println("4.- Mostrar perímetre últim cercle creat")
        println("5.- Mostrar àrea últim cercle creat")
        println("6.- Sortir")

        print("Escull una opció: ")
        val opcio = readln()

    when (opcio){
        "1"-> {
            println("Introdueix el radi del cercle")
            val radi = readln().toFloat()

            println("Introdueix el color del cercle")
            val color = readln()
            val cercle= Cercle(radi, color)
            println("Cercle de: $cercle")
        }

        "2"->{
            println("Introdueix el radi del cercle")
            var radi = readln().toFloat()
            val cercle = Cercle(radi)
            println("Cercle de: $cercle")
        }

        "3"->{
            println("Ultim cercle creat $cercle")


        }

        "4"->{
            println("Parametres del ultim cercle creat: $")
        }

        "5"->{

        }
        "6"->{
            println("Adeu Andreu")
            break
        }
        else ->{
            println("Opcio incorrecte... :(")
        }


     }
    }
}
