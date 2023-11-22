package lesson4

const val IS_SUNNY_WEATHER = true
const val IS_OPEN_TENT = true
const val AIR_HUMIDITY = 20
const val EXCLUDE_THE_SEASON = "winter"

fun main() {
    val isCurrentSunnyWeather = true
    val isCurrentOpenTent = true
    val currentAirHumidity = 20
    val currentSeason = "winter"

    val isFavorableEnvironment = isCurrentSunnyWeather == IS_SUNNY_WEATHER
        && IS_OPEN_TENT == isCurrentOpenTent
        && AIR_HUMIDITY == currentAirHumidity
        && currentSeason != EXCLUDE_THE_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorableEnvironment")
}
