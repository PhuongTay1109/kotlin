fun main() {
    val employees = mutableListOf<Employee>()

    fun inputEmployee(): Employee? {
        println("Chọn loại nhân viên (1: Lập trình viên, 2: Kiểm thử):")
        val choice = readLine()?.toIntOrNull()
        return when (choice) {
            1 -> {
                println("Nhập Mã nhân viên:")
                val id = readLine()?.toIntOrNull() ?: return null
                println("Nhập Tên:")
                val name = readlnOrNull() ?: return null
                println("Nhập Lương hàng tháng:")
                val salary = readLine()?.toDoubleOrNull() ?: return null
                println("Nhập Số lỗi:")
                val bugs = readLine()?.toIntOrNull() ?: return null
                Programmer(id, name, salary, bugs)
            }
            2 -> {
                println("Nhập Mã nhân viên:")
                val id = readLine()?.toIntOrNull() ?: return null
                println("Nhập Tên:")
                val name = readLine() ?: return null
                println("Nhập Lương cơ bản:")
                val salary = readLine()?.toDoubleOrNull() ?: return null
                println("Nhập Số giờ OT:")
                val hours = readLine()?.toIntOrNull() ?: return null
                Tester(id, name, salary, hours)
            }
            else -> null
        }
    }

    fun printEmployees() {
        for (employee in employees) {
            println(employee)
        }
    }

    fun countProgrammersWithBugsUnder5(): Int {
        return employees.count { it is Programmer && (it as Programmer).getBugs() < 5 }
    }

    fun getTesterWithMostOvertime(): Tester? {
        return employees.filterIsInstance<Tester>().maxByOrNull { it.getOvertimeHours() }
    }

    // Nhập danh sách nhân viên
    println("Nhập số lượng nhân viên:")
    val n = readLine()?.toIntOrNull() ?: return
    repeat(n) {
        inputEmployee()?.let { employees.add(it) }
    }

    // Xuất thông tin nhân viên
    println("\nThông tin nhân viên:")
    printEmployees()

    // Tính lương cho nhân viên
    println("\nLương nhân viên:")
    employees.forEach { println("${it.name} có lương là ${it.getSalary()}") }

    // Số lượng lập trình viên có lỗi lập trình dưới 5
    println("\nSố lượng lập trình viên có lỗi dưới 5: ${countProgrammersWithBugsUnder5()}")

    // Thông tin của nhân viên có số giờ OT nhiều nhất
    val topTester = getTesterWithMostOvertime()
    println("\nNhân viên kiểm thử có số giờ OT nhiều nhất: ${topTester?.toString() ?: "Không tìm thấy nhân viên kiểm thử"}")
}
