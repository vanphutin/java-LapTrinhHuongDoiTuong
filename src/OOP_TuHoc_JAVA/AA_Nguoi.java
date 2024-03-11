
package OOP_TuHoc_JAVA;
 
public class AA_Nguoi {
    private String ma,hoTen,ngaySinh;
    private boolean gioiTinh;

    public AA_Nguoi() {
    }

    public AA_Nguoi(String ma, String hoTen, String ngaySinh, boolean gioiTinh) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
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

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "ma=" + ma + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + (gioiTinh ? "nam" : "nu");
    }

    
    
    
}
