# Programació Orientada a Objectes


> [!CAUTION]
> ### 🚀 Execution
> To execute the application, you need the **Amazon Corretto 20 SDK**.
## Una classe consta de tres parts principals:

- Propietats: Són variables que especifiquen els atributs dels objectes de la classe
- Mètodes: Són funcions que contenen els comportaments i les accions de la classe
- Constructors: Una funció de membre especial que crea instàncies de la classe al llarg del programa on es defineix.

### Exemple:

```kotlin
class SmartDevice {

    val name = "Android TV"

    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}
```
En aquest exemple, la classe SmartDevice té una propietat name que representa el nom del dispositiu i dos mètodes, turnOn i turnOff, que imprimeixen missatges indicant si el dispositiu està encès o apagat.

## Instàncies de Classe
Per utilitzar una classe, has de crear instàncies d'ella. En Kotlin, això es fa mitjançant la paraula clau val o var seguida del nom de la instància i l'operador d'assignació, seguit de la invocació del constructor.

```kotlin
val meuSmartDevice = SmartDevice()
```
## Herència
Kotlin permet la herència entre classes. Una classe pot heretar propietats i mètodes d'una altra classe utilitzant la paraula clau :, seguida del nom de la classe base.
```kotlin
open class ElectronicDevice {
    // Propietat de la classe base
    val brand = "MyBrand"

    // Mètode de la classe base
    fun displayBrand() {
        println("Brand: $brand")
    }
}

// Classe derivada que hereta de ElectronicDevice
class SmartPhone : ElectronicDevice() {
    // Noves propietats i mètodes poden ser afegits aquí
}
```
En aquest exemple, la classe SmartPhone hereta la propietat brand i el mètode displayBrand de la classe ElectronicDevice.
## Modificadors d'Accés
Kotlin proporciona modificadors d'accés per controlar la visibilitat de propietats i mètodes dins d'una classe o entre classes. Els modificadors d'accés inclouen public, private, protected i internal.
```kotlin
class Exemple {
    // Accés públic (per defecte)
    val publicProperty = 42

    // Accés privat
    private val privateProperty = "Secret"

    // Accés protegit
    protected val protectedProperty = true

    // Accés intern
    internal val internalProperty = "Internal"
}
```
Aquests modificadors permeten controlar l'abast i la visibilitat de les propietats i mètodes, la qual cosa contribueix a un disseny més robust i segur.






