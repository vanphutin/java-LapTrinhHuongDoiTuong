 package BaiTapCoBan_JAVA;

import java.util.Scanner;

public class lietKe_doiXung {
    int n;

    void input() {
        System.out.println("Van Phu Tin");
        System.out.println("Liet ke so doi xung <= n");
        System.out.println("Nhap vao so nguyen > 0");
        Scanner nhap = new Scanner(System.in);
        n = nhap.nextInt();
    }

    boolean isPalindrome(int x) {
        int s = 0, original = x;
        while (x != 0) {
            int du = x % 10;
            s = du + s * 10;
            x = x / 10;
        }
        return original == s;
    }

    void output() {
        System.out.println("Cac so doi xung <= " + n + " la:");
        for (int i = 10; i <= n; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // In xuống dòng để kết thúc danh sách số đối xứng
    }

    public static void main(String[] args) {
        lietKe_doiXung value = new lietKe_doiXung();
        value.input();
        value.output();
    }
}
