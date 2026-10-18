package example.myapp

fun String.hasSpaces(): Boolean{
    val found = this.indexOf(' ')
    return found != -1
}

open class AquariumPlant(val color: String, private val size: Int){
    open val AquariumPlant.isGreen : Boolean
    get() = color == "green"
}

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")
fun main(){
    val plant = GreenLeafyPlant(size = 10)
    plant.print()
    println("\n")
    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()
}