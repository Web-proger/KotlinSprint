package lesson1

fun main() {
    // Количество заказов может меняться, поэтому уместнее var, но c учётом отсутствия другой логики, оставил val
    val orderCount: Int = 75
    val orderSuccessMessage: String = "Поздравляем с успешной покупкой"
    println("Сегодня в магазине было оформлено $orderCount заказов")
    println(orderSuccessMessage)
}
