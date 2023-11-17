package lesson1

fun main() {
    // 1ч 48 мин = 108 мин = 6480 сек
    val secondsInMinute = 60
    val secondsInHour = secondsInMinute * 60

    val flightTimeInSeconds = 6480
    val hours = flightTimeInSeconds / secondsInHour
    val minutes = (6480 - hours * secondsInHour) / secondsInMinute
    val seconds = (6480 - hours * secondsInHour - minutes * secondsInMinute)

    // Может есть более элегантный способ, но я нагуглил только через .padStart и .format
    println("${hours.toString().padStart(2, '0')}:${minutes.toString().padStart(2, '0')}:${seconds.toString().padStart(2, '0')}")
}
