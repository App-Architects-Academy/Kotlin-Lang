package week3.interfacesabstract

interface BasicCourse {

    fun getCourseDetails(): String

    fun getCourseType(): String

    fun getCourseLevel(): String

}

class OnlineCourse : BasicCourse {
    override fun getCourseDetails(): String {
        return "This is an online course"
    }

    override fun getCourseType(): String {
        return "Online"
    }

    override fun getCourseLevel(): String {
        return "Unknown Level"
    }
}

class OfflineCourse : BasicCourse {
    override fun getCourseDetails(): String {
        return "This is an offline course"
    }

    override fun getCourseType(): String {
        return "Offline"
    }

    override fun getCourseLevel(): String {
        return "Unknown Level"
    }
}


class ComposeClass : BasicCourse by OnlineCourse() {

    override fun getCourseLevel(): String {
        return "Advanced"
    }

}


// Java ByteCode Exploration
class ComposeClassJava: BasicCourse {

    private val onlineCourseDelegate: OnlineCourse = OnlineCourse()
    private val offlineCourseDelegates: OfflineCourse = OfflineCourse()
    override fun getCourseDetails(): String {
        return onlineCourseDelegate.getCourseDetails()
    }

    override fun getCourseType(): String {
        return onlineCourseDelegate.getCourseType()
    }

    override fun getCourseLevel(): String {
        return "Advanced"
    }

}
