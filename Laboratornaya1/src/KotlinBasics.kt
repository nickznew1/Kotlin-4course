fun main(){
    val i  = 6
val b1 = i.toByte()
println(b1)
   //////
val b2: Byte =1
println(b2)
    //////
val i4 :Int = b2.toInt()
println(i4)
    /////
val i5: String = b2.toInt().toString()
println(i5)
    //////
val i6: Double = b2.toDouble()
println(i6)
    /////
val oneMillion = 1_000_000
println(oneMillion)
    /////
val socialSecurityNumber = 999_99_9999L
println(socialSecurityNumber)
    /////
val hexBytes = 0xFF_EC_DE_5E
print(hexBytes)
    /////
val bytes = 0b11010010_01101001_10010100_10010010
println(bytes)
    /////
var numberOfFish =5
var numberOfPlants = 12
    /////
println("I Have $numberOfFish fish and $numberOfPlants plants")
/////
println("I have ${numberOfFish + numberOfPlants} fish and plants")
/////
/////
    numberOfFish = 50
    numberOfPlants = 23

    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Bad ratio!")
    }
    //////

    val fish = 50
    if (fish in 1..100){
        println(fish)
    }

    /////

    if (numberOfFish == 0){
        println("Empty tank")
    } else if (numberOfFish < 40){
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }

    /////


    when (numberOfFish) {
        0 -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish")
    }
    //////

    var rocks: Int? = null
    println(rocks)


    var fishFoodTreats =6
    fishFoodTreats?.dec()
    println(fishFoodTreats)

    if (fishFoodTreats !=null) {
        fishFoodTreats = fishFoodTreats.dec()
        println("fishfood treats: $fishFoodTreats")
    }
    /////

    val school = listOf("mackerel", "trout", "halibut")
    println(school)


    /////

    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
    println(myList)

    /////


    val school1 = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school1))

    //////

    var mix = arrayOf<Any>("fish", 2)
    println(java.util.Arrays.toString(mix))

    //////

    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo = numbers3+numbers
    println(foo[5])


    /////

    val numbers2 = intArrayOf(1,2,3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers2, oceans, "salmon")
    println(oddList)

    //////


    val array = Array(5) {it *2}
    println(java.util.Arrays.toString(array))

    ///////

    val test = arrayOf("shark", "salmon", "minnow")
    for (element in school) {
        print(element + " ")
    }

    print("\n")

    for ((index, element) in test.withIndex()){
        println("Item at $index is $element\n")
    }

    for (i in 1..5)print(i)
    for (i in 5 downTo 1) print(i)
    for (i in 3..6 step 2) print(i)
    for (i in 'd'..'g') print (i)


    var bubbles = 0
    while (bubbles <50){
        bubbles++
    }

    println("$bubbles bubbles in the water \n")

    do {
        bubbles--
    } while (bubbles >50)

    println("$bubbles in the water \n")

    repeat(2){
        println("A fish is swimming")
    }

    var string = "string"
    println(string.length)




}