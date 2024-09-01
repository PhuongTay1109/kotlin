
class Tester(id: Int, name: String, private val basicSalary: Double, private val overtimeHours: Int) : Employee(id, name) {
    private val overtimeRate = 200000.0

    override fun getSalary(): Double {
        return basicSalary + overtimeHours * overtimeRate
    }

    fun getOvertimeHours(): Int {
        return overtimeHours
    }

    override fun toString(): String {
        return super.toString() + ", Lương cơ bản: $basicSalary, Số giờ OT: $overtimeHours, Lương tính được: ${getSalary()}"
    }
}
