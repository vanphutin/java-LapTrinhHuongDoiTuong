package OOP_JAVA;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class AD_DanhSachHangHoa {

    ArrayList<AD_HangHoa> hh = new ArrayList<>();

    // Xuất danh sách hàng hóa
    public void docFile(String tenFile) {
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                System.out.println("doc thanh cong");
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    String s[] = read.nextLine().split(", ");
                    String maHang = s[0];
                    AD_Date ngayNhap = new AD_Date(s[1]);
                    Double donGia = Double.parseDouble(s[2]);
                    Integer soLuong = Integer.parseInt(s[3]);
                    String noiSanXuat = s[4];
                    String nhaSanXuat = s[4];

                    if ("TN".equals(noiSanXuat) || "NK".equals(noiSanXuat)) {
                        hh.add(new AD_HangDienMay(maHang, ngayNhap, donGia, soLuong, noiSanXuat));
                    } else {
                        hh.add(new AD_HangThuCong(maHang, ngayNhap, donGia, soLuong, nhaSanXuat));
                    }
                }
            } else {
                System.out.println("Lỗi: Tệp tin không tồn tại");
            }
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public void xuat(String nd) {
        System.out.println(nd);
        for (AD_HangHoa x : hh) {
            System.out.println(x);
        }
    }

    // Xuất danh sách hóa đơn theo loại
    public void inDSHD_theoLoai() {
        System.out.println("\n2. in danh sach hoa don theo loai");
        System.out.println("danh sach hoa don trong nuoc");
        for (AD_HangHoa x : hh) {
            if (x instanceof AD_HangDienMay) {
                if (((AD_HangDienMay) x).getNoiSanXuat().equals("TN")) {
                    System.out.println(x);
                }

            }
        }

        System.out.println("\ndanh sach hoa don nhap khau ");
        for (AD_HangHoa x : hh) {
            if (x instanceof AD_HangDienMay) {
                if (((AD_HangDienMay) x).getNoiSanXuat().equals("NK")) {
                    System.out.println(x);
                }

            }
        }

        System.out.println("\ndanh sach hoa don thu cong nghiep ");
        for (AD_HangHoa x : hh) {
            if (x instanceof AD_HangThuCong) {
                System.out.println(x);
            }
        }
    }

    // Tính tổng thành tiền theo loại
    public double tinhTongThanhTien_loai() {
        System.out.println("\n3. tinh tong tien theo tung loai");
        double sum_TN = 0, sum_NK = 0, sum_TCN = 0;
        for (AD_HangHoa x : hh) {
            if (x instanceof AD_HangDienMay) {
                if (((AD_HangDienMay) x).getNoiSanXuat().equals("TN")) {
                    sum_TN += x.tinhThanhTien();
                }

            }
        }
        for (AD_HangHoa x : hh) {
            if (x instanceof AD_HangDienMay) {
                if (((AD_HangDienMay) x).getNoiSanXuat().equals("NK")) {
                    sum_NK += x.tinhThanhTien();
                }

            }
        }
        for (AD_HangHoa x : hh) {
            if (x instanceof AD_HangThuCong) {
                sum_TCN += x.tinhThanhTien();
            }
        }
        System.out.println("tong tien hoa don trong nuoc (TN): " + sum_TN);
        System.out.println("tong tien hoa don nhap khau (NK): " + sum_NK);
        System.out.println("tong tien hoa don Thu cong nghiep (TCN): " + sum_TCN);
        return 0;
    }

    //xoa hoa don theo ma
    public void xoaHD_ma() {
        System.out.println("\n4. xoa hoa don theo ma ");  
        Scanner nhapMA = new Scanner(System.in);
        System.out.print("nhap MA_HANG can xoa: ");
        String ma = nhapMA.nextLine();
        for (int i = 0; i < hh.size(); i++) {
            AD_HangHoa x = hh.get(i);
            if (x.getMaHang().equals(ma)) {
                System.out.println("ma hang bi loai: " + x.toString());
                hh.remove(i);
                i--;
            }
        }
        xuat("\ndanh sach cac mat hang sau xoa");
    }
    
    //tim hoa don co tong thanh tien lon nhat
    public void HD_maxThanhTien(){
        System.out.println("\n5. tim hoa don co tong thanh tien lon nhat");
        double maxDtb = Double.MIN_VALUE;
        String thongTin = "";
        for(AD_HangHoa x : hh){
            if(x.tinhThanhTien() > maxDtb){
                thongTin = x.toString();
                maxDtb = x.tinhThanhTien();
            }
        }
        System.out.println(thongTin +" :" + maxDtb);
    }

    
    //tinh tong tien hoa don theo ngay
    public void tinhTienTheoNgay() {
        System.out.println("\n6. tinh tong tien hoa don theo ngay");
        int maxNgay = 31; 

        double[] tongTienTheoNgay = new double[maxNgay + 1];

        for (AD_HangHoa x : hh) {
            int ngay = x.getNgayNhap().getNgay();
            double thanhTien = x.tinhThanhTien();

            tongTienTheoNgay[ngay] += thanhTien;
        }

        for (int i = 1; i <= maxNgay; i++) {
            if (tongTienTheoNgay[i] > 0) {
                System.out.println("ngay " + i + ": " + tongTienTheoNgay[i]);
            }
        }
    }
    
    //tinh tong hoa don theo thang
    public void tinhTienTheoThang() {
        System.out.println("\n7. tinh tong tien hoa don theo thang");
        int maxThang = 12; 

        double[] tongTienTheoThang = new double[maxThang + 1];

        for (AD_HangHoa x : hh) {
            int thang = x.getNgayNhap().getThang();
            double thanhTien = x.tinhThanhTien();

            tongTienTheoThang[thang] += thanhTien;
        }

        for (int i = 1; i <= maxThang; i++) {
            if (tongTienTheoThang[i] > 0) {
                System.out.println("thang " + i + ": " + tongTienTheoThang[i]);
            }
        }
    }
    
    
    public static void main(String[] args) {
        AD_DanhSachHangHoa t = new AD_DanhSachHangHoa();
        t.docFile("QuanLiHangHoa.txt");
        t.xuat("Danh sach cac mat hang");
        t.inDSHD_theoLoai();
        t.tinhTongThanhTien_loai();
        t.xoaHD_ma();
        t.HD_maxThanhTien();
        t.tinhTienTheoNgay();
        t.tinhTienTheoThang();
    }
}