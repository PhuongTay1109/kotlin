class NhanVienBanHang(
    val maNhanVien: String,
    val hoTen: String,
    var doanhThu: Double
) {
    fun hienThiThongTin() {
        println("Mã nhân viên: $maNhanVien")
        println("Họ tên: $hoTen")
        println("Doanh thu: $doanhThu")
    }
}

fun main() {
    val nhanVien1 = NhanVienBanHang("NV001", "Nguyên Văn Quân", 1000000.0)
    val nhanVien2 = NhanVienBanHang("NV002", "Lê Thị B", 2000000.0)

    nhanVien1.hienThiThongTin()
    println()
    nhanVien2.hienThiThongTin()
}
