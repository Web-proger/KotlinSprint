package lesson5

fun main() {
    val correctAnswer = 42
    val controlCase = "34 + 8"

    println("Мы должны убедиться что вы не бот. Решите простой пример. Сколько будет $controlCase?")
    val userAnswer = readln().toInt()
    if (userAnswer == correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
