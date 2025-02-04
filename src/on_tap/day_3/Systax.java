/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package on_tap.day_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author ASUS
 */
class MyThread extends Thread{
         @Override
        public void run() {
            System.out.println("Luồng đang chạy: " + Thread.currentThread().getName());
        }
}

//Tạo một ngoại lệ tùy chỉnh InvalidEmailException và sử dụng nó để kiểm tra tính hợp lệ của email.
class InvalidEmailException extends Exception {
    public InvalidEmailException(String mess){
        super(mess);
    }
} 

// Lớp kiểm tra email hợp lệ
public class Systax {
    
    // Phương thức kiểm tra tính hợp lệ của email
    public static void validateEmail(String email) throws InvalidEmailException{
         // Biểu thức chính quy để kiểm tra email hợp lệ
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        
        if(!email.matches(emailRegex)){
            throw new InvalidEmailException("Email không hợp lệ: " + email);

        }
    }
    
    public static void main(String[] args) {
       // Kiểm tra một số email
        String[] emails = {"valid@example.com", "invalid-email.com", "another@valid.com", "invalid@.com"};
        
        for(String email : emails ){
            try {
                validateEmail(email);
                System.out.println(email + " là email hợp lệ.");System.out.println("");
            } catch (Exception e) {
                 System.out.println(e.getMessage()); 
            }
        }
    }
}
