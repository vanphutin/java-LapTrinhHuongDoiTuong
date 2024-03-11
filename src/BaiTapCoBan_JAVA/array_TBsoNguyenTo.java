package BaiTapCoBan_JAVA;

import static java.lang.System.exit;
import java.util.*;


public class array_TBsoNguyenTo {

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
    boolean checkSoNguyenTo(int n){
        if(n < 2) return false;
        for(int i= 2; i<=Math.sqrt(n); i++){
            if(n % 2 == 0){
                return false;
            }
        }
        return true;
    }
    double TBSoNguyenTo(){
        int tongNT = 0, count = 0;
        System.out.print("\nTB cac so nguyen to la: ((");
        for(int i= 2; i<arr.size(); i++){
            if(checkSoNguyenTo(arr.get(i))){
                System.out.print("\b "+arr.get(i)+" + ");
                tongNT = tongNT + arr.get(i);
                count++;
            }
        }
        if(count ==0){
            System.out.println("khong co so nguyen to nao !");
            exit(0);
        }
        System.out.print("\b )/"+count);
        double TBNguyenTo = (double)tongNT/count;
        return  TBNguyenTo;
    }
    
            
    void output(){
       randomArray("Mang tao ngau nhien la:");
        System.out.println(" = "+TBSoNguyenTo());
        System.out.println();
    }
    public static void main(String[] args) {
        array_TBsoNguyenTo value =new array_TBsoNguyenTo();
        value.input();
        value.output();
    }
}

