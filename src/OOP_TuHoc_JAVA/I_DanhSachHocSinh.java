
package OOP_TuHoc_JAVA;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class I_DanhSachHocSinh {
    public ArrayList<I_HocSinh> hs = new ArrayList<>();
    
    //doc file
    public void docFile(String tenFile){
        try {
            File f = new File(tenFile);
            if(f.exists()){
                System.out.println("doc File thanh cong");
                Scanner read = new Scanner(f);
                while(read.hasNext()){
                    String s[] = read.nextLine().split(", ");
                    String maSV = s[0];
                    String hoTen = s[1];    
                    String tenLop = s[2];
                    I_Date date = new I_Date(s[3]);
                    Boolean gioiTinh = Boolean.parseBoolean(s[4]);
                    double mon1 = Double.parseDouble(s[5]);
                    double mon2 = Double.parseDouble(s[6]);
                    double mon3 = Double.parseDouble(s[7]);
                    if(s[0].startsWith("KhoiA")){
                        hs.add(new I_KhoiA(maSV, hoTen, tenLop, date, gioiTinh, mon1, mon2, mon3));
                    }else {
                        hs.add(new I_KhoiB(maSV, hoTen, tenLop, date, gioiTinh, mon1, mon2, mon3));
                    }
                }
            }else{
                System.out.println("file khong ton tai");
            }
        } catch (Exception e) {
        }
    }
    // Đọc dữ liệu từ file text 
    public void xuat(){
        for(I_HocSinh x : hs){
            System.out.println(x);
        }
    }
    // Ghi thông tin học sinh ra file text
    public void ghiFile(String tenFileCanGhi) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tenFileCanGhi))) {
            // Ghi tiêu đề
            writer.write("Mã học sinh, Họ tên, Lớp, Ngày sinh, Giới tính, Điểm môn 1, Điểm môn 2, Điểm môn 3\n");
            
            // Ghi dữ liệu của từng học sinh
            for (I_HocSinh hocSinh : hs) {
                writer.write(hocSinh.toString() + "\n");
            }

            System.out.println("Ghi File thanh cong!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // them 1 hoc sinh
    public void themSinhVien() {
        System.out.println("");
        Scanner nhap = new Scanner(System.in);
        String maSV;
        // Vòng lặp để kiểm tra và yêu cầu người dùng nhập lại khi mã sinh viên đã tồn tại
        while (true) {
            System.out.println("nhap ma sinh vd : KhoiA003 or KhoiB003 ");
            maSV = nhap.nextLine();

            // Kiểm tra xem sinh viên đã tồn tại hay chưa
            boolean sinhVienDaTonTai = false;
            for (I_HocSinh x : hs) {
                if (x.getMaSV().equalsIgnoreCase(maSV)) {
                    System.out.println("sinh vien da ton tai!!");
                    sinhVienDaTonTai = true;
                    break;
                }
            }

            // Nếu sinh viên chưa tồn tại, thoát khỏi vòng lặp và tiếp tục thêm sinh viên mới
            if (!sinhVienDaTonTai) {
                break;
            }
        }

        // Nhập thông tin sinh viên mới
        System.out.println("nhap ho ten");
        String hoTen = nhap.nextLine();
        System.out.println("nhap ten lop hoc");
        String lop = nhap.nextLine();
        System.out.println("nhap ngay sinh");
        String ngaySinh = nhap.nextLine();
        System.out.println("nhap gioi tinh vd: true or false");
        boolean gioiTinh = nhap.nextBoolean();
        System.out.println("nhap diem mon 1");
        double mon1 = nhap.nextDouble();
        System.out.println("nhap diem mon 2");
        double mon2 = nhap.nextDouble();
        System.out.println("nhap diem mon 3");
        double mon3 = nhap.nextDouble();

        // Thêm sinh viên mới vào danh sách
        if (maSV.startsWith("KhoiA")) {
            hs.add(new I_KhoiA(maSV, hoTen, lop, new I_Date(ngaySinh), gioiTinh, mon1, mon2, mon3));
        } else {
            hs.add(new I_KhoiB(maSV, hoTen, lop, new I_Date(ngaySinh), gioiTinh, mon1, mon2, mon3));
        }
            System.out.println("them sinh vien thanh cong!");
            xuat();
    }

    //d. Đếm số học sinh được nhận học bổng (để được nhận học bổng thì học sinh phải có điểm trung bình > 8.5 và môn hệ số 2 > 9)
public int demSV_nhanHB() {
    int dem_khoiA = 0, dem_khoiB = 0;

    for (I_HocSinh x : hs) {
        if (x instanceof I_KhoiA) {
            if (x.getDiemTrungBinh() > 8.5 && ((I_KhoiA) x).getToan()> 9) {
                dem_khoiA++;
            }
        } else if (x instanceof I_KhoiB) {
            if (x.getDiemTrungBinh() > 8.5 && ((I_KhoiB) x).getToan() > 9) {
                dem_khoiB++;
            }
        }
    }

    int sum = dem_khoiA + dem_khoiB;
    System.out.println("So sinh vien nhan hoc bong la: " + sum);
    return sum;
}

    
    public void output(){
        xuat();
        themSinhVien();
        demSV_nhanHB();
    }
    public static void main(String[] args) {
        I_DanhSachHocSinh a = new I_DanhSachHocSinh();
        a.docFile("Danhsachhocsinh.txt");
        a.ghiFile("in_Danhsachhocsinh.txt");
        a.output();
    }
}
