package week3.sealed.library

sealed class DataSource(private val data: String) {

    protected val timeStamp = System.currentTimeMillis()

    open fun getData(): String {
        return data.trim() + "Current TimeStamp Of Creation: $timeStamp"
    }

}

data class Local(val localData: Int) : DataSource(localData.toString()) {

    override fun getData(): String {
        return localData.toString() + "Current TimeStamp Of Creation: $timeStamp"
    }
}

data class Remote(val remoteData: String) : DataSource(remoteData)