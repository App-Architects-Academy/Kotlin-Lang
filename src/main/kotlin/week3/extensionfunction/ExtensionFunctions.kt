package week3.extensionfunction


open class ComicCharacter(
    open val name: String,
    open val mainPower: String,
    private val age: Int = 34
) {
    fun getOriginStory(): String {
        return "Origin Story of $name"
    }

    private fun getMyPower(): String {
        return "My power is $mainPower"
    }
}
data class SpiderMan(
    val personalName: String,
    val heroName: String,
    override val mainPower: String = "Spider Sense",
    private val place: String = "Brooklyn"
) : ComicCharacter(heroName, mainPower) {
    fun getCharacterName(): String {
        return personalName
    }
}


data class Batman(
    val personalName: String,
    override val mainPower: String = "Money",
    val age: Int = 34
) : ComicCharacter("Batman", mainPower)


private fun ComicCharacter.getCharacterName(): String {
    return name
}


// Extension functions gets hidden when we have a function with same name in the class
private fun SpiderMan.getCharacterName(): String {
    return personalName
}


// use case for third party libraru
fun String.showValueWithTimeStamp(): String {
    return "$this ${System.currentTimeMillis()}"
}

fun main() {
    val spiderMan: ComicCharacter = SpiderMan("Peter Parker", "Spiderman")
    val batman = Batman("Bruce Wayne")

    // Extension function are decided at compile and based on compile time type extension function is called
    // this will print comic character's extension function
    println(spiderMan.getCharacterName())

}
