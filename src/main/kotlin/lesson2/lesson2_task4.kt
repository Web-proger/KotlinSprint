package lesson2

fun main() {
    val buffPercent = 20
    val crystallineOre = 7
    val ironOre = 11

    fun getValueOfBonusExtraction (baseValue: Int, accelerationPercent: Int): Int = (baseValue.toFloat() / 100 * accelerationPercent).toInt()
    val bonusCrystallineOre = getValueOfBonusExtraction(crystallineOre, buffPercent)
    val bonusIronOre =  getValueOfBonusExtraction(ironOre, buffPercent)

    println("Кристаллическая руда: $bonusCrystallineOre")
    println("Железная руда: $bonusIronOre")
}
