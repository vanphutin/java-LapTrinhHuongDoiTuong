
package BaiTapCoBan_JAVA;

import java.util.*;

public class array_hieuMaxMin {
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
    //ham tinh Max - Min
    int hieuMinMax(){
        int max = 0,min = 9999;
        for(int i=0;i<n;i++){
            if(max < a.get(i)){
                max= a.get(i);
            }if(min > a.get(i)){
                min = a.get(i);
            }
        }
        int hieu = max - min;
        System.out.print("\nMax - Min = "+ max +" - "+ min);
        return hieu;
    }
    void output(){
       randomArray("Mang cua tao ngau nhien la:");
        System.out.print(" = "+hieuMinMax());
        System.out.println();
    }
    public static void main(String[] args) {
        array_hieuMaxMin value =new array_hieuMaxMin();
        value.input();
        value.output();
    }
}
