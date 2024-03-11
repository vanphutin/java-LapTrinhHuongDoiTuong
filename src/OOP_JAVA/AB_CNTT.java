
package OOP_JAVA;

public class AB_CNTT extends AB_SinhVien{
    private double html,css, java;

    public AB_CNTT() {
    }

    public AB_CNTT(double html, double css, double java, String maSv, String hoTen, boolean gioiTinh) {
        super(maSv, hoTen, gioiTinh);
        this.html = html;
        this.css = css;
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

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    @Override
    public String toString() {
        return "AB_CNTT{"+ super.toString() + ", html=" + html + ", css=" + css + ", java=" + java + ", diem trung binh= " + String.format("%.3f", getDiemTB()) + ", xep loai: " + getXepLoai() +'}';
    }
    public double getDiemTB(){
        return (java*2 + html + css)/4;
    }
    public String getXepLoai(){
        double dtb = getDiemTB();
        if(dtb < 3) return "yeu";
        if(dtb < 5) return "kem";
        if(dtb < 6.5) return "tb";
        if(dtb < 8) return "kha";
        if(dtb < 9) return "gioi";
        return "xuat sac";
    }
}
