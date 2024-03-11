
package BaiTapCoBan_JAVA;

import java.util.Scanner;


public class giaiphuongtrinhbacHAI {
   Double a,b,c;
   void input(){
       System.out.println("VAN PHU TIN \n Giai ax^2 + bx + C = 0");
       Scanner nhap = new Scanner(System.in);
       System.out.println("Moi nhap he so a: ");
       a = nhap.nextDouble();
       System.out.println("Moi nhap he so b: ");
       b = nhap.nextDouble();
       System.out.println("Moi nhap he so c: ");
       c = nhap.nextDouble();
   }
   void output() {
    System.out.println(String.format("%.0fx^2 %s%.0fx + %.0f = 0", a, (b < 0 ? "" : "+"), b, c));
    double delta = (b * b) - (4 * a * c);
    if (delta < 0) {
        System.out.println("vo no");
    } else if (delta == 0) {
        double x = -b / (2 * a);
        if (x == (int) x) {
            System.out.printf("x1 = x2 = %d%n", (int) x);
        } else {
            System.out.printf("x1 = x2 = %.1f%n", x);
        }
    } else {
        double x1 = (-b - Math.sqrt(delta)) / (2 * a);
        double x2 = (-b + Math.sqrt(delta)) / (2 * a);
        if (x1 == (int) x1) {
            System.out.printf("X = %d,", (int) x1);
        } else {
            System.out.printf("X = %.1f, ", x1);
        }
        if (x2 == (int) x2) {
            System.out.printf("x = %d%n", (int) x2);
        } else {
            System.out.printf("x = %.1f%n", x2);
        }
    }
}

   public static void main(String[] args){
       giaiphuongtrinhbacHAI values = new giaiphuongtrinhbacHAI();
       Scanner nhap = new Scanner(System.in);
       while(true){
           values.input();
           values.output();
           
           nhap.nextLine();
       }
       
   }
}
