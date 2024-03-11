
package BaiTapCoBan_JAVA;

import java.util.*;

public class array_tongSoChan {
    ArrayList <Integer> arr = new ArrayList<>();
    int n;
    void input(){
        Scanner nhap = new Scanner(System.in);
        do{
            System.out.print("nhap so phan tu >0: ");
            n = nhap.nextInt();
        }while(n<=0);
        
        for(int i=0;i<n;i++){
            arr.add((int)(Math.random()*100));
        }
    }
    
    int randomArray(String xuat){
        System.out.print(xuat);
        for(int i = 0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        return 0;
    }
    int tongSoChan() {
    int tongChan = 0;
    System.out.print("\ntong cac so chan = ");
    for (int i = 0; i < n; i++) {
        if (arr.get(i) % 2 == 0) {
            System.out.print(arr.get(i) + " + ");
            tongChan += arr.get(i);
        }
    }
    if (tongChan > 0) {
        System.out.print("\b\b "); 
    }
    return tongChan;
}

    void output(){
       randomArray("Mang tao ngau nhien la:");
        System.out.println(" = "+tongSoChan());
        System.out.println();
    }
    public static void main(String[] args) {
        array_tongSoChan value =new array_tongSoChan();
        value.input();
        value.output();
    }
}
