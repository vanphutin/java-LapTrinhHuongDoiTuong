
package OOP_TuHoc_JAVA;


public class AA_GiangVien extends AA_Nguoi{
    private String monDay;
    private double soGio,donGia;

    public AA_GiangVien() {
    }

    public AA_GiangVien(String monDay, double soGio, double donGia, String ma, String hoTen, String ngaySinh, boolean gioiTinh) {
        super(ma, hoTen, ngaySinh, gioiTinh);
        this.monDay = monDay;
        this.soGio = soGio;
        this.donGia = donGia;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public double getSoGio() {
        return soGio;
    }

    public void setSoGio(double soGio) {
        this.soGio = soGio;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double soTienDay(){
        return (soGio*donGia);
    }
    @Override
    public String toString() {
        return "AA_GiangVien{"+ super.toString() + ", monDay=" + monDay + ", soGio=" + soGio + ", donGia=" + donGia +", so tien day=" + soTienDay() + '}';
    }
    
    
}
