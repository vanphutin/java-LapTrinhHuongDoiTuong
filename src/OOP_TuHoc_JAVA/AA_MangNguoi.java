
package OOP_TuHoc_JAVA;

import java.io.File;
import java.util.*;

public class AA_MangNguoi {
    ArrayList<AA_Nguoi> ds =new  ArrayList<>();
    
    //doc file
    public void docFile(String tenFile){
        System.out.println("1. Doc File");
        try {
            File f = new File(tenFile);
            if(f.exists()){
                System.out.println("doc thanh cong");
                Scanner read = new Scanner(f);
                while(read.hasNext()){
                    String s[] = read.nextLine().split(", ");
                    String ma = s[0];
                    String hoTen = s[1];
                    boolean gioiTinh = Boolean.parseBoolean(s[3]);
                    String ngaySinh = s[2];
                    
                    if(s[0].startsWith("SV")){
                        double mon1 = Double.parseDouble(s[4]);
                        double mon2 = Double.parseDouble(s[5]);
                        double mon3 = Double.parseDouble(s[6]);
                        ds.add(new AA_SinhVien(mon1, mon2, mon3, ma, hoTen, ngaySinh, gioiTinh));
                    }else 
                    if(s[0].startsWith("GV")){
                        String monDay = s[4];
                        double soGio = Double.parseDouble(s[5]);
                        double donGia = Double.parseDouble(s[6]);
                        ds.add(new AA_GiangVien(monDay, soGio, donGia, ma, hoTen, ngaySinh, gioiTinh));
                    }
                }
            }else{
                System.out.println("file khong ton tai");
            }
            
        } catch (Exception e) {
        }
    }
    
    //xuat DS
    public void xuat(){
        System.out.println("\n2. xuat danh sach file");
        for(AA_Nguoi x : ds){
            System.out.println(x);
        }
    }
    
    //xuat sv
    public void xuat_dsSV(){
        System.out.println("\n3. xuat danh sach sinh vien ");
        for(AA_Nguoi x : ds){
            if(x instanceof AA_SinhVien){
                System.out.println(x);
            }
        }
    }
    
    //xuat gv
    public void xuat_dsGV(){
        System.out.println("\n3. xuat danh sach giang vien ");
        for(AA_Nguoi x : ds){
            if(x instanceof AA_GiangVien){
                System.out.println(x);
            }
        }
    }
    
    //tim sv dtb max
    public void timSV_dtbMax(){
        System.out.println("\n4. tim sinh vien co diem trung binh lon nhat ");
        String hoTen = "";
        double dtb = -1;
        for(AA_Nguoi x : ds){
            if(x instanceof AA_SinhVien ){
                if(((AA_SinhVien) x).getDTB() > dtb){
                    dtb = ((AA_SinhVien) x).getDTB();
                    hoTen = x.getHoTen();
                }
            }
        }
        System.out.println(hoTen + " : " + dtb);
    }
    
    //dtb chung
    public double tinh_DTBC(){
        
        double dtb = 0, sum = 0;
        int cnt = 0;
        for(AA_Nguoi x : ds){
            if(x instanceof AA_SinhVien){
                dtb+= ((AA_SinhVien) x).getDTB();
                cnt++;
            }
        }
        sum = dtb/cnt;
        return sum;
    }
    
    // DTBC gioi tinh
    public void DTB_gioiTinh(boolean gioiTinh){
        System.out.println("\n5. diem trung binh gioi tinh: " + (gioiTinh ? "nam": "nu"));
        double dtb = 0, sum = 0;
        int cnt = 0;
        for(AA_Nguoi x : ds){
            if(x instanceof AA_SinhVien){
                if(x.isGioiTinh() == gioiTinh){
                    dtb += ((AA_SinhVien) x).getDTB();
                    cnt ++;
                }
            }
        }
        sum = dtb/cnt;
        System.out.println(sum);
    } 
    
    
    //loai sinh vien dyb < dtbc
    public void loaiSV(){
        System.out.println("\n6. loai sinh vien DTB < DTBC");
        double dtbChung = tinh_DTBC();
        for (int i = 0; i < ds.size(); i++){
             AA_Nguoi x = ds.get(i);
            if(x instanceof AA_SinhVien){
                if(((AA_SinhVien) x).getDTB() < dtbChung){
                    System.out.println("sinh vien bi loai: " + x.getHoTen() +" _ diem trung binh: "+ ((AA_SinhVien) x).getDTB() + " _ diem trung binh chung:" + dtbChung);
                    ds.remove(i);
                    i--;
                }
            }
        }
         
         
         System.out.println("danh sach sinh vien con lai");
         for(AA_Nguoi x : ds){
             if(x instanceof AA_SinhVien){
                System.out.println(x);
             }
         }
    }
    
    // gv tien day min
    public void timGV_minTien(){
        System.out.println("\n7.Giang vien co tien day thap nhat");
        double tienDay = Double.MAX_VALUE;
        String hoTen = "";
        for(AA_Nguoi x : ds){
            if(x instanceof AA_GiangVien){
                if(((AA_GiangVien) x).soTienDay() < tienDay){
                    tienDay = ((AA_GiangVien) x).soTienDay();
                    hoTen = x.getHoTen();
                }
            }
        }
        System.out.println(hoTen +" "+ tienDay);
    }
    
    //total day gv
    public void tongTienDay_GV(){
        System.out.println("\n8. tong tien day giao vien");
        double sum = 0;
        for(AA_Nguoi x : ds){
            if(x instanceof AA_GiangVien){
               sum += ((AA_GiangVien) x).soTienDay();
            }
        }
        System.out.println(sum);
    }
    
    // outnput
    public void output(){
        xuat();
        xuat_dsSV();
        xuat_dsGV();
        timSV_dtbMax();
        DTB_gioiTinh(true);
        DTB_gioiTinh(false);
        loaiSV();
        timGV_minTien();
        tongTienDay_GV();
    }
    public static void main(String[] args) {
        AA_MangNguoi a = new AA_MangNguoi();
        a.docFile("GV_SV.txt");
        a.output();
    }
}
