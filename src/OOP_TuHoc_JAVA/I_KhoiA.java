
package OOP_TuHoc_JAVA;
public class I_KhoiA extends I_HocSinh{
    private  double Toan, Ly, Hoa;

    @Override
    public String toString() {
        return "I_KhoiA{"+super.toString() + ", Toan=" + Toan + ", Ly=" + Ly + ", Hoa=" + Hoa + '}';
    }


    @Override
    public double getDiemTrungBinh() {
        return (getToan()*2 + getLy() + getHoa()) /4;
    }
    public I_KhoiA() {
    }

    public I_KhoiA(String maSV, String hoTen, String tenLop, I_Date ngaySinh, Boolean gioiTinh, double Toan, double Ly, double Hoa) {
        super(maSV, hoTen, tenLop, ngaySinh, gioiTinh);
        this.Toan = Toan;
        this.Ly = Ly;
        this.Hoa = Hoa;
    }

    public double getToan() {
        return Toan;
    }

    public void setToan(double Toan) {
        this.Toan = Toan;
    }

    public double getLy() {
        return Ly;
    }

    public void setLy(double Ly) {
        this.Ly = Ly;
    }

    public double getHoa() {
        return Hoa;
    }

    public void setHoa(double Hoa) {
        this.Hoa = Hoa;
    }

    
   
}
