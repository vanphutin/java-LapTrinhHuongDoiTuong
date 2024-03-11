package OOP_JAVA;

public abstract class AD_HangHoa {
    private String maHang;
    private AD_Date ngayNhap;
    private double donGia;
    private int soLuong;
    
    public abstract double tinhThanhTien();

    @Override
    public String toString() {
        return maHang + ", " + ngayNhap + ", " + donGia + ", " + soLuong;
    }

    
    public AD_HangHoa() {
    }

    public AD_HangHoa(String maHang, AD_Date ngayNhap, double donGia, int soLuong) {
        this.maHang = maHang;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public AD_Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(AD_Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    

}
