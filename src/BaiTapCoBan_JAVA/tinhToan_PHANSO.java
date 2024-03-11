package BaiTapCoBan_JAVA;

import java.util.Scanner;

public class tinhToan_PHANSO {
    int mau1, mau2, tu1, tu2;
    char phepTinh;

    void input() {
        Scanner nhap = new Scanner(System.in);

        System.out.println("Van Phu Tin\n Tinh toan tren hai phan so ");
        System.out.println("nhap phan so 1:");
        System.out.print("tu: ");
        tu1 = nhap.nextInt();
        System.out.print("mau: ");
        mau1 = nhap.nextInt();

        System.out.println("nhap phan so 2:");
        System.out.print("tu: ");
        tu2 = nhap.nextInt();
        System.out.print("mau: ");
        mau2 = nhap.nextInt();

        System.out.println("Nhap phep toan (+, -, *, /)");
        phepTinh = nhap.next().charAt(0);
    }

    // Hàm tính UCLN sử dụng thuật toán Euclid
    int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Hàm rút gọn phân số
    void rutGonPhanSo(int tu, int mau) {
        int ucln = UCLN(tu, mau);
        tu /= ucln;
        mau /= ucln;
        System.out.printf("%d/%d%n", tu, mau);
    }

    void phepTinh() {
        if (phepTinh == '+') {
            int tu = tu1 * mau2 + tu2 * mau1;
            int mau = mau1 * mau2;
            System.out.printf("%d/%d + %d/%d = ", tu1, mau1, tu2, mau2);
            rutGonPhanSo(tu, mau);
        } else if (phepTinh == '-') {
            int tu = tu1 * mau2 - tu2 * mau1;
            int mau = mau1 * mau2;
            System.out.printf("%d/%d - %d/%d = ", tu1, mau1, tu2, mau2);
            rutGonPhanSo(tu, mau);
        } else if (phepTinh == '*') {
            int tu = tu1 * tu2;
            int mau = mau1 * mau2;
            System.out.printf("%d/%d * %d/%d = ", tu1, mau1, tu2, mau2);
            rutGonPhanSo(tu, mau);
        } else if (phepTinh == '/') {
            if (tu1 == 0 || tu2 == 0) {
                System.out.println("Khong chia 0");
            } else {
                int tu = tu1 * mau2;
                int mau = mau1 * tu2;
                System.out.printf("%d/%d / %d/%d = ", tu1, mau1, tu2, mau2);
                rutGonPhanSo(tu, mau);
            }
        } else {
            System.out.println("Khong tinh");
        }
    }

    public static void main(String[] args) {
        tinhToan_PHANSO values = new tinhToan_PHANSO();
        Scanner nhap = new Scanner(System.in);
        while (true) {
            values.input();
            values.phepTinh();

            nhap.nextLine();
        }
    }
}
