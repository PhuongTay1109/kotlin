class OfficeEmployee(
    name: String,
    birthDate: String,
    address: Address,
    private val daysWorked: Int
) : Employee(name, birthDate, address) {
    override fun calculateSalary(): Int {
        return daysWorked * 100000
    }
}