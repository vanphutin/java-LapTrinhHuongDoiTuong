package BaiTapCoBan_JAVA;

import java.util.*;

public class ARRAY_tongSoDoi {
    ArrayList<Integer> arr = new ArrayList<>();
    int n;

    void input() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("TINH TONG SO DOI: ");
        do {
            System.out.println("nhap so phan tu> 0");
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

    boolean timDaoNguoc(int x) {
        int s = 0, check = x;
        while (x != 0) {
            int du = x % 10;
            s = du + s * 10;
            x = x / 10;
        }
        return check == s;
    }

    int tinhTongSoDoi() {
        int sum = 0;
        System.out.print("\ntong cac so doi xung = ");
        boolean coSoDoi = false; // Biến này để kiểm tra có ít nhất một số đối xung trong mảng
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num < 10) {
                // Nếu số nhỏ hơn 10, không tính là số đối và bỏ qua
                continue;
            }
            if (timDaoNguoc(num)) {
                if (coSoDoi) {
                    System.out.print(" + ");
                }
                System.out.print(num);
                sum += num;
                coSoDoi = true;
            }
        }

        return sum;
    }

    void output() {
        randomArray("mang tao ngau nhien la:");
        int tong = tinhTongSoDoi();
        if (tong > 0) {
            System.out.print(" = " + tong);
        } else {
            System.out.print("Khong co so doi xung trong mang.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ARRAY_tongSoDoi calculator = new ARRAY_tongSoDoi();
        calculator.input();
        calculator.output();
    }
}
