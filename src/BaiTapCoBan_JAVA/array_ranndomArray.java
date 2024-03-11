
package BaiTapCoBan_JAVA;

import java.util.*;

public class array_ranndomArray {
    ArrayList <Integer> a = new ArrayList<>();
    int n;
    void input(){
        Scanner nhap = new Scanner(System.in);
        do{
            System.out.print("nhap so phan tu >0: ");
            n = nhap.nextInt();
        }while(n<=0);
        
        for(int i=0;i<n;i++){
            a.add((int)(Math.random()*100));
        }
    }
    
    int randomArray(String xuat){
        System.out.println(xuat);
        for(int i = 0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
        return 0;
    }
    
    void output(){
       randomArray("Mang tao ngau nhien la:");
    }
    public static void main(String[] args) {
        array_ranndomArray value =new array_ranndomArray();
        value.input();
        value.output();
    }
}
