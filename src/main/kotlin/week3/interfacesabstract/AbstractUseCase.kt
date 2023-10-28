package week3.interfacesabstract

abstract class BaseViewModel(val userId: String) {

    init {
        logUserState()
    }

    fun logUserState() {
        println(" Logging state User Id: $userId")
    }

    abstract fun getUserDetails(): String
}


class ScreenViewModel(userId: String) : BaseViewModel(userId) {

    override fun getUserDetails(): String {
        return "User Id: $userId"
    }
}

class Screen2ViewModel(userId: String,val  userName: String) : BaseViewModel(userId) {

    override fun getUserDetails(): String {
        return "User Id: $userId and name: $userName"
    }


}

fun main() {
    val screenViewModel = ScreenViewModel("123")
    println(screenViewModel.getUserDetails())
}