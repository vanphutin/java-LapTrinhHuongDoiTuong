
package BaiTapCoBan_JAVA;

import java.util.Scanner;

public class kiemTra_doiXung {
    int n;
    void input(){
        System.out.println("kiem tra so doi xung");
        System.out.println("nhap vao so nguyen > 0");
        Scanner nhap = new Scanner(System.in);
        n = nhap.nextInt();
    }
    boolean timDaoNguoc(int x){
        int s=0, check = x;
        while(x!=0){
            int du = x%10;
            s = du + s*10;
            x =x/10;
        }
        if(check == s){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    void output(){
        if(timDaoNguoc(n)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    public static void main(String[] args) {
        kiemTra_doiXung value = new kiemTra_doiXung();
        value.input();
        value.output();
    }
}
