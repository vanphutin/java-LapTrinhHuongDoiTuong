
package DoAn;

import DoAn.*;

public class MyDate {
   private int ngay,thang, nam;

   
   public  MyDate(String date){
       String s[] = date.split("/");
        ngay = Integer.parseInt(s[0]);
        thang = Integer.parseInt(s[1]);
        nam = Integer.parseInt(s[2]) ;
   }
   
    public MyDate() {
    }

    public MyDate(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    
    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }

    
    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
   
}
