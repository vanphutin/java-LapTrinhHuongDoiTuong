
package OOP_TuHoc_JAVA;

public class HoaDonCaPhe {
  private String tenLoaiCaPhe;
  private double giaTien1Kg;
  private double khoiLuong;
  public HoaDonCaPhe(String ten, double gia, double kl){
      this.tenLoaiCaPhe = ten;
      this.giaTien1Kg = gia;
      this.khoiLuong = kl;
  }
  public double tinhTongTien(){
      return this.giaTien1Kg * this.khoiLuong;
  }
  public boolean kiemTraKhoiLuong(double kl){
      return this.khoiLuong > kl;
  }
  public boolean kiemTraTongTien(){
      return this.tinhTongTien() > 500000;
  }
  public double tinhGiamGia(double x){
      if(this.tinhTongTien() > 500000){
        return (x/100)*this.tinhTongTien();
      }return 0;
  }
  public double sauGiam(double x){
      return this.tinhTongTien() - this.tinhGiamGia(x);
  }
}
