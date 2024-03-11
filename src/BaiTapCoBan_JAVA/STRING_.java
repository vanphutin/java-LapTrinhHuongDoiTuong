
package BaiTapCoBan_JAVA;

import java.util.ArrayList;


public class STRING_ {
   String st = " @Lop CS311B hoc lAp trinh JAVA! ";

    

   int demkitutrang(String st){
       int dem = 0 ;
       
       for(int i = 0; i < st.length(); i++){
          if(st.charAt(i) == ' '){
           dem ++;
       }
       }
       return dem;
   }
   int demkituso(String st){
       
       int demNumber = 0;
       for (int i = 0; i < st.length() ; i++){
           if(st.charAt(i) >= '1' &&  st.charAt(i) <= '9'){
               demNumber ++;
           }
       }
       return demNumber;
   }
   int demAlphabet(String st){
       int count = 0;
       for(int i = 0; i< st.length(); i++){
           if((st.charAt(i) >= 'a' && st.charAt(i)<= 'z') || (st.charAt(i) >= 'A' && st.charAt(i) <='Z') ){
               count ++;
           }
       }
       return count;
   }
   
   int demdb(String st){

       int demdacbiet = 0;
       for(int i = 0; i< st.length(); i++){
            if(!(st.charAt(i) >= 'a' && st.charAt(i)<= 'z' && !(st.charAt(i) >= 'A' && st.charAt(i)<= 'Z') && !(st.charAt(i) >= '0' && st.charAt(i)<= '9'))){
                demdacbiet ++;
            }
       }
       return demdacbiet;
   }
   int demsotu(String st){
      int demtu = 0;
       for(int i = 0; i< st.length();i++){
           if(st.charAt(i) == ' '){
               i++;
               demtu++ ;
           }
       }
       return demtu;
   }
    String timTuDaiNhat(String st) {
        String[] cacTu = st.split(" "); 
        String tuDaiNhat = "";

        for (int i = 0; i < cacTu.length; i++) {
            String tu = cacTu[i];
            if (tu.length() > tuDaiNhat.length()) {
                tuDaiNhat = tu;
            }
        }

        return tuDaiNhat;
}

    String xoaKhoangCachDu(String st){
        String st1 = st.trim();
        return st1;
    }
    void tieuDe() {
        xoaKhoangCachDu(st);
        char[] c = st.toCharArray();
        boolean kyTuDauTu = true;

        for (int i = 0; i < c.length; i++) {
            char kyTu = c[i];

            if (Character.isWhitespace(kyTu)) {
                kyTuDauTu = true;
            } else if (kyTuDauTu) {
                c[i] = Character.toUpperCase(kyTu);
                kyTuDauTu = false;
            } else {
                c[i] = Character.toLowerCase(kyTu);
            }
        }

        st = String.valueOf(c);
    }
   void output(){
       System.out.println("ST:" + st);
       xoaKhoangCachDu(st);
       tieuDe();
       System.out.println("1.dem so ki tu trang = " + demkitutrang(st));
       System.out.println("2.dem  ki tu so = " + demkituso(st));
       System.out.println("3.dem Alphabet= " + demAlphabet(st));
       System.out.println("4.dem so ki dac biet = " + demdb(st));
       System.out.println("5.dem so tu = " + demsotu(st));
       System.out.println("6.dem tu dai  = " + timTuDaiNhat(st));
       System.out.println("7.xoa khoang trang  =" + xoaKhoangCachDu(st));
       System.out.println("8.tieu de: " + st);
      
       
   }
   
    public static void main(String[] args) {
        STRING_ values = new STRING_();
        values.output();
    }
}
