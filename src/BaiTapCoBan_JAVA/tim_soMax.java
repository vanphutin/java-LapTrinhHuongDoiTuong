
package BaiTapCoBan_JAVA;

import java.util.Scanner;


public class tim_soMax {
     int n;
    void input(){
        System.out.println("Van Phu Tin");
        System.out.println("Tim chu so lon nhat cua 1 so nguyen duong");
        System.out.println("nhap vao so nguyen > 0");
        Scanner nhap = new Scanner(System.in);
        n = nhap.nextInt();
    }
    int findMax(int x){
        int Max = 0;
        while(x!=0){
            
            int du = x%10;
            if(du > Max){
               Max = du;
            }
            x = x/10;
            
        }
        return Max;
    }
    
    void output(){
        System.out.println("Max =  "+ findMax(n));
    }
    public static void main(String[] args) {
        tim_soMax value = new tim_soMax();
        value.input();
        value.output();
    }
}
