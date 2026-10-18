package example.myapp

interface FishColor {
    val color : String
}


interface FishAction {
    fun eat()
}

object GoldColor : FishColor {
    override val color = "gold"
}

class Shark : FishColor, FishAction {
    override val color = "grey"
    override fun eat(){
        println("hunt and eat fish")
    }
}

enum class Color(val rgb :Int){
    RED(0xFF0000),GREEN(0x00FF00),BLUE(0x0000FF);
}



class Plecostomus(
    fishColor : FishColor = GoldColor) :
    FishColor by fishColor,
    FishAction by PrintingFishAction("eat algae")


class PrintingFishAction(val food : String) : FishAction {
    override fun eat(){
        println(food)
    }
}




