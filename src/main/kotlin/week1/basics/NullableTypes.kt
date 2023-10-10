package week1.basics

fun main() {
    var petName: String? = null

    var age: Int? = null

//    if (age != null) {
//        val ageInOneYear = age + 1
//        print("Next year, you will be $ageInOneYear years old.")
//    }

    val ageInOneYear = age?.plus(1) ?: 0

    print("Next year, you will be $ageInOneYear years old.")

    // !! operator you have to take responsibility for nullability
    val ageInOneYearDoubleBang = age!!.plus(1)

    val ageInOneYearSafeCall = age?.plus(1) // will assign null if age is null

    val ageInOneYearElvis = age?.plus(1) ?: 0 // will assign 0 if age is null



}