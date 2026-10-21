package exercise1.practice

fun main() {
    var firstNumber = 10
    var secondNumber = 5
    var result = firstNumber + secondNumber

    println("$firstNumber + $secondNumber = $result")

    firstNumber = 10
    secondNumber = 5
    var thirdNumber = 8

    result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

fun add (
    num1: Int,
    num2: Int) : Int {

    return num1+num2
}