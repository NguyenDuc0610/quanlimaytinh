import java.util.ArrayList;
import java.util.List;

class PhongMay {
    private List<MayTinh> danhSachMayTinh;

    public PhongMay() {
        danhSachMayTinh = new ArrayList<>();
    }

    public void themMayTinh(MayTinh mayTinh) {
        danhSachMayTinh.add(mayTinh);
    }

    public void xoaMayTinh(MayTinh mayTinh) {
        danhSachMayTinh.remove(mayTinh);
    }

    public void hienThiDanhSachMayTinh() {
        for (MayTinh mayTinh : danhSachMayTinh) {
            mayTinh.thongTinMay();
            System.out.println("---------------------");
        }
    }
}
