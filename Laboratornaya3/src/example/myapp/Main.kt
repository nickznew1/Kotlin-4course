package example.myapp

import example.myapp.decor.decoration

fun buildAquarium(){
//    val myAquarium = Aquarium()
//    myAquarium.printSize()
//    myAquarium.height = 60
//    myAquarium.printSize()
//    /////
//
//    val aquarium1 = Aquarium()
//    aquarium1.printSize()
//    //////
//
//    val aquarium2 = Aquarium(width =25)
//    aquarium2.printSize()
//
//    //////
//
//    val aquarium3 = Aquarium(height = 25, length = 110)
//    aquarium3.printSize()
//
//    val aquarium4 = Aquarium(width = 25, height = 25, length = 110)
//    aquarium4.printSize()
//    /////

    /*val aquarium5 = Aquarium(numberOfFish = 29)
    println(aquarium5.volume)

    aquarium5.printSize()*/

    val aquarium6 = Aquarium(length =25, width =25, height = 40)
    aquarium6.printSize()

    val myTower = TowerTank(diameter=25, height = 40)
    myTower.printSize()


}

fun makeFish(){
    val shark = Shark()
    val plecostomus = Plecostomus()

    println("shark: ${shark.color}")
    shark.eat()
    println("plecostomus: ${plecostomus.color}")
    plecostomus.eat()
}

fun main() {
    buildAquarium()
    makeFish()
    makeDecorations()

}

fun makeDecorations() {
    val decoration1 = decoration(
        "granite",
        wood = "TODO()",
        diver = "TODO()"
    )
    decoration1.makeDecorations()

}