package example.myapp.decor

data class decoration(val rocks : String, val wood: String, val diver : String) {

    fun makeDecorations() {
        val d5 = decoration("crystal", "wood", "diver")
        println(d5)

        val (rock, wood, diver) = d5
        println(rock)
        println(wood)
        println(diver)
    }
}

class Choice {
    companion object {
        var name :String = "lyric"
        fun showDescription(name :String) = println("My favorite $name")
    }
}

fun main(){
    println(Choice.name)
    Choice.showDescription("Pick")
    Choice.showDescription("Selection")

    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}")

    val numbers = Triple(6,9,42)
    println(numbers.toString())
    println(numbers.toList())

    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}\n")
    println("${equipment2.first.second}")

    val equipment1 = "fish net" to "catching fish"
    val (tool, use) = equipment1
    println("$tool is used for $use")

    val numbers1 = Triple(6,9,42)
    val (n1, n2, n3) = numbers1

    println("$n1 $n2 $n3")
}