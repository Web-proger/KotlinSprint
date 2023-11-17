package lesson3

fun main() {
    var startPosition = "E2"
    var finishPosition = "E4"
    var moveNumber = 22

    println("[$startPosition-$finishPosition;$moveNumber]")
    startPosition = "D2"
    finishPosition = "D3"
    println("[$startPosition-$finishPosition;${++moveNumber}]")

}
