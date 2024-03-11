
package OOP_JAVA;

import java.io.File;
import java.util.*;

public class AC_mainSinhVienCNTT {
    ArrayList<AC_SinhVienCNTT> sinhVienCNTT = new ArrayList<>();
    Scanner nhap = new Scanner(System.in);
    int n;
    
    //doc file
    public void docFile(String file){
        try {
            File f = new File(file);
            if(f.exists()){
                Scanner read = new Scanner(f);
                while(read.hasNext()){
                    String line = read.nextLine();
                    String s[] = line.split(",");
                    String maSv = s[0];
                    String hoTen = s[1];
                    boolean gioiTinh = s[2].trim().equalsIgnoreCase("true");
                    double java = Double.parseDouble(s[3]);
                    double html = Double.parseDouble(s[4]);
                    double css = Double.parseDouble(s[5]);
                    AC_SinhVienCNTT  svcntt = new AC_SinhVienCNTT(maSv, hoTen, gioiTinh, java, html, css); 
                    sinhVienCNTT.add(svcntt);
                }
            }else{
                System.out.println("khong ton tai file !");
            }
        } catch (Exception e) {
        }
    }
    
    //
    public void lietKeSinhVien(String noiDungXuat){
        for(AC_SinhVienCNTT sv : sinhVienCNTT){
            System.out.println(sv);
            System.out.println("");
        }
    }
    public double tinhDiemTBC(){
        double dtb = 0;
        int cnt = 0;
        for(AC_SinhVienCNTT sv : sinhVienCNTT){
            dtb += sv.getDiemTrungBinh();
            cnt++;
        }
        return dtb/cnt;
    }
    public double DTBgioiTinh(boolean gioiTinh){
        double dtb=0;
        int cnt = 0;
        for(AC_SinhVienCNTT sv : sinhVienCNTT){
            if(sv.isGioiTinh() == gioiTinh){
                dtb += sv.getDiemTrungBinh();
                cnt ++;
            }
        }
        if(cnt == 0) return 0;
        return dtb/cnt;
    }
    public void loaiSinhVien(double loai){
        int i = 0;
        while(i < sinhVienCNTT.size()){
            if(sinhVienCNTT.get(i).getDiemTrungBinh() < loai){
                sinhVienCNTT.remove(i);
            }else{
                i++;
            }
        }
        lietKeSinhVien("DSSV co diem >= "+ loai);
    }
    public void xapXepGiam(){
        for(int i = 0;i<sinhVienCNTT.size(); i++){
            for(int j = i +1; j <sinhVienCNTT.size();j++){
                if(sinhVienCNTT.get(i).getDiemTrungBinh() < sinhVienCNTT.get(j).getDiemTrungBinh()){
                    AC_SinhVienCNTT t = sinhVienCNTT.get(i);
                    sinhVienCNTT.set(i, sinhVienCNTT.get(j));
                    sinhVienCNTT.set(j, t);
                }
            }
        }
        lietKeSinhVien("DSSV giam dan theo diem");
    }
    
    public void xacDinhViThu(){
        for(int i = 0 ; i< sinhVienCNTT.size();i++){
            int dem = 0;
            for(int j = 0 ; j < sinhVienCNTT.size();j++){
                if(sinhVienCNTT.get(j).getDiemTrungBinh()>sinhVienCNTT.get(i).getDiemTrungBinh()){
                dem++;
                }
            }
            System.out.println(sinhVienCNTT.get(i ) + " vi thu " + ( dem+1));
        }
    }
    public void output(){
        lietKeSinhVien("danh sach sinh vien");
        System.out.println("diem trung binh chung : " + tinhDiemTBC());
        System.out.println("diem trung binh theo gioi tinh nam : " + DTBgioiTinh(true));
        System.out.println("diem trung binh theo gioi tinh nu : " + DTBgioiTinh(false));
//        loaiSinhVien(tinhDiemTBC());
        xapXepGiam();
        xacDinhViThu();
    }
    public static void main(String[] args) {
        AC_mainSinhVienCNTT value = new AC_mainSinhVienCNTT();
        value.docFile("cntt.txt");
        value.output();
//        value.lietKeSinhVien();
//        value.tinhDiemTBC();
    }
    
}
