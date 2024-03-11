
package OOP_JAVA;


public class AE_SachGiaoKhoa extends AE_DanhMuc{
    private String khoiLop;

    @Override
    public double thanhTien() {
       return (getSoLuong() * getGiaBan()) * 0.2;
    }

    public AE_SachGiaoKhoa() {
    }

    public AE_SachGiaoKhoa( String ma, String ten, String nhaSanXuat, int namXuatBan, int soTrang, int soLuong, double giaBan, String khoiLop) {
        super(ma, ten, nhaSanXuat, namXuatBan, soTrang, soLuong, giaBan);
        this.khoiLop = khoiLop;
    }

    public String getKhoiLop() {
        return khoiLop;
    }

    public void setKhoiLop(String khoiLop) {
        this.khoiLop = khoiLop;
    }

    @Override
    public String toString() {
        return "AE_SachGiaoKhoa{"+ super.toString() + ", " + khoiLop + '}';
    }
    
    
}
