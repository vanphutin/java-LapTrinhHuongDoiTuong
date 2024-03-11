
package BaiTapCoBan_JAVA;

import java.util.Scanner;


public class kiemTra_soNguyenTo {
    int number;
    void input(){
        System.out.println("Kien tra so nguyen to");
        Scanner nhap = new Scanner(System.in);
        System.out.print("nhap mot so nguyen to \b");
        number = nhap.nextInt();
    }
    boolean checkSoNguyenTo(int n){
        if(n < 2) return false;
        for(int i= 2; i<=Math.sqrt(n); i++){
            if(n % 2 == 0){
                return false;
            }
        }
        return true;
    }
    void output(){
        if(checkSoNguyenTo(number)){
            System.out.println(number + ": Yes");
        }
        else{
            System.out.println(number +": No");
        }
    }
    public static void main (String[] args ){
        kiemTra_soNguyenTo value = new kiemTra_soNguyenTo ();
        value.input();
        value.output();
    }
}
