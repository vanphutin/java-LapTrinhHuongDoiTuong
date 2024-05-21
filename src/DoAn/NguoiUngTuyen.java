
package DoAn;

import DoAn.*;


public class NguoiUngTuyen extends CongViec{
    private boolean gioiTinh;
    private String kinhNghiem;

    @Override
    public String toString() {
        return "NguoiUngTuyen{"+super.toString() + ", " + gioiTinh + ", " + kinhNghiem+ '}';
    }

    public NguoiUngTuyen() {
    }

    public NguoiUngTuyen(String moTa,String viTri, String diaDiem, String email, String phone, String ten, boolean gioiTinh ,String kinhNghiem) {
        super(moTa, viTri, diaDiem, email, phone,ten);
        this.gioiTinh = gioiTinh;
        this.kinhNghiem = kinhNghiem;
    }



    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public String getKinhNghiem() {
        return kinhNghiem;
    }

    public void setKinhNghiem(String kinhNghiem) {
        this.kinhNghiem = kinhNghiem;
    }
}
