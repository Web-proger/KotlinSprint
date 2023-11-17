package lesson1

fun main() {
    val secondsInMinute = 60
    val secondsInHour = secondsInMinute * 60
    val flightTimeInSeconds = 6480

    val hours = flightTimeInSeconds / secondsInHour
    val minutes = (6480 - hours * secondsInHour) / secondsInMinute
    val seconds = (6480 - hours * secondsInHour - minutes * secondsInMinute)

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}
