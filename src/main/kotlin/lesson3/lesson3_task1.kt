package lesson3

fun main() {
    val userName = "Степан"
    var timeOfDay = "День"
    var welcomeMessage = "Добрый $timeOfDay, $userName!"

    println(welcomeMessage)
    timeOfDay = "Вечер"
    welcomeMessage = "Добрый $timeOfDay, $userName!"
    println(welcomeMessage)
}
