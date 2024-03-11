
package OOP_JAVA;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class I_DanhSachSinhVien {
    ArrayList<I_SinhVien> sv = new ArrayList<>();
    
    public void docFile(String tenFile){
        try {
            File f = new File(tenFile);
            if(f.exists()){
                System.out.println("ok!");
                Scanner read = new Scanner(f);
                while(read.hasNext()){
                    String s[] = read.nextLine().split(", ");
                    String maSV = s[0];
                    String hoTen = s[1];
                    Boolean gioiTinh = Boolean.parseBoolean(s[2]);
                    double diem1 = Double.parseDouble(s[3]);
                    double diem2 = Double.parseDouble(s[4]);
                    if(s.length == 5){
                        sv.add(new I_KinhTe(diem1, diem2, maSV, hoTen, gioiTinh));
                    }else{
                        sv.add(new I_CNTT(diem1, diem2,Double.parseDouble(s[5]),maSV, hoTen, gioiTinh));
                    }
                }
            }else{
                System.out.println("khong ton tai file");
            }
        } catch (Exception e) {
        }
    }
      // in DSSV
    public void xuatDSSV(){
        System.out.println("----------------------------------------------------");
        System.out.println("1. in danh sach sinh vien");
        for(I_SinhVien x : sv){
            System.out.println(x);
        }
    }
    //dem sv CNTT
    public int demSV(String nganh){
        System.out.println("");
        int dem = 0;
        for(I_SinhVien x : sv){
            if(x.getClass().getSimpleName().equalsIgnoreCase(nganh)){
                dem++;
            }
        }
        System.out.println("sinh vien: " + nganh + " "+ dem);
        return dem;
    }

    // max diem trung binh
    public void maxDiemTB(){
        double dtb = 0;
        String SV = "";
        for(I_SinhVien x : sv){
            if(x.getDiemTB() > dtb){
                SV = x.toString();
                dtb = x.getDiemTB();
            }
        }
        System.out.println("diem trung binh lon nhat: "+ SV + " " + dtb );
    }
    
    // dem sinh vien gioi
    public void demSV_Gioi(){
        int dem = 0;
                String SV = "";
        for(I_SinhVien x : sv){
            if(x.getHocLuc().equalsIgnoreCase("gioi")){
                SV = x.toString();
                dem ++;
            }
        }
        
        System.out.println("so sinh vien gioi la: " + dem);
    }
    public void output(){
        xuatDSSV();
        demSV("I_KinhTe");
        demSV("I_CNTT");
        maxDiemTB();
        demSV_Gioi();
    }
    public static void main(String[] args) {
        I_DanhSachSinhVien a = new I_DanhSachSinhVien();
        a.docFile("cntt_kinhte.txt");
        
        a.output();
    }
}
