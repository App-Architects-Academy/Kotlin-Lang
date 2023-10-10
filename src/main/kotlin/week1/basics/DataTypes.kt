package week1.basics
var petAge: Int = 1
fun main() {

    val petName = "Piku"
    val petName1 = "Togo"
    val petName2 = "Momo"

    val petAgeInShort: Short = 1
    val petAgeInByte: Byte = 1 // ^ 8 bit
    val petAgeInLong = 28788888888888 // ^ 64 bit


    // Fractional
    val ageInDouble = 1.3888 // 64 bit
    val ageInFloat = 1.33444F // 32 bit

    // Scientific Notation

    val uraniumAge = 2.8E10

    val millionValue = 1_000_000
//    print("million operation ${millionValue + 1}")

    // Small data types cannot be assigned to larger data types by default
    petAge = petAgeInByte.toInt()


    // Characters

    val exampleChar = '?'

    // Boolean
    val exampleBoolean = true

    val pet = "Piku"

    val petNameString = pet 

    processeImage()

    print("My pet's name is $petName Any example")
}

