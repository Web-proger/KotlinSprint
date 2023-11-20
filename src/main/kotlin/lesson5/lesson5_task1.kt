package lesson5

import kotlin.random.Random

fun main() {
    val num1 = Random.nextInt(0, 100)
    val num2 = Random.nextInt(0, 100)
    val correctAnswer = num1 + num2

    println("Мы должны убедиться что вы не бот. Решите простой пример. Сколько будет $num1 + $num2")
    val userAnswer = readln().toInt()
    if (userAnswer == correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
