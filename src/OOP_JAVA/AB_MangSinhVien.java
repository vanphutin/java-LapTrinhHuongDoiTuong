
package OOP_JAVA;

import java.io.File;
import java.util.*;

public class AB_MangSinhVien {
    ArrayList<AB_SinhVien> sv = new ArrayList<>();
    
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
                        sv.add(new AB_KinhTe(diem1, diem2, maSV, hoTen, gioiTinh));
                    }else{
                        sv.add(new AB_CNTT(diem1, diem2,Double.parseDouble(s[5]),maSV, hoTen, gioiTinh));
                    }
                }
            }else{
                System.out.println("khong ton tai file");
            }
        } catch (Exception e) {
        }
    }
   
    
    // in DSSV
    public void lietKeSinhVien(){
        System.out.println("----------------------------------------------------");
        System.out.println("1. in danh sach sinh vien");
        for(AB_SinhVien x : sv){
            System.out.println(x);
        }
    }
    
   // tinh diem trung binh theo gioi tinh
    public double tinhDiemTBC_gioiTinh(String gt, boolean gioiTinh) {
    System.out.println("----------------------------------------------------");
    System.out.println("2. tinh diem trung binh theo gioi tinh");

    int cnt = 0;
    double dtb = 0;

    for (AB_SinhVien x : sv) {
        if ((x instanceof AB_CNTT || x instanceof AB_KinhTe) && x.isGioiTinh() == gioiTinh) {
            if (x instanceof AB_CNTT) {
                dtb += ((AB_CNTT) x).getDiemTB();
                cnt++;
            } else if (x instanceof AB_KinhTe) {
                dtb += ((AB_KinhTe) x).getDiemTB();
                cnt++;
            }
        }
    }

    double sum = (cnt > 0) ? dtb / cnt : 0;
    String gioiTinhStr = gioiTinh ? "nam" : "nu";
    System.out.println("diem trung binh chng theo gioi tinh " + gioiTinhStr + ": " + sum);
    return sum;
}

    
    // dem sinh vien "kha"
    public void demSVkha() {
        System.out.println("----------------------------------------------------");
        System.out.println("3. so luong sinh vien kha");
        int dem = 0;
        for (AB_SinhVien x : sv) {

            if(x instanceof AB_KinhTe){
                String xepLoai = ((AB_KinhTe) x).getXepLoai();
                if(xepLoai.equals("kha")){
                  dem ++;  
                }
            }
            else if(x instanceof AB_CNTT){
                String xepLoai = ((AB_CNTT) x).getXepLoai();
                if(xepLoai.equals("kha")){
                    dem++;
                }
            }

        }
        System.out.println("So luong sinh vien kha: " + dem);
    }
    
    
    // tinh diem trung binh chung
    public double tinhDTB_chung(){
        System.out.println("----------------------------------------------------");
        System.out.println("4. diem trung binh chung cua sinh vien");
        int cnt = 0;
        double dtb = 0;
        for(AB_SinhVien x : sv){
            if(x instanceof AB_CNTT){
                if(((AB_CNTT) x).getDiemTB() > 0){
                    dtb += ((AB_CNTT) x).getDiemTB();
                    cnt++;
                }
            } 
            if(x instanceof AB_KinhTe){
                if(((AB_KinhTe) x).getDiemTB() > 0){
                    dtb += ((AB_KinhTe) x).getDiemTB();
                    cnt++;
                }
            }
        }
        double sum = dtb/cnt;
        System.out.println("diem trung binh chung cua sinh vien la: " + sum );
        return sum;
    }
    
    
    // tinh diem trung binh chung nganh kinh te
    public double diemTBC_kinhTe(){
        System.out.println("----------------------------------------------------");
        System.out.println("5. tinh diem trung binh chung nghanh kinh te");
        double dtb = 0;
        int cnt = 0;
        for(AB_SinhVien x : sv){
            if(x instanceof AB_KinhTe){
                dtb += ((AB_KinhTe) x).getDiemTB();
                cnt ++;
            }
        }
        double sum = (cnt > 0) ? dtb / cnt : 0;
        System.out.println("diem trung binh chung nghanh kinh te: " + sum);
        return sum;
    }
    
    
    //diem sinh vien loai gioi cntt
    public void diemSV_gioiCNTT(){
        System.out.println("----------------------------------------------------");
        System.out.println("6. so luong sinh vien gioi CNTT");
        int cnt = 0;
        for(AB_SinhVien x : sv){
            if(x instanceof AB_CNTT){
                if(((AB_CNTT) x).getXepLoai() == "gioi"){
                    cnt++;
                }
            }
        }
        System.out.println("so luong sinh vien gioi CNTT: " + cnt);
    }
    
    //tách sinh viên CNTT
    public void tachDS_CNTT() {
        System.out.println("----------------------------------------------------");
        System.out.println("7. tach sinh vien CNTT");
        ArrayList<AB_SinhVien> dsCNTT = new ArrayList<>();

        for (AB_SinhVien sv : this.sv) {
            if (sv instanceof AB_CNTT) {
                dsCNTT.add(sv);
            }
        }

        // In danh sách sinh viên CNTT
        System.out.println("Danh sach sinh vien CNTT:");
        for (AB_SinhVien sv : dsCNTT) {
            System.out.println(sv);
        }
    }
    
    //tách sinh viên kinh te
    public void tachDS_kinhTe() {
        System.out.println("----------------------------------------------------");
        System.out.println("8. tach sinh vien kinh te");
        ArrayList<AB_SinhVien> dsKinhTe = new ArrayList<>();

        for (AB_SinhVien sv : this.sv) {
            if (sv instanceof AB_KinhTe) {
                dsKinhTe.add(sv);
            }
        }

        // In danh sách sinh viên Kinh Tế
        System.out.println("Danh sach sinh vien Kinh Te:");
        for (AB_SinhVien sv : dsKinhTe) {
            System.out.println(sv);
        }
    }
    
    
    // xac dinh vi thu sinh vien
    public void xacDinhViThu() {
        System.out.println("----------------------------------------------------");
        System.out.println("9. xac dinh vi thu sinh vien ");
        for (int i = 0; i < sv.size(); i++) {
            int viTri = 1;

            for (int j = 0; j < sv.size(); j++) {
                if (sv.get(i).getDiemTB() < sv.get(j).getDiemTB()) {
                    viTri++;
                }
            }

            // Print student information along with their rank
            System.out.println(sv.get(i));
            System.out.println("Vi tri thu cua sinh vien " + sv.get(i).getHoTen() + " la: " + viTri);
        }
    }

    // Xác định vị thứ của sinh viên trong từng ngành
