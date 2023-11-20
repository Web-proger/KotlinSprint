package lesson4

const val MIN_CREW_COUNT = 55
const val MAX_CREW_COUNT = 70
const val MINIMUM_PROVISIONS_COUNT = 50

fun main() {
    println("Есть ли повреждения коробя? [true / false]:")
    val currentShipHasDamage = readln().toBoolean()
    println("Введите число экипажа:")
    val currentCrewCount = readln().toInt()
    println("Введите число провизии на борту:")
    val currentProvisionsCount = readln().toInt()
    println("Благоприятные ли погодные условия: [true / false]")
    val isFavorableWeather = readln().toBoolean()

    val isShipReadyForExpedition = (!currentShipHasDamage && currentCrewCount >= MIN_CREW_COUNT && currentCrewCount <= MAX_CREW_COUNT && currentProvisionsCount > MINIMUM_PROVISIONS_COUNT)
            || (currentCrewCount == MAX_CREW_COUNT && isFavorableWeather && currentProvisionsCount >= MINIMUM_PROVISIONS_COUNT)

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
