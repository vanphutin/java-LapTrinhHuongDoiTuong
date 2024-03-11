
package OOP_TuHoc_JAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class phuongThuc {
   ArrayList<Integer> a = new ArrayList<>(); 
   Scanner nhap = new Scanner(System.in);
   int n = nhap.nextInt();
   int element ;
   public void input(){
       System.out.println("nhap so luong mang: ");
       for(int i = 0; i<n;i++){
           System.out.print("nhap phan tu thu: " + i);
           element = nhap.nextInt();
            a.add(element);
           
       }
   }
   public void output(){
       System.out.println("cac phan tu trogn mang la: ");
       for(int x : a){
           System.out.println(x);
       }
           
   }
    public static void main(String[] args) {
        phuongThuc test = new phuongThuc();
        test.input();
        test.output();
    }
}
