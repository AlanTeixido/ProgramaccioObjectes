package org.example.Activitat3

fun main(args: Array<String>) {
    val persona: Persona = Persona()
    persona.nom = "Persona";persona.cognoms = "Uno";
    val persona2: Persona = Persona()
    persona2.nom = "Persona";persona2.cognoms = "Dos";
    val persona3: Persona = Persona()
    persona3.nom = "Persona";persona3.cognoms = "Tres";

    persona.neixer()
    persona.parlar()
    persona.morir()
    persona2.neixer()
    persona3.caminar()
}