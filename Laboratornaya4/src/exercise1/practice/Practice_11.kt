package exercise1.practice

fun main() {

    println(temp("Ankara", 27, 31, 82))


}

fun temp (
    city : String,
    lTemp : Int,
    hTemp : Int,
    rainChance : Int) : String {

    return "City: $city, Low temperature: $lTemp, High temperature: $hTemp, Chance of rain: $rainChance%"
}