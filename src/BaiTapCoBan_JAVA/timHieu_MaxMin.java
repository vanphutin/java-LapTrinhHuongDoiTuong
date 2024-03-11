
package BaiTapCoBan_JAVA;

import java.util.Scanner;


public class timHieu_MaxMin {
     int n;
    void input(){
        System.out.println("Van Phu Tin");
        System.out.println("Tim hieu cua chu so Max - chu so Min");
        System.out.println("nhap vao so nguyen > 0");
        Scanner nhap = new Scanner(System.in);
        n = nhap.nextInt();
    }
    int hieuMaxMin(int x){
        int Min = 99999999,Max = 0;
        while(x!=0){
            
            int du = x%10;
            if(du < Min){
               Min = du;
            }
           if(du > Max){
                Max = du;
            }
            x = x/10;
        }

        int s =  Max - Min;
        return s;
    }
    
    void output() {
    int hieu = hieuMaxMin(n);
    int min = 99999999; // Giả định giá trị ban đầu cho min
    int max = 0;       // Giả định giá trị ban đầu cho max

    int n1 = n;
    while (n1 != 0) {
        int du = n1 % 10;
        if (du < min) {
            min = du;
        }
        if (du > max) {
            max = du;
        }
        n1 = n1 / 10;
    }

    System.out.println("Max - Min = " + max + " - " + min + " = " + hieu);
}

    public static void main(String[] args) {
        timHieu_MaxMin value = new timHieu_MaxMin();
        value.input();
        value.output();
    }
}
