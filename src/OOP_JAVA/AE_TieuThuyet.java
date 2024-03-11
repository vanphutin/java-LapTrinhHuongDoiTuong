
package OOP_JAVA;

public class AE_TieuThuyet extends AE_DanhMuc{
    private String theLoai;

    @Override
    public double thanhTien() {
        return (getGiaBan() * getSoLuong()) * 0.4 ;
    }

    public AE_TieuThuyet() {
    }

    public AE_TieuThuyet(String ma, String ten, String nhaSanXuat, int namXuatBan, int soTrang, int soLuong, double giaBan, String theLoai) {
        super(ma, ten, nhaSanXuat, namXuatBan, soTrang, soLuong, giaBan);
        this.theLoai = theLoai;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    @Override
    public String toString() {
        return "AE_TieuThuyet{"+super.toString() + ", " + theLoai + '}';
    }

    
    
     
}
