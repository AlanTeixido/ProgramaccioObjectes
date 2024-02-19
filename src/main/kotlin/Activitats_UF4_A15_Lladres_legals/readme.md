# Gestor de Comptes Bancaris

## 📌 Descripció

Aquest és un projecte Kotlin per gestionar comptes bancaris, que permet crear comptes corrents i d'estalvi, realitzar ingressos, consultar saldos, retirar diners i liquidar comptes d'estalvi.

## UML

![diagramaUMLClasses](https://github.com/AlanTeixido/ProgramacioObjectes/assets/152865024/c83fcdcd-21f0-4965-8f8c-5c1004457bd9)

## 🔍 Taula de continguts

* [📝 Resum del Projecte](#-resum-del-projecte)
* [🚀 Execució](#-execució)

## 📝 Resum del Projecte

- [CompteBancari.kt](src/main/kotlin/Activitats_UF4_A15_Lladres_legals/models/CompteBancari.kt): Classe que representa un compte bancari.
- [CompteCorrent.kt](src/main/kotlin/Activitats_UF4_A15_Lladres_legals/models/CompteCorrent.kt): Subclasse que representa un compte corrent.
- [CompteEstalvi.kt](src/main/kotlin/Activitats_UF4_A15_Lladres_legals/models/CompteEstalvi.kt): Subclasse que representa un compte d'estalvi.
- [Main.kt](src/main/kotlin/Activitats_UF4_A15_Lladres_legals/Main.kt): Codi de l'aplicació principal.

> [!NOTA]
> El projecte permet calcular el saldo i realitzar diverses operacions amb comptes bancaris.

## 🚀 Execució
![image](https://github.com/AlanTeixido/ProgramacioObjectes/assets/152865024/b5cc2a40-d894-4569-a7d3-bcbe6aec5c95)


> [!PRECAUCIÓ]
> Per executar l'aplicació, assegureu-vos que teniu les dependències necessàries instal·lades.

- [Alan Teixidó](https://github.com/AlanTeixido)



A la funció esNumeroCompteValid, fem servir la funció all per iterar sobre tots els caràcters de la cadena numeroCompte. A continuació, fem servir la funció d'extensió isDigit() per verificar si cada caràcter és un dígit. Aquesta funció isDigit() retorna true si el caràcter és un dígit (0-9) i false altrament. Així, si tots els caràcters de la cadena contenen dígits, la funció all retornarà true, indicant que el número de compte és vàlid. Aquesta implementació ens permet verificar fàcilment si la cadena conté només dígits sense necessitat d'usar expressions regulars.
