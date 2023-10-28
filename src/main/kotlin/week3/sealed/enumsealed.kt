package week3.sealed

enum class DCCharacter(val heroName: String, val power: String) {

    Superman("Clark Kent", "Super Strength"),
    BatMan("Bruce Wayne", "Money"),
    WonderWoman("Diana Prince", "Lasso of Truth");


    fun getOriginStory() {
        println("I am $heroName")
    }

}

sealed class MCUCharacter(val heroName: String, val power: String) {
    fun getMyPower() {
        println("My power is $power")
    }
}

data class SpiderMan(
    val personalName: String,
    val mainPower: String = "Spider Sense",
    val age: Int = 34
) : MCUCharacter("SpiderMan", mainPower) {

    fun getOriginStory() {
        getMyPower()
        println("I was bitten by a radioactive spider")
    }
}

data class SpiderMiles(
    val personalName: String,
    val mainPower: String = "Electricity",
    val place: String = "Brooklyn"
) : MCUCharacter("SpiderMiles", mainPower) {

    fun getMyPlace() {
        println("I am from $place")
    }
}



sealed class Result<out T> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Error(val exception: Exception) : Result<Nothing>()
}
