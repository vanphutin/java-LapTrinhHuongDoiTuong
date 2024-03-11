
package OOP_JAVA;


public abstract class AA_SinhVien {
    private String ma, hoTen;
    private boolean gioiTinh;
    
    public abstract double getDiemTB();
    public String getXepLoai(){
        if(getDiemTB() < 3) return "yeu";
        if(getDiemTB() < 5) return "kem";
        if(getDiemTB() < 6.5) return "tb";
        if(getDiemTB() < 8) return "kha";
        if(getDiemTB() < 9) return "gioi";
        return "xuat sac";
    }

    @Override
    public String toString() {
        return ma + ", " + hoTen + ", " + gioiTinh + ", diem trung binh: " + getDiemTB() + ", xep loai: " + getXepLoai()  ;
    }

    public AA_SinhVien() {
    }

    public AA_SinhVien(String ma, String hoTen, boolean gioiTinh) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
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
    
}
