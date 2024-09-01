
class Programmer(id: Int, name: String, private val monthlySalary: Double, private val bugs: Int) : Employee(id, name) {
    override fun getSalary(): Double {
        return if (bugs < 20) monthlySalary * 1.1 else monthlySalary
    }

    fun getBugs(): Int {
        return bugs
    }

    override fun toString(): String {
        return super.toString() + ", Lương hàng tháng: $monthlySalary, Số lỗi: $bugs, Lương tính được: ${getSalary()}"
    }
}
