package week1.basics

fun main() {
    val pets = arrayOf("piku", "togo", "momo", "hul")

    val numRange = 1..10

//    for (pet in pets) println(pet)

//    for(index in pets.indices) {
//        if (index == 2) {
//            continue
//        }
//        println("Index: $index Element: ${pets[index]}")
//    }


//    for(item in 1..10) {
//        println(item)
//    }
//
//    for(item in 1 until 10) {
//        if (item == 8) {
//            break
//        }
//        println(item)
//    }
//
//    for(item in 10 downTo 1) {
//        println(item)
//    }
//
//    for (item in 10 downTo 1 step 2) {
//        println(item)
//    }
//
//    for (pet in pets.reversedArray()) {
//
//        println(pet)
//    }

    var sum = 10
//    while(sum < 10) {
//        println(sum)
//        sum++
//    }

    do {
        println(sum)
    } while (sum < 10)
}