package lesson5

import kotlin.random.Random

fun main() {
    val winningNumbers = List(3) { Random.nextInt(0, 43) }

    println("Введите через пробел 3 числа")
    val useNumbers = readln().trim().split(' ').map { it.toInt() }
    val correctAnswersCount = winningNumbers.intersect(useNumbers.toSet()).size

    val resultMessage = when (correctAnswersCount) {
        3 -> "Вы угадали три числа и выиграли джекпот"
        2 -> "Вы угадали два числа и выиграли крупный приз"
        1 -> "Вы угадали одно число и получите утешительный приз"
        else -> "Вы не угадали ни одного числа"
    }
    println("""
        $resultMessage
        В этом розыгрыше, следующие цифры были выигрышными: $winningNumbers
    """.trimIndent())
}
