package lesson4

fun main() {
    val averageMinimumWeightInKg = 35
    val averageMaximumWeightInKg = 100
    val maximumVolumeInLiters = 100

    val cargo1Weight = 20
    val cargo1Volume = 80
    val cargo2Weight = 50
    val cargo2Volume = 100

    println("Груз с весом $cargo1Weight кг и объемом $cargo1Volume л соответствует категории 'Average': " +
            "${(cargo1Weight >= averageMinimumWeightInKg && cargo1Weight <= averageMaximumWeightInKg) && cargo1Volume < maximumVolumeInLiters }")
    println("Груз с весом $cargo2Weight кг и объемом $cargo2Volume л соответствует категории 'Average': " +
            "${(cargo2Weight >= averageMinimumWeightInKg && cargo2Weight <= averageMaximumWeightInKg) && cargo2Volume < maximumVolumeInLiters }")
}
