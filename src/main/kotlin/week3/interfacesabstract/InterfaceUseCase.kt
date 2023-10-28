package week3.interfacesabstract


// Third Party Code
class SDK {
    fun getData(): Array<String> {
        return arrayOf("Rohan", "25")
    }
}


class SDKAlternate {
    fun getData(): Map<String, Int> {
        return mapOf("Rohan" to 25)
    }
}

interface SDKWrapper {
    fun getData(): String
}

class SDK1 : SDKWrapper {
    private val sdk = SDK()
    override fun getData(): String {
        return sdk.getData().joinToString()
    }
}

class SDK2 : SDKWrapper {
    private val sdk = SDKAlternate()
    override fun getData(): String {
        return sdk.getData().map { "${it.key} ${it.value}" }.joinToString()
    }
}


// OUR code
class ViewModels(
    private val sdk: SDKWrapper = SDK2()
) {
    fun getData(): String {
        return sdk.getData()
    }
}

class MobileScreen(
    private val viewModels: ViewModels
) {
    fun showData() {
        println(viewModels.getData())
    }
}


fun main() {
    val sdk = SDK1()
    val viewModels = ViewModels(sdk)
    val mobileScreen = MobileScreen(viewModels)
    mobileScreen.showData()
}


