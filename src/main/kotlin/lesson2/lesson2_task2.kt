package lesson2

fun main() {
    val permanentEmployeesCount = 50
    val traineeshipEmployeesCount = 30
    val traineeshipSalary = 30000
    val permanentSalary = 20000

    val summarySalaryOfPermanentEmployees = permanentEmployeesCount * traineeshipSalary
    val summarySalaryOfTraineeshipEmployees = traineeshipEmployeesCount * permanentSalary
    val totalPayroll = summarySalaryOfPermanentEmployees + summarySalaryOfTraineeshipEmployees
    val averageEmployeeSalary = totalPayroll / (permanentEmployeesCount + traineeshipEmployeesCount)

    println("""
        Расходы на выплату зарплаты постоянных сотрудников $summarySalaryOfPermanentEmployees
        Общие расходы по ЗП после прихода стажеров $totalPayroll
        Среднюю ЗП одного сотрудника после устройства стажеров $averageEmployeeSalary
    """.trimIndent())
}
