package exercise1

fun main(){
    val trip1 = 3.20
    val trip2 = 4.10
    val trip3 = 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")


    val nextMeeting = "Next meeting: "
    val date = "January 1"
    val reminder = "$nextMeeting$date at work"
    println(reminder)

    val notificationsEnabled: Boolean = false
    println("Are notifications enabled? " + notificationsEnabled)
}