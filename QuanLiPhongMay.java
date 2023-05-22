public class QuanLyPhongMay {
    public static void main(String[] args) {
        PhongMay phongMay = new PhongMay();

        // Tạo và thêm máy tính vào phòng máy
        MayTinh mayTinh1 = new MayTinh("PC01", "Dell", "Desktop", 8, 500, 3.2);
        phongMay.themMayTinh(mayTinh1);

        MayTinh mayTinh2 = new MayTinh("PC02", "HP", "Desktop", 16, 1000, 3.6);
        phongMay.themMayTinh(mayTinh2);

        MayTinh mayTinh3 = new MayTinh("Laptop01", "Lenovo", "Laptop", 12, 500, 2.8);
        phongMay.themMayTinh(mayTinh3);

        // Hiển thị danh sách máy tính trong phòng máy
        phongMay.hienThiDanhSachMayTinh();
    }
}
