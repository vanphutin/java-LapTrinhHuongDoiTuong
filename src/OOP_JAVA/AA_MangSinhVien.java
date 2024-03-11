package OOP_JAVA;

import java.io.File;
import java.util.*;

public class AA_MangSinhVien {

    ArrayList<AA_SinhVien> sv = new ArrayList<>();

    public void docFile(String tenFile) {
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                System.out.println("ok!");
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    String s[] = read.nextLine().split(", ");
                    String maSV = s[0];
                    String hoTen = s[1];
                    Boolean gioiTinh = Boolean.parseBoolean(s[2]);
                    double diem1 = Double.parseDouble(s[3]);
                    double diem2 = Double.parseDouble(s[4]);
                    if (s.length == 5) {
                        sv.add(new AA_KinhTe(diem1, diem2, maSV, hoTen, gioiTinh));
                    } else {
                        sv.add(new AA_CNTT(diem1, diem2, Double.parseDouble(s[5]), maSV, hoTen, gioiTinh));
                    }
                }
            } else {
                System.out.println("khong ton tai file");
            }
        } catch (Exception e) {
        }
    }

    public void xuat(String nd){
        System.out.println(nd);
    }
    public void lietKe() {
        
        for (AA_SinhVien x : sv) {
            System.out.println(x);
        }
    }

    public void demSinhVienGioi() {
        xuat("bai 2");
        int dem = 0;
        for (AA_SinhVien x : sv) {
            if (x.getXepLoai().equals("gioi")) {
                dem++;
            }
        }
        System.out.println("so sinh vien gioi: " + dem);
    }

    public void tinhDiemTBC_CNTT() {
       xuat("bai 3");
        int dem = 0;
        double dtb = 0, sum = 0;
        for (AA_SinhVien x : sv) {
            dtb += x.getDiemTB();
            dem++;
        }
        sum = dtb / dem;
        System.out.println("diem trung binh chung CNTT: " + sum);
    }

    public void loaiSinhVienKem() {
        xuat("bai 4");
        int i = 0;
        while (i < sv.size()) {
            if (sv.get(i).getXepLoai().equals("kem")) {
                sv.remove(i);
            } else {
                i++;
            }
        }
        lietKe();
    }

    public void sapXepTangDan_theoDiem() {
        xuat("bai 5");
        for (int i = 0; i < sv.size(); i++) {
            for (int j = i + 1; j < sv.size(); j++) {
                if (sv.get(i).getDiemTB() > sv.get(j).getDiemTB()) {
                    AA_SinhVien t = sv.get(i);
                    sv.set(i, sv.get(j));
                    sv.set(j, t);
                }
            }
        }
        lietKe();
    }

    public void tinhDiemTBC() {
        xuat("bai 6");
        int dem = 0;
        double dtb = 0, sum = 0;
        for (AA_SinhVien x : sv) {
            dtb += x.getDiemTB();
            dem++;
        }
        sum = dtb / dem;
        System.out.println("diem trung binh chung la: " + sum);
    }

    public void xacDinhViThu() {
        xuat("bai 7");
        for (int i = 0; i < sv.size(); i++) {
            int viThu = 1;
            for (int j = 0; j < sv.size(); j++) {
                if (sv.get(i).getDiemTB() < sv.get(j).getDiemTB()) {
                    viThu++;
                }
            }
            System.out.println(sv.get(i));
            System.out.println("Vi tri thu cua sinh vien " + sv.get(i).getHoTen() + " la: " + viThu);
        }

    }

    public void in_DSSV_KT() {
        xuat("bai 8");
        System.out.println("--------kt----------");
        ArrayList<AA_SinhVien> kt = new ArrayList<>();

        for (AA_SinhVien x : sv) {
            if(x instanceof AA_KinhTe){
                kt.add(x);
            }
            else{
                System.out.println("khong ton tai kt");
            }
        }
        for (AA_SinhVien x : kt) {
            System.out.println(x);
        }
        System.out.println("ok");
    }
    
    public void in_DSSV_CNTT() {
        xuat("bai 9");
        System.out.println("--------cntt----------");
        ArrayList<AA_SinhVien> cntt = new ArrayList<>();

        for (AA_SinhVien x : sv) {
            if(x instanceof AA_CNTT){
                cntt.add(x);
            }else{
            System.out.println("khong ton tai cntt");
        }
        }
        for (AA_SinhVien x : cntt) {
            System.out.println(x);
        }
        System.out.println("ok");
    }
    //sa dinh vi thu theo nghanh
    public void xacDinhVithu_theoNganh(){
        xuat("bai 10");
        System.out.println("---------------------------------");
        int viThu = 1, i = 0;
        for(AA_SinhVien x : sv){
            if(x instanceof AA_CNTT){
                System.out.println("------------cntt");
                for (i = 0; i < sv.size(); i++) {
                
                for (int j = 0; j < sv.size(); j++) {
                    if (sv.get(i).getDiemTB() < sv.get(j).getDiemTB()) {
                        viThu++;
                    }
                }
                }
            }
            if(x instanceof AA_KinhTe){
                
                for ( i = 0; i < sv.size(); i++) {
                for (int j = 0; j < sv.size(); j++) {
                    if (sv.get(i).getDiemTB() < sv.get(j).getDiemTB()) {
                        viThu++;
                    }
                }
                }
            }
            System.out.println(sv.get(i));
            System.out.println("Vi tri thu cua sinh vien CNTT " + sv.get(i).getHoTen() + " la: " + viThu);

        }
    }
    
    public void input() {
        lietKe();
        demSinhVienGioi();
        tinhDiemTBC_CNTT();
        loaiSinhVienKem();
        sapXepTangDan_theoDiem();
        tinhDiemTBC();
        xacDinhViThu();
        in_DSSV_KT();
        in_DSSV_CNTT();
//        xacDinhVithu_theoNganh();
    }

    public static void main(String[] args) {
        AA_MangSinhVien a = new AA_MangSinhVien();
        a.docFile("cntt.txt");
        a.input();
    }
}
