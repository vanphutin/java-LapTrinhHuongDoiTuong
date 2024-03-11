
package OOP_TuHoc_JAVA;

import java.util.Scanner;

public class main_quanLiPhim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ngay ngay1;
         //CLASS Phim

        System.out.println("Nhập tên phim: ");
        String tenPhim = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int namSanXuat = scanner.nextInt();
        System.out.println("Nhập giá vé: ");
        double giaVe = scanner.nextDouble();

        // Nhập thông tin cho đối tượng HangSanXuat
        System.out.println("Nhập tên hãng sản xuất: ");
        String tenHangSanXuat = scanner.nextLine();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập số double
        System.out.println("Nhập quốc gia: ");
        String quocGia = scanner.nextLine();

        HangSanXuat hangSanXuat1 = new HangSanXuat(tenHangSanXuat, quocGia);

        // Nhập thông tin cho đối tượng Ngay
        System.out.println("Nhập ngày: ");
        int ngay = scanner.nextInt();
        scanner.nextLine(); // Đọc và loại bỏ dòng trống
        System.out.println("Nhập tháng: ");
        int thang = scanner.nextInt();
        scanner.nextLine(); // Đọc và loại bỏ dòng trống
        System.out.println("Nhập năm: ");
        int nam = scanner.nextInt();
        scanner.nextLine(); // Đọc và loại bỏ dòng trống
        ngay1 = new Ngay(ngay, thang, nam); // Khởi tạo ngay1 sau khi nhập dữ liệu
        Phim phim1 = new Phim(tenPhim, namSanXuat, hangSanXuat1, giaVe, ngay1);

        //phim so 1
//        Ngay ngay1 = new Ngay(12,2,2002);
//        HangSanXuat hangSanXuat1 = new HangSanXuat("MTP Entertaiment", "Viet Nam");
//        Phim phim1 = new Phim("CHANG TRAI NAM AY", 2023, hangSanXuat1 , 100000, ngay1);
//        //phim so 2
//        Ngay ngay2 = new Ngay(22,4,2023);
//        HangSanXuat hangSanXuat2 = new HangSanXuat("TRAN THANH", "Viet Nam");
//        Phim phim2 = new Phim("DAT RUNG PHUONG NAM", 2023, hangSanXuat2 , 10000, ngay1);
//        
        //phuong thuc
        System.out.println(phim1);
        System.out.println("kiem tra ve phim 1 co lon hon phim 2: " + phim1.kiemTraGiaVe(phim1.getGiaVe()));
        System.out.println("ten phim : "+ phim1.getTenPhim() +" \nhang San Xuat : " +phim1.getHangSanXuat().getTenHangSanXuat());
        System.out.println("gia ve phim 1 ban dau: " + phim1.getGiaVe() +"VND" +"\n" +"gia ve phim 1 sau khi khuyen mai: " + phim1.giaSauGiam(20) +"vnd");
    }
}
