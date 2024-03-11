
package OOP_JAVA;

public class I_KinhTe extends I_SinhVien{
    private double mkt,nlkt;
    @Override
    public double getDiemTB() {
        return (mkt*2 + nlkt)/3;
    }

    @Override
    public String toString() {
        return "I_KinhTe{"+ super.toString() + ", " + mkt + ", " + nlkt  + "}";
    }

    public I_KinhTe() {
    }

    public I_KinhTe(double mkt, double nlkt, String ma, String hoTen, boolean gioiTinh) {
        super(ma, hoTen, gioiTinh);
        this.mkt = mkt;
        this.nlkt = nlkt;
    }

    public double getMkt() {
        return mkt;
    }

    public void setMkt(double mkt) {
        this.mkt = mkt;
    }

    public double getNlkt() {
        return nlkt;
    }

    public void setNlkt(double nlkt) {
        this.nlkt = nlkt;
    }
    
}
