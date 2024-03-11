package BaiTapCoBan_JAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class ARRAY_chiSoCanXoa {
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
    void xoaGT() {
        int  k;
        
        System.out.println("\nnhap chi so muon xoa:");
        k = nhap.nextInt();
        if (k >= 0 && k <= arr.size()) {
            arr.remove(k);
        } else {
            System.out.println("vi tri xoa khong hop le !!!");
        }
    }

    void output() {
        randomArray("mang random la:");
        xoaGT();
        randomArray("mang sau xoa : "); 
    }

    public static void main(String[] args) {
        ARRAY_chiSoCanXoa values = new ARRAY_chiSoCanXoa();
        values.input();
        values.output();
    }
}
