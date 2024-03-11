
package OOP_JAVA;

public class AC_SinhVienCNTT {
    private String maSV, hoTen;
    private boolean gioiTinh;
    private double java,html,css;

    public AC_SinhVienCNTT(String maSV, String hoTen, boolean gioiTinh, double java, double html, double css) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.java = java;
        this.html = html;
        this.css = css;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
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

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }

    @Override
    public String toString() {
        return maSV + ", " + hoTen + ", " + (gioiTinh ?" nam":"nu") + ", " + java + ", " + html + ", " + css;
    }
    public double getDiemTrungBinh(){
        return (java*2 + html + css)/4;
    }
    public String getXepLoai(){
        double dtb = getDiemTrungBinh();
        if (dtb < 3.5) return "kem";
        else if (dtb >= 3.5 && dtb < 5) return "Yeu";
        else if (dtb >= 5 && dtb < 6.5) return "Trung binh";
        else if (dtb >= 6.5 && dtb < 8) return "Kha";
        else if (dtb >= 8 && dtb < 9) return "Gioi";
        else return "Xuat sac";
    
    }
    
}
