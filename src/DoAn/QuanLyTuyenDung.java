package DoAn;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyTuyenDung {
    ArrayList<CongViec> cv = new ArrayList<>();
    private ArrayList<CongViec> a;
    private ArrayList<CongViec> b;


    public ArrayList<CongViec> getA() {
        return cv;
    }

    public void setA(ArrayList<CongViec> a) {
        this.a = a;
    }

    public ArrayList<CongViec> getB() {
        return cv;
    }

    public void setB(ArrayList<CongViec> b) {
        this.b = b;
    }
    
    public void in() {
        for (CongViec x : cv) {
            System.out.println(x);
        }
    }

    // dang tuyen
    // dang tuyen
    public boolean them(CongViec y) {
        for (CongViec x : cv) {
            if (x != null && x.getMoTa().isEmpty()) {
            return false;
            }
        }
        cv.add(y);
        return true;
    }
    
    // tim kiem vi tri
    public ArrayList timKiem(String viTri){
        ArrayList dsViTri = new ArrayList();
        for(CongViec x : cv){
            if(x.getViTri().equals(viTri)){
                dsViTri.add(x);
            }
        }
        return dsViTri;
    }
    
    // tim kiem all
    public ArrayList timKiemAll(String ten){
        ArrayList ds = new ArrayList();
        for(CongViec x : cv){
            if(x.getPhone().equalsIgnoreCase(ten) || x.getDiaDiem().equalsIgnoreCase(ten) || x.getTen().equalsIgnoreCase(ten) || x.getEmail().equalsIgnoreCase(ten)){
                ds.add(x);
            }
        }
        System.out.println(ds);
        return ds;
    }
    // loc theo luong
    public ArrayList loc_luong(long luong){
        ArrayList ds = new ArrayList();
        for(CongViec x : cv){
            if(x instanceof NguoiDangTuyen){
                if(((NguoiDangTuyen) x).getMucLuong() >=luong ){
                    ds.add(x);
                }
            }
        }
        System.out.println("==========="+ds);
        return ds;
    }
    
    // cap bac
     public ArrayList loc_capBac(String cap){
        ArrayList ds = new ArrayList();
        for(CongViec x : cv){
            if(x instanceof NguoiUngTuyen){
                if(((NguoiUngTuyen) x).getKinhNghiem().equalsIgnoreCase(cap)){
                    ds.add(x);
                }
            }
        }
        System.out.println("==========="+ds);
        return ds;
    }
     
     // vi tri
     public ArrayList loc_viTri(String viTri){
        ArrayList ds = new ArrayList();
        for(CongViec x : cv){
            if(x instanceof NguoiUngTuyen || x instanceof NguoiDangTuyen){
                if(x.getDiaDiem().equalsIgnoreCase(viTri)){
                    ds.add(x);
                }
            }
        }
        System.out.println("==========="+ds);
        return ds;
    }
    
    // locDS 
    public ArrayList locDS(String tenLop){
        ArrayList dsLoc = new ArrayList();
        for(CongViec x : cv){
            if(x.getClass().getSimpleName().equalsIgnoreCase(tenLop)){
                dsLoc.add(x);
            }
        }
        return dsLoc;
    }
    // xoa
    public void xoa() {
        System.out.println("\n4. xoa hoa don theo ma ");  
        Scanner nhapMA = new Scanner(System.in);
        System.out.print("nhap MA_HANG can xoa: ");
        String ma = nhapMA.nextLine();
        for (int i = 0; i < cv.size(); i++) {
            CongViec x = cv.get(i);
            if (x.getViTri().equals(ma)) {
                System.out.println("ma hang bi loai: " + x.toString());
                cv.remove(i);
                i--;
            }
        }
    }
    
    public void output() {
        
//         Thêm công việc thủ công
        NguoiDangTuyen cv1 = new NguoiDangTuyen("Tuyển dụng", "Full-stack", "Hà Nội", "fpt@tuyendung.com", "02222345", "FPT company", 10, 15000000L, new MyDate("15/10/2020"));
        them(cv1);
        NguoiUngTuyen ut1 = new NguoiUngTuyen("Ứng tuyển", "Back-end", "Hà Nội", "vanphutin2902@.com", "0345987613", "Văn Phú Tín",Boolean.TRUE, "Inter");
        them(ut1);
//        System.out.println("ds la: " + timKiem("Back-end"));
//        System.out.println("ds la: " + locDS("Ứng tuyển"));
//        
//        System.out.println("===========");
//        timKiemAll("Văn Phú Tín");
        
//        xoa();
    }

    public static void main(String[] args) {
        QuanLyTuyenDung jobManager = new QuanLyTuyenDung();
        jobManager.output();
    }
}