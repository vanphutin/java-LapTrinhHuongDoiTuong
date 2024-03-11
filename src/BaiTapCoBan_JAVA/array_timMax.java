
package BaiTapCoBan_JAVA;

import java.util.*;

public class array_timMax {
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
    //ham tim Max
    int timMax(){
        int x = a.get(0);
        for(int i=0;i<n;i++){
            if(x<a.get(i)) x = a.get(i);
        }
        return x;
    }
    void output(){
       randomArray("Mang tao ngau nhien la:");
        System.out.println("2\nMax ="+timMax());
    }
    public static void main(String[] args) {
        array_timMax value =new array_timMax();
        value.input();
        value.output();
    }
}
