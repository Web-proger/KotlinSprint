package lesson4

fun main() {
    val isSunnyWeather = true
    val isOpenTent = true
    val airHumidity = 20
    val excludeTheSeason = "winter"

    val isCurrentSunnyWeather = true
    val isCurrentOpenTent = true
    val currentAirHumidity = 20
    val currentSeason = "winter"

    val isFavorableEnvironment = isCurrentSunnyWeather == isSunnyWeather
        && isOpenTent == isCurrentOpenTent
        && airHumidity == currentAirHumidity
        && currentSeason != excludeTheSeason

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorableEnvironment")
}
