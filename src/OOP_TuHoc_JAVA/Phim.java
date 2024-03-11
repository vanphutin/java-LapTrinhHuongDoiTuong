
package OOP_TuHoc_JAVA;

import java.util.Scanner;

public class Phim {
    private String tenPhim;
    private int namSanXuat;
    private HangSanXuat hangSanXuat;
    private double giaVe;
    private Ngay ngay;

    public Phim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, Ngay ngay) {
        this.tenPhim = tenPhim;
        this.namSanXuat = namSanXuat;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        this.ngay = ngay;
    }
    

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public Ngay getNgay() {
        return ngay;
    }

    public void setNgay(Ngay ngay) {
        this.ngay = ngay;
    }

    

    public boolean kiemTraGiaVe(double giaVe){
        return this.giaVe < giaVe;
    }
//    public String HangSanXuat(String hangSanXuat){
//        return this.hangSanXuat.getTenHangSanXuat();
//    }

    public double giaSauGiam(double x){
        return this.giaVe*(1-x/100);
    }

    @Override
    public String toString() {
        return "Phim{" + "tenPhim=" + tenPhim + ", namSanXuat=" + namSanXuat + ", hangSanXuat=" + hangSanXuat + ", giaVe=" + giaVe + ", ngay=" + this.ngay + '}';
    }
    
    
    
}
