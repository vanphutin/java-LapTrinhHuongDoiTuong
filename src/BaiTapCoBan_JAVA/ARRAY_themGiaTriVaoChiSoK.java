package BaiTapCoBan_JAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class ARRAY_themGiaTriVaoChiSoK {
    ArrayList<Integer> arr = new ArrayList<>();
    Scanner nhap = new Scanner(System.in);
    int n;

    void input() {
        do {
            System.out.println("NHAP SO PHAN TU >  0");
            n = nhap.nextInt();
        } while (n <= 0);
        for (int i = 0; i < n; i++) {
            arr.add((int) (Math.random() * 100));
        }
    }

    int randomArray(String xuat) {
        System.out.println(xuat);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        return 0;
    }

    // gt.add(int k, x) them x vao chi so k
    void themGT() {
        int x, k;
        System.out.println("\nnhap  gia tri va chi so can chen:");
        x = nhap.nextInt();
        k = nhap.nextInt();
        if (k >= 0 && k <= arr.size()) {
            arr.add(k, x);
        } else {
            System.out.println("vi tri khong hop le !!!");
        }
    }

    void output() {
        randomArray("mang random la:");
        themGT();
        randomArray("mang sau chen : "); 
    }

    public static void main(String[] args) {
        ARRAY_themGiaTriVaoChiSoK values = new ARRAY_themGiaTriVaoChiSoK();
        values.input();
        values.output();
    }
}
