
package OOP_JAVA;

public class AB_SinhVien {
    private String maSv, hoTen;
    private boolean gioiTinh;

    public AB_SinhVien() {
    }

    public AB_SinhVien(String maSv, String hoTen, boolean gioiTinh) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return maSv + ", " + hoTen + ", " + gioiTinh;
    }
    public double getDiemTB() {
        // Implement the appropriate logic here or override in subclasses
        return 0.0;
    }
    
}
