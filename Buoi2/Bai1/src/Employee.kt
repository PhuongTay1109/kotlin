open class Employee(
    val name: String,
    val birthDate: String,
    val address: Address
) {
    open fun calculateSalary(): Int {
        return 0
    }

    open fun printInfo() {
        println("Họ tên: $name")
        println("Ngày sinh: $birthDate")
        println("Địa chỉ: ${address.houseNumber}, ${address.streetName}, ${address.district}, ${address.city}")
    }
}
