package lesson2

fun main() {
    val minutesInHour = 60
    val departureTimeInHours = 9
    val departureTimeInMinutes = 39
    val travelTimeInMinutes = 457

    val startTravelTimeInMinutes = departureTimeInHours * minutesInHour + departureTimeInMinutes
    val finishTravelTimeInMinutes = startTravelTimeInMinutes + travelTimeInMinutes
    val arrivalTimeInHours = finishTravelTimeInMinutes / minutesInHour
    val arrivalTimeInMinutes = finishTravelTimeInMinutes % minutesInHour

    println("Время прибытия поезда $arrivalTimeInHours:$arrivalTimeInMinutes")
}
