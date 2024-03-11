
package OOP_JAVA;

public class AB_KinhTe extends AB_SinhVien{
    private double nlkt, maketing;

    public AB_KinhTe() {
    }

    public AB_KinhTe(double nlkt, double maketing, String maSv, String hoTen, boolean gioiTinh) {
        super(maSv, hoTen, gioiTinh);
        this.nlkt = nlkt;
        this.maketing = maketing;
    }

    

    public double getNlkt() {
        return nlkt;
    }

    public void setNlkt(double nlkt) {
        this.nlkt = nlkt;
    }

    public double getMaketing() {
        return maketing;
    }

    public void setMaketing(double maketing) {
        this.maketing = maketing;
    }

    @Override
    public String toString() {
        return "KinhTe{"+ super.toString() + ", nlkt=" + nlkt + ", maketing=" + maketing + ", diem trung binh= " + String.format("%.3f", getDiemTB()) + ", xep loai: " + getXepLoai() + '}';
    }
    
    public double getDiemTB(){
        return (nlkt*2 + maketing)/3;
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