public void xacDinhViThuTheoNganh() {
    System.out.println("----------------------------------------------------");
    System.out.println("10. Xac dinh vi thu theo nganh");

    // Tạo danh sách riêng cho từng ngành
    ArrayList<AB_SinhVien> dsCNTT = new ArrayList<>();
    ArrayList<AB_SinhVien> dsKinhTe = new ArrayList<>();

    for (AB_SinhVien sv : this.sv) {
        if (sv instanceof AB_CNTT) {
            dsCNTT.add(sv);
        } else if (sv instanceof AB_KinhTe) {
            dsKinhTe.add(sv);
        }
    }

    // Sắp xếp danh sách theo điểm trung bình giảm dần
    Collections.sort(dsCNTT, Comparator.comparingDouble(AB_SinhVien::getDiemTB).reversed());
    Collections.sort(dsKinhTe, Comparator.comparingDouble(AB_SinhVien::getDiemTB).reversed());

    // In ra vị trí của từng sinh viên trong danh sách
    for (AB_SinhVien sv : dsCNTT) {
        int viTri = dsCNTT.indexOf(sv) + 1;
        System.out.println("CNTT - " + sv.getHoTen() + " - Vi tri thu: " + viTri);
    }

    for (AB_SinhVien sv : dsKinhTe) {
        int viTri = dsKinhTe.indexOf(sv) + 1;
        System.out.println("Kinh Te - " + sv.getHoTen() + " - Vi tri thu: " + viTri);
    }
}




    public void output(){
        lietKeSinhVien();
        tinhDiemTBC_gioiTinh("nam",true);
        tinhDiemTBC_gioiTinh("nu",false);
        demSVkha();
        tinhDTB_chung();
        diemTBC_kinhTe();
        diemSV_gioiCNTT();
        tachDS_CNTT();
        tachDS_kinhTe();
        xacDinhViThu();
        xacDinhViThuTheoNganh();
    }
    public static void main(String[] args) {
        AB_MangSinhVien in = new AB_MangSinhVien();
        in.docFile("cntt_kinhte.txt");
        in.output();
    }
}