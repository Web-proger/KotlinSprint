package lesson4

const val AVERAGE_MINIMUM_WEIGHT_IN_KG = 35
const val AVERAGE_MAXIMUM_WEIGHT_IN_KG = 100
const val AVERAGE_MAXIMUM_VOLUME_IN_LITERS = 100

fun main() {
    val cargo1Weight = 20
    val cargo1Volume = 80
    val cargo2Weight = 50
    val cargo2Volume = 100

    println("Груз с весом $cargo1Weight кг и объемом $cargo1Volume л соответствует категории 'Average': " +
            "${(cargo1Weight >= AVERAGE_MINIMUM_WEIGHT_IN_KG && cargo1Weight <= AVERAGE_MAXIMUM_WEIGHT_IN_KG) && cargo1Volume < AVERAGE_MAXIMUM_VOLUME_IN_LITERS }")
    println("Груз с весом $cargo2Weight кг и объемом $cargo2Volume л соответствует категории 'Average': " +
            "${(cargo2Weight >= AVERAGE_MINIMUM_WEIGHT_IN_KG && cargo2Weight <= AVERAGE_MAXIMUM_WEIGHT_IN_KG) && cargo2Volume < AVERAGE_MAXIMUM_VOLUME_IN_LITERS }")
}
