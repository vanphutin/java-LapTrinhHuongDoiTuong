package BaiTapCoBan_JAVA;

import java.util.Scanner;

public class tim_UCLNBCNN {
    static int a, b; 
    
    void input() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Van Phu Tin");
        System.out.println("Tim UCLN(A,B) & BCNN(A,B)");
        System.out.print("Nhap a > 0:");
        a = nhap.nextInt();
        System.out.print("Nhap b > 0:");
        b = nhap.nextInt();
    }

    int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }

    void output(int a, int b, int ucln, int bcnn) {
        System.out.println("UCLN( " + a + " , " + b + ") =" + ucln);
        System.out.println("BCNN( " + a + " , " + b + ") = " + bcnn);
    
    }
    public static void main(String[] args) {
        tim_UCLNBCNN program = new tim_UCLNBCNN(); 
        program.input();
        int ucln = program.UCLN(a, b);
        int bcnn = program.BCNN(a, b);
        program.output(a, b, ucln, bcnn);
    }

}
