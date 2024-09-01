class ProductionEmployee(
    name: String,
    birthDate: String,
    address: Address,
    private val baseSalary: Int,
    private val numberOfProducts: Int
) : Employee(name, birthDate, address) {
    override fun calculateSalary(): Int {
        return baseSalary + numberOfProducts * 5000
    }
}