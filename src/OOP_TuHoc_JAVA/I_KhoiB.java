
package OOP_TuHoc_JAVA;
public class I_KhoiB extends I_HocSinh{
    
    private double Toan, Sinh, Hoa;

    @Override
    public String toString() {
        return "I_KhoiB{"+super.toString() + ", Toan=" + Toan + ", Sinh=" + Sinh + ", Hoa=" + Hoa + '}';
    }


    @Override
    public double getDiemTrungBinh() {
        return (getToan()*2 + getSinh() + getHoa()) /4;
    }

    public I_KhoiB() {
    }

    public I_KhoiB( String maSV, String hoTen, String tenLop, I_Date ngaySinh, Boolean gioiTinh, double Toan, double Sinh, double Hoa) {
        super(maSV, hoTen, tenLop, ngaySinh, gioiTinh);
        this.Toan = Toan;
        this.Sinh = Sinh;
        this.Hoa = Hoa;
    }

    public double getToan() {
        return Toan;
    }

    public void setToan(double Toan) {
        this.Toan = Toan;
    }

    public double getSinh() {
        return Sinh;
    }

    public void setSinh(double Sinh) {
        this.Sinh = Sinh;
    }

    public double getHoa() {
        return Hoa;
    }

    public void setHoa(double Hoa) {
        this.Hoa = Hoa;
    }
    
}
