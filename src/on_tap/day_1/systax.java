
package on_tap.day_1;

import java.util.Scanner;

public class Systax {
    
    public static void main(String[] args) {
//       bai1();
//       bai2(20);
//       bai3();
//       bai4();
//       bai5();
//       printFizzBuzz();
       bai9();
    }
    
    //bai 1 : Viết chương trình tính tổng hai số nguyên nhập từ bàn phím.
    public static void bai1(){
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a: ");
        a = scanner.nextInt();
        System.out.println("nhap so b : ");
        b = scanner.nextInt();
        int kq = a + b;
        System.out.println("ket qua: "+ kq);
        
    }
    
    // Viết chương trình kiểm tra số chẵn/lẻ.
    public static boolean bai2(int a){
       if(a % 2 == 0){
           System.out.println("yes");
           return true;
       }
       System.out.println("no");
       return false;
    }
    
    //Viết chương trình in ra các số từ 1 đến 10 sử dụng vòng lặp for.
    public static void bai3(){
        for(int i = 0 ; i <= 10 ; i++){
            System.out.println("number: "+i);
        }
    }
    
    // Viết chương trình nhập vào một số nguyên và kiểm tra xem nó có phải là số nguyên tố không.
    public static boolean check_ngt(int n){
        if(n < 2) return false;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                return false;
            }
        }
            return true;
    }
    
    public static void bai4(){
        int a;
        Scanner scanner = new Scanner(System.in);
       while(true){
        System.out.println("nhap so NGUYEN DUONG: ");
        a = scanner.nextInt();
        
       // Thoát vòng lặp nếu người dùng nhập 0
        if (a == 0) {
            System.out.println("Đã thoát chương trình.");
            break;
        }
        
        if(check_ngt(a)){
            System.out.println(a+ " la so ngto");
        }else{
            System.out.println(a+" khong la so nguyen to");
        }
       }
        scanner.close(); 

    }
    
    //Viết chương trình in ra bảng cửu chương của một số nguyên bất kỳ (từ 1 đến 10).
    public static void bai5(){
        for(int i = 2; i < 10; i++){
            System.out.println("BANG NHAN "+ i);
            for(int j = 1 ; j <= 10 ; j++){
                System.out.println(i + " * "+j+" = " + i*j);
                
            }
        }
    }
    
    // Viết chương trình in ra các số từ 1 đến 100. Nhưng đối với bội số của 3 thì in ra "Fizz"
    // và cho bội số của 5 thì in ra Buzz thay vì in số hiện tại. Đối với các số là bội số của cả 3 và 5 thì in "FizzBuzz".
    
     public static void printFizzBuzz(){
        int init = 100;
        for(int i = 1 ; i <= init ; i ++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
     
   public static void bai9(){
    for(int i = 1; i < 35; i++){
        System.out.println("data.add(" + (int)(Math.random() * 100) + ");");
    }
}

}
