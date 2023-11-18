package lesson4

const val NUMBER_OF_TABLES = 13
fun main() {
    val numberOfTablesReservedToday = 13
    val numberOfTablesReservedTomorrow = 9

    val tableAvailabilityForToday = NUMBER_OF_TABLES > numberOfTablesReservedToday
    val tableAvailabilityForTomorrow = NUMBER_OF_TABLES > numberOfTablesReservedTomorrow

    println("Доступность столиков на сегодня: $tableAvailabilityForToday," +
            "\nДоступность столиков на завтра: $tableAvailabilityForTomorrow")
}
