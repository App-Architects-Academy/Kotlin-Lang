package week1.basics
fun main() {

    val pets = arrayOf(
        "Cat",
        "Dog",
        "Rabbit",
        "Hamster",
    )
    for(pet in pets) {
        if(pet == "Cat") {
            println("Cat likes milk")
        } else if (pet == "Dog") {
            println("Dog likes bones")
        } else if (pet == "Rabbit") {
            println("Rabbit likes carrots")
        } else {
            println("Hamster likes cheese")
        }

        // if and else as expressions
        val favouriteFood = if(pet == "Cat") {
            "milk"
        } else if (pet == "Dog") {
            "bones"
        } else if (pet == "Rabbit") {
            "carrots"
        } else {
            "cheese"
        }

        println("$pet likes $favouriteFood")

        // when regular usecase
        val favouriteFoodWhen = when (pet) {
            "Cat" -> "milk"
            "Dog" ->"bones"
            "Rabbit" ->  "carrots"
            else -> "cheese"
        }
    }




    val isSunday = false
    val timeIn24HourFormat = 14

    val greeting = when {
        isSunday -> "I will be on bed all day"
        timeIn24HourFormat < 5 -> "Why up so early?"
        timeIn24HourFormat in 10..11 -> "Good morning!"
        timeIn24HourFormat == 13 -> "Time for lunch!"
        else -> "Good day!"
    }

    val petEnum = Pets.CAT
    val favoriteFoodEnum = when(petEnum) {
        Pets.CAT -> "milk"
        Pets.DOG -> "bones"
        Pets.RABBIT -> "carrots"
        Pets.HAMSTER -> "cheese"
    }

}

enum class Pets {
    CAT, DOG, RABBIT, HAMSTER
}

