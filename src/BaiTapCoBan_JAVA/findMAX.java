
package BaiTapCoBan_JAVA;

import java.util.Scanner;

public class findMAX {
    int a,b,c,d;
    void input(){
        System.out.println("Van Phu Tin\n Tim max cua 4 so nguyen;");
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap 4 so nguyen: ");
        a = nhap.nextInt();
        b = nhap.nextInt();
        c = nhap.nextInt();
        d = nhap.nextInt();
    }
    void findMAX(){
        int MAX = a;
        if(b > MAX){
           MAX = b;
        }
        if(c > MAX){
           MAX = c;
        }
        if(d > MAX){
           MAX = d;
        }
        System.out.println("Max("+a+(",")+b+(",")+c+(",")+d+(",")+")= "+MAX);
    }
    public static void main(String[] args){
        findMAX values = new findMAX();
        values.input();
        values.findMAX();
    }
    
}
