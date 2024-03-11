
package BaiTapCoBan_JAVA;

import java.util.Scanner;

public class timSo_daoNguoc {
    int n;
    void input(){
        System.out.println("Van Phu Tin");
        System.out.println("Tim so dao nguoc cua 1 so nguyen duong");
        System.out.println("nhap vao so nguyen > 0");
        Scanner nhap = new Scanner(System.in);
        n = nhap.nextInt();
    }
    int timDaoNguoc(int x){
        int s=0;
        while(x!=0){
            int du = x%10;
            s = du + s*10;
            x =x/10;
        }
        return s;
    }
    
    void output(){
        System.out.println("so dao : "+timDaoNguoc(n));
    }
    public static void main(String[] args) {
        timSo_daoNguoc value = new timSo_daoNguoc();
        value.input();
        value.output();
    }
}
