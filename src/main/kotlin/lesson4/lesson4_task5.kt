package lesson4

fun main() {
    val minCrewCount = 55
    val maxCrewCount = 70
    val minimumProvisionsCount = 50

    println("Есть ли повреждения коробя? [true / false]:")
    val currentShipHasDamage = readln().toBoolean()
    println("Введите число экипажа:")
    val currentCrewCount = readln().toInt()
    println("Введите число провизии на борту:")
    val currentProvisionsCount = readln().toInt()
    println("Благоприятные ли погодные условия: [true / false]")
    val isFavorableWeather = readln().toBoolean()

    val isShipReadyForExpedition = currentProvisionsCount >= minimumProvisionsCount && (
        (!currentShipHasDamage && currentCrewCount >= minCrewCount && currentCrewCount <= maxCrewCount)
        || (currentShipHasDamage && currentCrewCount == maxCrewCount && isFavorableWeather)
    )
    println("""Исходные параметры экспедиции: 
        |Есть ли повреждения коробя: $currentShipHasDamage
        |Число экипажа: $currentCrewCount
        |Число провизии на борту: $currentProvisionsCount
        |Благоприятные погодные условия: $isFavorableWeather
        |
        |Анализируем данные ...
        |
        |Корабль может отправиться в плавание: $isShipReadyForExpedition""".trimMargin())
}
