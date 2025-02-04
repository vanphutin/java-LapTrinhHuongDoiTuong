
package on_tap.day_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Systax {
    public static void main(String[] args) {
//     cau1();
//       cau2();
       cau4();
    }
    
    // Tạo một ArrayList lưu trữ các số nguyên và in ra các số chẵn.
    public static void cau1(){
        
        ArrayList<Integer> data = new ArrayList<>();
        data.add(26);
        data.add(44);
        data.add(99);
        data.add(61);
        data.add(39);
        data.add(77);
        data.add(96);
        data.add(51);
        data.add(13);
        data.add(9);
        data.add(22);
        data.add(24);
        data.add(86);
        data.add(75);
        data.add(17);
        data.add(99);
        data.add(21);
        data.add(51);
        data.add(5);
        data.add(92);
        data.add(45);
        data.add(61);
        data.add(30);
        data.add(88);
        data.add(22);
        data.add(43);
        data.add(6);
        data.add(47);
        data.add(77);
        data.add(65);
        data.add(47);
        data.add(58);
        data.add(29);
        data.add(58);
     
        for(int x : data){
            if(x % 2 == 0){
                System.out.println("so chan: "+ x);
            }
        }
    }
    
    //Sử dụng HashMap để đếm số lần xuất hiện của các từ trong một chuỗi.
    public static void cau2(){
        String text = "Java is great and Java is powerful";
        
        String[] words = text.toLowerCase().split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();
        
        for(String word : words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        
        System.out.println("Số lần xuất hiện của các từ:");
        for(String key  : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
 
    }
    
    //Viết một chương trình sử dụng Queue để mô phỏng hàng đợi tại một quầy thanh toán.
    public static void cau4(){
        // Khởi tạo hàng đợi (Queue) với LinkedList
        Queue<String> checkoutQueue = new LinkedList<>();
        
          // Thêm khách hàng vào hàng đợi
        checkoutQueue.add("Khách hàng 1");
        checkoutQueue.add("Khách hàng 2");
        checkoutQueue.add("Khách hàng 3");
        checkoutQueue.add("Khách hàng 4");
        
          // Mô phỏng quầy thanh toán, xử lý từng khách hàng
        System.out.println("Quá trình thanh toán bắt đầu...\n");
        
         while (!checkoutQueue.isEmpty()) {
            // Lấy và loại bỏ khách hàng khỏi hàng đợi (sử dụng poll)
            String customer = checkoutQueue.poll();
            System.out.println("Đang thanh toán cho: " + customer);

            // Mô phỏng thời gian thanh toán (delay ngắn để cảm nhận quá trình)
            try {
                Thread.sleep(1000);  // Delay 1 giây cho mỗi khách hàng
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("\nTất cả khách hàng đã thanh toán xong!");
       
    }
}
