package OOP_JAVA;

public class AD_HangDienMay extends AD_HangHoa {
    private String noiSanXuat;

    public AD_HangDienMay() {
    }

    public AD_HangDienMay(String maHang, AD_Date ngayNhap, double donGia, int soLuong, String noiSanXuat) {
        super(maHang, ngayNhap, donGia, soLuong);
        this.noiSanXuat = noiSanXuat;
    }

    public String getNoiSanXuat() {
        return noiSanXuat;
    }

    public void setNoiSanXuat(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }

    @Override
    public String toString() {
        return "AD_HangDienMay{"+super.toString() + ", " + noiSanXuat + '}';
    }

    @Override
    public double tinhThanhTien() {
        if ("NK".equals(noiSanXuat)) {
            return getSoLuong() * getDonGia() * 1.2; // Nếu là hàng nhập khẩu, áp dụng hệ số 1.2
        } else {
            return getSoLuong() * getDonGia(); // Hàng trong nước không có hệ số
        }
    }
    
}
