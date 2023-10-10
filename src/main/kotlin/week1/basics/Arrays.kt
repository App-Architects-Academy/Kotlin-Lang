package week1.basics

fun main() {
    val pets = arrayOf("piku", "togo", "momo", "hul")
    pets[0] = "juju"

    println("My pets number is ${pets.size}")
    println("My first pet is ${pets[0]}")
    println("My last pet is ${pets[2]}")

    println("My last pet is ${pets[1]}")


    // Heterogeneous Arrays
    val heteroArray = arrayOf("Rohan", 25)
    heteroArray[0] = 2
    heteroArray[1] = "Rohan"
    heteroArray[1] = 9.9

    // 2D arrays
    val twoDArrays = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
    )

    println("2D Array value second: ${twoDArrays[0][2]}")


}

val nums = intArrayOf(1, 2, 3, 4, 5)