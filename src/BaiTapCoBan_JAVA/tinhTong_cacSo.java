package BaiTapCoBan_JAVA;

import java.util.Scanner;

public class tinhTong_cacSo {
    int n;
    void input(){
        System.out.println("Tinh tong cac chu so chan cua 1 so nguyen duong");
        System.out.println("nhap vao so nguyen > 0");
        Scanner nhap = new Scanner(System.in);
        n = nhap.nextInt();
    }
    int tinhTongChan(int x){
        int s=0;
        while(x!=0){
            int du = x%10;
            s = s + du;
            x =x/10;
        }
        return s;
    }

    void output(){
        int n1 = n;
        while (n1!=0){
            int du = n%10;
            n1 =n1/10;
        }
        System.out.println("tong cua "+n+ " la: "+tinhTongChan(n));
    }
    public static void main(String[] args) {
        tinhTong_cacSo value = new tinhTong_cacSo();
        value.input();
        value.output();
    }
}
