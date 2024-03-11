
package OOP_TuHoc_JAVA;

public class main_quanLiSach {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15,2,2022);
        Ngay ngay2 = new Ngay(15,2,2022);
        
        TacGia tacGia1 = new TacGia("Tin", ngay1);
        TacGia tacGia2 = new TacGia("Tin", ngay1);
        
        Sach sach1 = new Sach("java", 10000, 2022, tacGia1);
        Sach sach2 = new Sach("java", 10000, 2022, tacGia1);
        
        System.out.println(ngay1);
        System.out.println(tacGia1);
        System.out.println(sach1);
        System.out.println("-----------------------------------------------------------------");
        sach1.inTenSach();
        System.out.println("so sanh NXB  sach 1 va sach 2 : " + sach1.kiemTraNam(sach2.getNamXuatBan()));
        System.out.println("Sau khi giam 10%: " + sach1.sauGiamGia(10));
    }
}
