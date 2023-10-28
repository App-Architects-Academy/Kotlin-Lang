package week3.sealed.application

import week3.sealed.library.DataSource
import week3.sealed.library.Local
import week3.sealed.library.Remote

class Application (
    private val library: DataSource
) {
    fun showData() {
        println(library.getData())
    }
}
// NOT possible for sealed class
//data class MyOwnDataSource(
//    val myOwnData: String
//) : DataSource()


// NOT possible for sealed interface
//
//class C_SDK : SDK {
//
//}
fun main() {

    val localData = Local(89900)
    val remoteData = Remote("      Remote Data      ")
//    val myOwnData = MyOwnDataSource("My Own Data")
    val application = Application(remoteData)
    application.showData()
}