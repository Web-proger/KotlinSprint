package lesson5

import kotlin.random.Random

fun main() {
    val winningNumber1 = Random.nextInt(0, 43)
    val winningNumber2 = Random.nextInt(0, 43)
    var correctAnswersCount = 0

    println("""
        Добро пожаловать в розыгрыш лотереи!
        У вас 2 попытки. Возможны диапазон ответов от 0 до 42.
        Если угождаете одно число - получите утешительный приз! Если два - главный приз!
    """.trimIndent())

    println("Введите первое число.")
    val firstNumber = readln().toInt()
    println("Введите второе число.")
    val secondNumber = readln().toInt()
    println("$winningNumber1, $winningNumber2")

    if (firstNumber == winningNumber1 || firstNumber == winningNumber2) ++correctAnswersCount
    if (secondNumber == winningNumber1 || secondNumber == winningNumber2) ++correctAnswersCount

    val resultMessage = when(correctAnswersCount) {
        2 -> "Поздравляем! Вы выиграли главный приз!"
        1 -> "Вы выиграли утешительный приз!"
        else -> "Неудача!"
    }

    println(resultMessage)
}
