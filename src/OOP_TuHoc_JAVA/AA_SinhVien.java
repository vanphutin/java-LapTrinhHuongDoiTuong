
package OOP_TuHoc_JAVA;

public class AA_SinhVien extends AA_Nguoi{
    private double mon1, mon2, mon3;

    public AA_SinhVien() {
    }

    public AA_SinhVien(double mon1, double mon2, double mon3, String ma, String hoTen, String ngaySinh, boolean gioiTinh) {
        super(ma, hoTen, ngaySinh, gioiTinh);
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    public double getMon1() {
        return mon1;
    }

    public void setMon1(double mon1) {
        this.mon1 = mon1;
    }

    public double getMon2() {
        return mon2;
    }

    public void setMon2(double mon2) {
        this.mon2 = mon2;
    }

    public double getMon3() {
        return mon3;
    }

    public void setMon3(double mon3) {
        this.mon3 = mon3;
    }

    public double getDTB(){
        return (mon1*2 + mon2 + mon3)/4;
    }
    @Override
    public String toString() {
        return "AA_SinhVien{"+ super.toString() + ", mon1=" + mon1 + ", mon2=" + mon2 + ", mon3=" + mon3 +", diem trung binh=" + getDTB() + '}';
    }
    
    
}
