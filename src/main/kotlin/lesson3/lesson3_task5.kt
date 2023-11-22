package lesson3

fun main() {
    val logLine = "D2-D4;0"

    val(startPosition, finishPosition, moveNumber) = logLine.split('-', ';')

    println(startPosition)
    println(finishPosition)
    println(moveNumber)
}
