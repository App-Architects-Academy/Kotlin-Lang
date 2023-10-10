package week1.basics

fun main() {
    val stringFormatNewLine: String = "Rohan\nMaity"
    val stringQuotations: String = "\"Rohan\""
//    println(stringFormatNewLine)
//    println(stringQuotations)


    val stringFormatMultiline: String = """
        My name is Rohan Maity
               I am a android engineer at Motive
        I am a Kotlin enthusiast
    """.trimIndent()

    println(stringFormatMultiline)
}