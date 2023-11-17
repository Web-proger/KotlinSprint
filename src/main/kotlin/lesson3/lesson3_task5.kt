package lesson3

fun main() {
    val logLine = "D2-D4;0"

    val(chessMove, moveNumber) = logLine.split(';')
    val(startPosition, finishPosition)  = chessMove.split('-')

    println(startPosition)
    println(finishPosition)
    println(moveNumber)
}
