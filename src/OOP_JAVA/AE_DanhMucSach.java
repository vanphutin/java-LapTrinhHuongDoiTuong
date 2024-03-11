
package OOP_JAVA;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AE_DanhMucSach {
    ArrayList<AE_DanhMuc> danhmuc = new ArrayList<>();
    
    //doc file
    public void docFile(String tenFile){
        try {
            File f = new File(tenFile);
            if(f.exists()){
                System.out.println("1. doc file thanh cong");
                Scanner read = new Scanner(f);
                while(read.hasNext()){
                    //String ma, String ten, String nhaSanXuat, int namXuatBan, int soTrang, int soLuong, double giaBan, the loai
                    String s[] = read.nextLine().split(", ");
                    String ma = s[0];
                    String ten = s[1];
                    String nhaSanXuat = s[2];
                    Integer namXuatBan = Integer.parseInt(s[3]);
                    Integer soTrang = Integer.parseInt(s[4]);
                    Integer soLuong = Integer.parseInt(s[5]);
                    Double giaBan = Double.parseDouble(s[6]);
                    String khoiLop = s[7];
                    String theLoai = s[7];
                    if(s[0].startsWith("SGK")){
                        danhmuc.add(new AE_SachGiaoKhoa(ma, ten, nhaSanXuat, namXuatBan, soTrang, soLuong, giaBan, khoiLop));
                    }
                    else if(s[0].startsWith("TT")){
                        danhmuc.add(new AE_TieuThuyet(ma, ten, nhaSanXuat, namXuatBan, soTrang, soLuong, giaBan, theLoai));
                    }
                }
            }else{
                System.out.println("file khong ton tai!!");
            }
        } catch (Exception e) {
        }
    }
    
    // xuat
    public void xuat(String nd){
        System.out.println(nd);
        for(AE_DanhMuc x : danhmuc){
            System.out.println(x);
        }
    }
    //them 1 danh muc
    public void themDanhMuc(){
        System.out.println("\n1. them 1 danh muc");
        for(AE_DanhMuc x : danhmuc){
            if(x instanceof AE_TieuThuyet){
                System.out.println(x);
            }
        }
    }
     
    //thong ke so luong sach [SGK && TT]
    public void thongKeSL_Sach(){
        System.out.println("\n2. thong ke so luong sach [SGK && TT]");
        int sum_SGK = 0, sum_TT = 0;
        for(AE_DanhMuc x : danhmuc){
            if(x instanceof AE_SachGiaoKhoa){
                sum_SGK += x.getSoLuong();
            }
            if(x instanceof AE_TieuThuyet){
                sum_TT += x.getSoLuong();
            }
        }
        System.out.println("so luong sach giao khoa: " + sum_SGK );
        System.out.println("so luong sach tieu thuyet: " + sum_TT );
    }
    
    // tim sach co gia ban lon nhat loai
    public void timSachGiaBan_lonNhat(){
        System.out.println("\n3. tim sach co gia ban lon nhat loai");
        double minGiaSach_SGK = Double.MIN_VALUE;
        double minGiaSach_TT = Double.MIN_VALUE;
        
        for(AE_DanhMuc x : danhmuc){
            if(x instanceof AE_SachGiaoKhoa){
                if(x.getGiaBan() > minGiaSach_SGK){
                    minGiaSach_SGK = x.getGiaBan();
                }
            }
            else if(x instanceof AE_TieuThuyet){
                    if(x.getGiaBan() > minGiaSach_TT){
                        minGiaSach_TT = x.getGiaBan();
                    }    
            }
        }
        System.out.println("SACH GIAO KHOA co gia ban lon nhat: " + minGiaSach_SGK);
        System.out.println("TIEU THUYET co gia ban lon nhat: " + minGiaSach_TT);
    }
    
    // tim sach co thanh tien lon nhat
    public void timSachThanhTien_lonNhat(){
        System.out.println("\n4. tim sach co thanh tien lon nhat");
        double maxThanhTien = Double.MIN_VALUE;
        String info = null;
        for(AE_DanhMuc x : danhmuc){
            if(x.thanhTien() > maxThanhTien){
                info = x.toString();
                maxThanhTien = x.thanhTien();
            }
        }
        System.out.println(info + " thanh tien:  " + maxThanhTien);
    }
    
    // tim sach co thanh tien nho nhat
    public void timSachThanhTien_nhoNhat(){
        System.out.println("\n4. tim sach co thanh tien nho nhat");
        double minThanhTien = Double.MAX_VALUE;
        String info = null;
        for(AE_DanhMuc x : danhmuc){
            if(x.thanhTien() < minThanhTien){
                info = x.toString();
                minThanhTien = x.thanhTien();
            }
        }
        System.out.println(info + " thanh tien:  " + minThanhTien);
    }
    
    //sap xep giam dan theo thanh tien
    public void sapXep_Giam(){
        int min ;
        // su dung thuat toan sap xep lua chon
        for(int i = 0 ; i <danhmuc.size(); i++){
            min = i;
            for(int j = i + 1; j < danhmuc.size(); j++){
                if(danhmuc.get(i).thanhTien() < danhmuc.get(j).thanhTien()){
                    Collections.swap(danhmuc, i, j);
                }
            }
        }
        xuat("\n5. sap xep giam dan theo thanh tien");
    }
    
    public void output(){
        xuat("\nin danh sach");
        themDanhMuc();
        thongKeSL_Sach();
        timSachGiaBan_lonNhat();
        timSachThanhTien_lonNhat();
//        timSachThanhTien_nhoNhat();
        sapXep_Giam();
    
    }
   
        
    public static void main(String[] args) {
        AE_DanhMucSach t = new AE_DanhMucSach();
        t.docFile("danhMucSach.txt");
        t.output();
    }
}
