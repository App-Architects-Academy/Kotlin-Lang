package week3.sealed

sealed class Character(val name: String) {
    data class SpiderMan(
        val personalName: String,
        val mainPower: String = "Spider Sense"
    ) : Character("SpiderMan")

    data class SpiderMiles(
        val personalName: String,
        val mainPower: String = "Electricity"
    ) : Character("SpiderMiles")

}

data class IronMan(
    val personalName: String,
    val mainPower: String = "Money and intelligence"
) : Character("IronMan")