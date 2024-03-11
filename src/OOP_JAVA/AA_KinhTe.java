
package OOP_JAVA;


public class AA_KinhTe extends AA_SinhVien{
    private double nlkt, marketing;

    @Override
    public double getDiemTB() {
        return (marketing + nlkt*2)/3;
    }

    @Override
    public String toString() {
        return "AA_KinhTe{" + super.toString() + ", nlkt=" + nlkt + ", marketing=" + marketing + '}';
    }

    public AA_KinhTe(double nlkt, double marketing, String ma, String hoTen, boolean gioiTinh) {
        super(ma, hoTen, gioiTinh);
        this.nlkt = nlkt;
        this.marketing = marketing;
    }

    public double getNlkt() {
        return nlkt;
    }

    public void setNlkt(double nlkt) {
        this.nlkt = nlkt;
    }

    public double getMarketing() {
        return marketing;
    }

    public void setMarketing(double marketing) {
        this.marketing = marketing;
    }

    public static void main(String[] args) {
        AA_KinhTe a = new AA_KinhTe(5,3,"sv001", "chi pheo",false );
        System.out.println(a);
    }
}
