package lesson4

fun main() {
    val oddDay = 1
    val evenDay = 2
    val dayForHandExercises = oddDay
    val dayForLegExercises = evenDay
    val dayForBackExercises = evenDay
    val dayForAbdominalMusclesExercises = oddDay

    val currentTrainingDay = 5
    println("""
        Упражнения для рук:    ${currentTrainingDay % (dayForHandExercises + 1) != 0}
        Упражнения для ног:    ${currentTrainingDay % dayForLegExercises == 0}
        Упражнения для спины:  ${currentTrainingDay % dayForBackExercises == 0}
        Упражнения для пресса: ${currentTrainingDay % (dayForAbdominalMusclesExercises + 1) != 0}
    """.trimMargin())
}
