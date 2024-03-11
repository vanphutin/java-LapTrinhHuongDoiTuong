package BaiTapCoBan_JAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class ARRAY_tongChuSoLonHon10 {
    ArrayList<Integer> arr = new ArrayList<>();
    int n;

    void input() {
        Scanner nhap = new Scanner(System.in);
        do {
            System.out.println("NHAP SO PHAN TU MANG > 0: ");
            n = nhap.nextInt();
        } while (n <= 0);
        for (int i = 0; i < n; i++) {
            arr.add((int) (Math.random() * 100));
        }
    }
    int randomArray(String xuat){
        System.out.println(xuat);
        for(int i = 0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        return 0;
    }

    int phanTich(int x) {
        int s = 0;
        while (x != 0) {
            int du = x % 10;
            s = du + s;
            x = x / 10;
        }
        return s; // Trả về tổng các chữ số của x
    }

    void tinhToan() {
        System.out.print("\ncac so co tong cac chu so > 10:");
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            int tongChuSo = phanTich(num);
            if (tongChuSo > 10) {
                System.out.print(num + " ");
            }
        }
    }
    void output(){
        randomArray("mang tao ngau nhien la:");
        tinhToan();
        System.out.println("");
    }

    public static void main(String[] args) {
        ARRAY_tongChuSoLonHon10 calculator = new ARRAY_tongChuSoLonHon10();
        calculator.input();
        calculator.output();
    }
}
