package lesson5

const val ACTIVE_USER1 = "Zaphod"
const val ACTIVE_PASSWORD_FOR_USER1 = "PanGalactic"

fun main() {
    println("""
        Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "Heart of Gold".
        [вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.
        Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. [вздыхает ещё глубже...]
        Да, вперед, пожалуйста, вводите свои данные...
    """.trimIndent())

    println("Введите имя пользователя")
    val userName = readln()

    val userAccessMessage = if (userName == ACTIVE_USER1) {
        println("Введите пароль")
        val userPassword = readln()
        if (userPassword == ACTIVE_PASSWORD_FOR_USER1) """
            [вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь $userName, вам разрешено входить на борт корабля "Heart of Gold".
            Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...] Надеюсь, вам понравится пребывание здесь больше, чем мне.
        """.trimIndent()
        else "Пароль пользователя $userName введен не верно, попробуйте заново пройти авторизацию"
    } else "Пользователь $userName не найден в системе, пожалуйста, перейдите к процессу регистрации"

    println(userAccessMessage)
}
