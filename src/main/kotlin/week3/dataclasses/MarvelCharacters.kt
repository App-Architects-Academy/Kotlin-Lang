package week3.dataclasses

data class MarvelCharacter(
    val personalName: String,
    val heroName: String,
    val mainPower: Power
) : BaseCharacter("Marvel") {

    val place: String = "New York"

    init {
        println("I am a marvel character")

    }


    fun getDetails() {
        println("My name is $heroName and my power is ${mainPower.powerName}")
    }
    companion object {

    }
}


open class BaseCharacter(
    val type: String
)

data class Power(
    var powerName: String,
    var powerLevel: Int
)

class MarvelCharacterNormal(
    val personalName: String,
    val heroName: String,
    val mainPower: String
) {

}

fun main() {
    val spiderMan = MarvelCharacter(
        personalName = "peter",
        heroName = "spiderman",
        mainPower = Power("spider sense", 10)
    )
    val spiderManCopy = spiderMan.copy(
        personalName = "Miles",
        mainPower = spiderMan.mainPower.copy(powerName = "electricity")
    )

    spiderManCopy.mainPower.powerName = "electric webs"

    val heroArray = arrayOf(spiderMan, spiderManCopy)

    for ((_, heroName, power) in heroArray) {
        println("My hero name is $heroName and my power is $power")
    }

    println(spiderMan.component3())

}