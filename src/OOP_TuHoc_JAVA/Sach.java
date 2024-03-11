
package OOP_TuHoc_JAVA;

public class Sach {
    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    private TacGia tacGia;

    public Sach(String tenSach, double giaBan, int namXuatBan, TacGia tacGia) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    @Override
    public String toString() {
        return "Sach{" + "tenSach=" + tenSach + ", giaBan=" + giaBan + ", namXuatBan=" + namXuatBan + ", tacGia=" + tacGia + '}';
    }
    
    public void inTenSach(){
        System.out.println(this.tenSach);
    }
    public boolean kiemTraNam(int namXuatBan) {
        return this.namXuatBan == namXuatBan;
    }

    public double sauGiamGia(double x){
        return this.giaBan*(1-x/100);
    }
}
