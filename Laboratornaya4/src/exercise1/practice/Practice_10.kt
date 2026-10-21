package exercise1.practice

fun main(){
    val timeSpentToday = 300
    val timeSpentYesterday = 250
    println(temp(timeSpentToday, timeSpentYesterday))
}

fun temp(val1 : Int, val2 : Int) : Boolean {
    return val1 > val2
}