
package BaiTapCoBan_JAVA;

import java.util.Scanner;

public class TinhToan_soNGUYEN {
    int a,b;
    char phepTinh;
    char pt1 = '+';
    char pt2 = '-';
    char pt3 = '*';
    char pt4 = '/';

    void input(){
        System.out.println("Van Phu Tin\n Tinh toan tren hai so nguyen");
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so nguyen 1:");
        a = nhap.nextInt();
        System.out.println("Nhap so nguyen 2:");
        b = nhap.nextInt();
        System.out.println("Nhap phep toan(+,-,*,/)");
        phepTinh = nhap.next().charAt(0);  
    }
    
    void phepTinh(){
        if(phepTinh == '+'){
            System.out.println(a+"+"+b+"= "+(a+b));
        }
        else if(phepTinh == '-'){
            System.out.println(a+"-"+b+"= "+(a-b));
        }
        else if(phepTinh == '*'){
            System.out.println(a+"*"+b+"= "+(a*b));
        }
        else if(phepTinh == '/'){
            if(b == 0){
                System.out.println("khong chia 0");
            }
            else{
                double ketqua = (double) a/b;
//                int nguyen = (int) ketqua;
//                int du = a%b;
                  System.out.printf("%d/%d = %.2f%n", a, b, ketqua);            }
        }
        else{
            System.out.println("khong tinh");
        }
    }
    public static void main(String[] args){
        TinhToan_soNGUYEN values = new TinhToan_soNGUYEN();
        Scanner nhap = new Scanner(System.in);
        while(true){
            values.input();
            values.phepTinh();
            
            nhap.nextLine();
            
        }
        
    }
    
}