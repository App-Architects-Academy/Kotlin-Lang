package week1.basics

fun main() {
    val value = getSumWithMessage(
        b = 10,
        a = 5
    )
}


//fun getSum(a: Int, b: Int, c: Int = 0): Int {
//    return a + b + c
//}

fun getSumWithMessage(message: String = "The Sum is", a: Int, b: Int): String {
    return "$message ${a + b}"
}

//fun getSum(a: Double, b: Double): Double {
//    return a + b
//}