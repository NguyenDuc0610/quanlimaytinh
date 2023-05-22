import java.util.ArrayList;
import java.util.List;

class MayTinh {
    private String tenMay;
    private String hangSanXuat;
    private String loaiMay;
    private int ram;
    private int dungLuongOCung;
    private double tocDoCPU;

    public MayTinh(String tenMay, String hangSanXuat, String loaiMay, int ram, int dungLuongOCung, double tocDoCPU) {
        this.tenMay = tenMay;
        this.hangSanXuat = hangSanXuat;
        this.loaiMay = loaiMay;
        this.ram = ram;
        this.dungLuongOCung = dungLuongOCung;
        this.tocDoCPU = tocDoCPU;
    }

    public String getTenMay() {
        return tenMay;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public String getLoaiMay() {
        return loaiMay;
    }

    public int getRam() {
        return ram;
    }

    public int getDungLuongOCung() {
        return dungLuongOCung;
    }

    public double getTocDoCPU() {
        return tocDoCPU;
    }

    public void thongTinMay() {
        System.out.println("Tên máy: " + tenMay);
        System.out.println("Hãng sản xuất: " + hangSanXuat);
        System.out.println("Loại máy: " + loaiMay);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Dung lượng ổ cứng: " + dungLuongOCung + "GB");
        System.out.println("Tốc độ CPU: " + tocDoCPU + "GHz");
    }
}
