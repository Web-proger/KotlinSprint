package lesson2

import kotlin.math.pow

fun main() {
    val depositAmount = 70_000
    val depositPeriodInYears = 20
    val depositPercent = 16.7

    val sum = depositAmount * (1 + depositPercent / 100).pow(depositPeriodInYears)

    println(String.format("%.3f", sum))
}
