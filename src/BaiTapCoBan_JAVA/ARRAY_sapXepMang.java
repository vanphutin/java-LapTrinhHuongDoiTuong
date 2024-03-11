package BaiTapCoBan_JAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class ARRAY_sapXepMang {
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

    void sapXep() {
        // Sử dụng thuật toán Bubble Sort để sắp xếp mảng
        int temp;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - 1 - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

    void chenVaSapXep() {
    System.out.println("\nnhap gia tri can chen:");
    int giaTriChen = nhap.nextInt();
    arr.add(giaTriChen);
    sapXep(); 
}


    void output() {
        randomArray("mang random la:");
        chenVaSapXep();
        randomArray("\nmang sau khi chen tang : ");
        System.out.println("");
    }

    public static void main(String[] args) {
        ARRAY_sapXepMang values = new ARRAY_sapXepMang();
        values.input();
        values.output();
    }
}
