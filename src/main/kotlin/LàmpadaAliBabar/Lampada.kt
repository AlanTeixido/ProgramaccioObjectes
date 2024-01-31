import org.example.Utilities.*

class Lampada(private val identificador: String) {
    private var encesa: Boolean = false
    private var color: String = "Blanc"
    private var intensitat: Int = 0
    private val colorsValids = listOf("Blanc", "Negre", "Blau", "Vermell", "Verd", "Rosa")

    fun encendre() {
        encesa = true
        mostrarEstat()
    }

    fun apagar() {
        encesa = false
        mostrarEstat()
    }

    fun canviarColor() {
        val colorIntroduit = readWord("Introdueix el color de la làmpada:", "Cal introduir un color.")

        color = when (colorIntroduit.toLowerCase()) {
            "blanc" -> "${WHITE}$colorIntroduit${RESET}"
            "negre" -> "${BLACK}$colorIntroduit${RESET}"
            "blau" -> "${BLUE}$colorIntroduit${RESET}"
            "vermell" -> "${RED}$colorIntroduit${RESET}"
            "verd" -> "${GREEN}$colorIntroduit${RESET}"
            "rosa" -> "${PURPLE}$colorIntroduit${RESET}"
            in colorsValids -> colorIntroduit
            else -> {
                println("${RED_BOLD}Error: Color no vàlid. S'usarà el color per defecte: Blanc.${RESET}")
                "Blanc"
            }
        }

        mostrarEstat()
    }

    fun canviarIntensitat() {
        intensitat = readInt("Introdueix la intensitat de la làmpada (de 1 a 5):", "${RED_BOLD} Cal introduir un valor numèric.${RESET}", "La intensitat ha de ser entre 1 i 5.", 1, 5)
        mostrarEstat()
    }

    private fun mostrarEstat() {
        val estat = if (encesa) "${GREEN}encés${RESET}" else "${RED}apagat${RESET}"
        val dibuixLampada = if (encesa) "🌟" else "💡"
        println("$identificador - Estat: $estat, Color: $color, Intensitat: $intensitat $dibuixLampada")
    }
}
