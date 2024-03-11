package OOP_JAVA;

public class AD_HangThuCong extends AD_HangHoa {
    private String nhaSanXuat;

    public AD_HangThuCong() {
    }

    public AD_HangThuCong(String maHang, AD_Date ngayNhap, double donGia, int soLuong,String nhaSanXuat) {
        super(maHang, ngayNhap, donGia, soLuong);
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "AD_HangThuCong{"+super.toString() + ", =" + nhaSanXuat + '}';
    }

    @Override
    public double tinhThanhTien() {
        return getSoLuong()*getDonGia();
    }
    
}
