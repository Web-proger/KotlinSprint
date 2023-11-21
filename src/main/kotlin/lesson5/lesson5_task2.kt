package lesson5

const val AGE_OF_MAJORITY = 18

fun main() {
    val currentYear = 2023

    println("Введите год вашего рождения: ")
    val userYearOfBirth = readln().toInt()
    val useHasFullAccess = (currentYear - userYearOfBirth) >= AGE_OF_MAJORITY

    val resultText = if (useHasFullAccess) "Показать экран со скрытым контентом"
    else "Вернуться на главный экран"
    println(resultText)
}
