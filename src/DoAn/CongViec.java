
package DoAn;

import DoAn.*;
import java.util.Date;

public class CongViec {
    private String moTa,viTri,diaDiem,ten,email,phone; 
    

    @Override
    public String toString() {
        return moTa + ", " + viTri + ", " + diaDiem + ", " + email + ", " + phone + ", " + ten;
    }

    public CongViec() {
    }
                       //String moTa, String viTri, String diaDiem, String email, String phone, String tenNguoi, boolean gioiTinh
    public CongViec(String moTa, String viTri, String diaDiem, String email, String phone, String ten) {
        this.moTa = moTa;
        this.viTri = viTri;
        this.diaDiem = diaDiem;
        this.email = email;
        this.phone = phone;
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
 
    
}
