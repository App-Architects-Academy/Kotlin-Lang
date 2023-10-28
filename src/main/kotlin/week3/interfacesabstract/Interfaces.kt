package week3.interfacesabstract

interface Course {

    val courseLevel: String
        get() = "Unknown Level"

    fun defaultImplementation() {
        println("This is a default implementation")
    }
    fun getCourseDetails(): String

}

interface BaseCourse: Course {

    fun getCourseType(): String

}

class ConcreteBaseCourse: BaseCourse {

    override fun getCourseType(): String {
        return "Unknown Type"
    }

    override fun getCourseDetails(): String {
        TODO("Not yet implemented")
    }

}

interface CourseDuration {

    fun getCourseDuration(): String
}

class KotlinCourse : Course, CourseDuration {


    override fun getCourseDetails(): String {
        return "This is a Kotlin course"
    }

    override fun getCourseDuration(): String {
        TODO("Not yet implemented")
    }

}


class UniversityCourses(val kotlinCourse: KotlinCourse) {


    fun teachThisCourse() {}
}