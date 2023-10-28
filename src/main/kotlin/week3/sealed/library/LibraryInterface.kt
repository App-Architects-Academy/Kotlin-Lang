package week3.sealed.library

sealed interface SDK {

    fun getSDkType(): String {
        return "Mobile SDK"
    }
    fun getSDKVersion(): String

    fun getSDKName(): String

    fun getData(): String

}

class KotlinSDK : SDK {
    override fun getSDKVersion(): String {
        return "1.4.0"
    }

    override fun getSDKName(): String {
        return "Kotlin"
    }

    override fun getData(): String {
        return "Kotlin SDK Data"
    }

}

class JavaSDK : SDK {
    override fun getSDKVersion(): String {
        return "1.8"
    }

    override fun getSDKName(): String {
        return "Java"
    }

    override fun getData(): String {
        return "Java SDK Data"
    }

}