package BaiTapCoBan_JAVA;

import java.util.Scanner;

public class tinhTong_soChan {
    int n;

    void input() {
        System.out.println("Van Phu Tin");
        System.out.println("Tinh tong cac chu so chan cua 1 so nguyen duong");
        System.out.println("Nhap vao so nguyen > 0");
        Scanner nhap = new Scanner(System.in);
        n = nhap.nextInt();
    }

    int tinhTongChan(int x) {
        int s = 0;
        while (x != 0) {
            int du = x % 10;
            if (du % 2 == 0) {
                s = s + du;
            }
            x = x / 10;
        }
        return s;
    }

    void output() {
    int tong = tinhTongChan(n);
    int n1 = n;
    System.out.print("Tong = ");
    while (n1 != 0) {
        int du = n1 % 10;
        if (du % 2 == 0) {
            System.out.print(du);
            if (n1 >= 10) {
                System.out.print(" + ");
            }
        }
        n1 = n1 / 10;
    }
    System.out.println(" = " + tong);
}


    public static void main(String[] args) {
        tinhTong_soChan value = new tinhTong_soChan();
        value.input();
        value.output();
    }
}
