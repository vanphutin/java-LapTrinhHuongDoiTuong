package BaiTapCoBan_JAVA;

import java.util.*;

public class array_tong2SoLonNhat {
    ArrayList<Integer> a = new ArrayList<>();
    int n;

    void input() {
        Scanner nhap = new Scanner(System.in);
        do {
            System.out.print("nhap so phan tu > 0: ");
            n = nhap.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            a.add((int) (Math.random() * 100));
        }
    }

    int randomArray(String xuat) {
        System.out.println(xuat);
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        return 0;
    }

    int tongMax() {
        // Khởi tạo maxSum với giá trị nhỏ nhất của kiểu int để đảm bảo rằng bất kỳ tổng nào cũng lớn hơn nó.
        int maxSum = Integer.MIN_VALUE;

        // Duyệt qua danh sách a từ 0 đến (n - 2), vì chúng ta chỉ quan tâm đến cặp số liên tiếp.
        for (int i = 0; i < n - 1; i++) {
            // Tính tổng của hai số liên tiếp trong danh sách.
            int sum = a.get(i) + a.get(i + 1);

            // So sánh tổng hiện tại (sum) với tổng lớn nhất hiện tại (maxSum).
            if (sum > maxSum) {
                // Nếu tổng hiện tại lớn hơn maxSum, cập nhật maxSum với giá trị tổng hiện tại.
                maxSum = sum;
            }
        }
    
        // Trả về tổng lớn nhất của hai số liên tiếp trong danh sách.
        return maxSum;
    }


    void output() {
        randomArray("Mang tao ngau nhien la:");
        System.out.println("\ntong 2 so lien tiep co tong lon nhat = " + tongMax());
    }

    public static void main(String[] args) {
        array_tong2SoLonNhat value = new array_tong2SoLonNhat();
        value.input();
        value.output();
    }
}
