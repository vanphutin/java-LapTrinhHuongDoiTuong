
package DoAn;

import DoAn.*;


public class NguoiDangTuyen extends CongViec{
    private int soLuong;
    private long mucLuong;
    private MyDate ngayHetHan;

    @Override
    public String toString() {
        return "NguoiDangTuyen{"+super.toString() + ", " + soLuong + ", " + mucLuong + ", " + ngayHetHan + '}';
    }

    public NguoiDangTuyen() {
    }
    //moTa, viTri, diaDiem,email, phone, ten, soLuong, mucLuong, ngayHetHan

    public NguoiDangTuyen(String moTa, String viTri, String diaDiem, String email, String phone, String ten, int soLuong, long mucLuong, MyDate ngayHetHan) {
        super(moTa, viTri, diaDiem, email, phone, ten);
        this.soLuong = soLuong;
        this.mucLuong = mucLuong;
        this.ngayHetHan = ngayHetHan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public long getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(long mucLuong) {
        this.mucLuong = mucLuong;
    }

    public MyDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(MyDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    public static void main(String[] args) {
       MyDate date = new MyDate("22/10/2004"); // Use 'new' to create a new instance
       //, String viTri, String diaDiem, String email, String phone
       NguoiDangTuyen a = new NguoiDangTuyen("uv001","font-end", "hcm", "ewofjoe@", "012345", "fpt", 10, 15000000, date );
        System.out.println(a);
    }

}
