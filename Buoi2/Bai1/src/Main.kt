fun main() {
    // Tạo địa chỉ với thông tin thực tế
    val address1 = Address("45", "Nguyễn Trãi", "Thanh Xuân", "Hà Nội")
    val address2 = Address("32", "Lê Lai", "Quận 1", "TP Hồ Chí Minh")

    // Tạo danh sách nhân viên sản xuất với thông tin thực tế
    val productionEmployees = listOf(
        ProductionEmployee("Nguyễn Văn Minh", "1985-08-12", address1, 5000000, 120),
        ProductionEmployee("Lê Thị Hoa", "1990-02-25", address2, 4000000, 150),
        ProductionEmployee("Trần Văn Duy", "1988-11-30", address1, 4500000, 100)
    )

    // Tạo danh sách nhân viên văn phòng với thông tin thực tế
    val officeEmployees = listOf(
        OfficeEmployee("Nguyễn Thị Lan", "1992-04-10", address1, 22),
        OfficeEmployee("Nguyễn Văn Tuan", "1987-09-20", address2, 18),
        OfficeEmployee("Hoàng Thị Mai", "1995-06-05", address1, 25)
    )

    // In thông tin và lương của nhân viên sản xuất
    println("Danh sách nhân viên sản xuất:")
    for (employee in productionEmployees) {
        employee.printInfo()
        println("Lương: ${employee.calculateSalary()}")
        println()
    }

    // In thông tin và lương của nhân viên văn phòng
    println("Danh sách nhân viên văn phòng:")
    for (employee in officeEmployees) {
        employee.printInfo()
        println("Lương: ${employee.calculateSalary()}")
        println()
    }
}