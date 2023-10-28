package week3.interfacesabstract

abstract class AbstractCourse(val courseLevel: String) {

    var courseType: String = "Unknown Type"
    abstract fun getCourseDetails(): String

    fun getDefaultDuration(): String {
        return "3 Hours"
    }
}

open class ConcreteClass {
    val courseType: String = "Unknown Type"
}

class KMMConcreteClass: ConcreteClass() {

//    override val courseType : String = "Online"
}

abstract class AbstractDuration {
    fun getCourseDuration(): String {
        return "Unknown Duration"
    }

}


class KMMCourse: BasicAbstractCourse("Advanced") {
    override fun getAuthor(): String {
        TODO("Not yet implemented")
    }


    override fun getCourseDetails(): String {
        return "This is a KMM course: type: $courseType, level: $courseLevel: duration: ${getDefaultDuration()} "
    }
}

abstract class BasicAbstractCourse(val level:String) : AbstractCourse(level) {

    abstract fun getAuthor(): String
    override fun getCourseDetails(): String {
        return "This is a KMM course: type: $courseType, level: $courseLevel: duration: ${getDefaultDuration()} "
    }
}

fun main() {
    val course = KMMCourse()
    println(course.getCourseDetails())
    course.courseType = "Online"
    println(course.getCourseDetails())
}