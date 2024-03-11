
package OOP_JAVA;

public abstract class AE_DanhMuc {
    private String ma, ten,nhaSanXuat;
    private int namXuatBan, soTrang,soLuong;
    private double giaBan;
    public abstract double thanhTien();

    @Override
    public String toString() {
        return ma + ", " + ten + ", " + nhaSanXuat + ", " + namXuatBan + ", " + soTrang + ", " + soLuong + ", " + giaBan;
    }
    public AE_DanhMuc() {
    }

    public AE_DanhMuc(String ma, String ten, String nhaSanXuat, int namXuatBan, int soTrang, int soLuong, double giaBan) {
        this.ma = ma;
        this.ten = ten;
        this.nhaSanXuat = nhaSanXuat;
        this.namXuatBan = namXuatBan;
        this.soTrang = soTrang;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    
    
}
