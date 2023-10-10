package week1.basics

fun main() {
    val (name, age) = myInfo()
    print("My name is $name and my age is $age")

    val (name1, age1, pet) = myInfoAndPet()
    println("My name is $name1 and my age is $age1 and my pet's name is $pet")
}

fun myInfo() : Pair<String, Int> {
    return "Rohan" to 28
}

fun myInfoAndPet(): Triple<String, Int, String> {
    return Triple("Rohan", 28, "Piku")
}