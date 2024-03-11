
package OOP_TuHoc_JAVA;

public class Ngay_1 {
    private int ngay;
    private int thang;
    private int nam;

    public Ngay_1(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    @Override
    public String toString() {
        return "Ngay{" + "ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + '}';
    }
    
    
    
}
