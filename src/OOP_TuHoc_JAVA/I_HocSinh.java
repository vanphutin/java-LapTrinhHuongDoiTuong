
package OOP_TuHoc_JAVA;

public abstract class I_HocSinh{
    //HọcSinh có các thuộc tính {mã học sinh, họ tên, ngày sinh, giới tính, lớp}
    private String maSV, hoTen, tenLop;
    private I_Date ngaySinh;
    private Boolean gioiTinh;
    
    // thức trừu tượng getDiemTrungBinh
    public abstract double getDiemTrungBinh();


    @Override
    public String toString() {
        return maSV + ", " + hoTen + ", " + tenLop + ", " + ngaySinh + ", " + (gioiTinh ? "nam" : "nu");
    }

    public I_HocSinh() {
    }

    public I_HocSinh(String maSV, String hoTen, String tenLop, I_Date ngaySinh, Boolean gioiTinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tenLop = tenLop;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public I_Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(I_Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
}
