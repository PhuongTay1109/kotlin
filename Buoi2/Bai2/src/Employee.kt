
open class Employee(val id: Int, val name: String) {
    open fun getSalary(): Double {
        throw NotImplementedError("Phương thức này chưa được triển khai")
    }

    override fun toString(): String {
        return "Mã nhân viên: $id, Tên: $name"
    }
}
