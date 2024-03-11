
package OOP_TuHoc_JAVA;

import javax.swing.JFrame;

public class G_ViDuGUI {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("Vi du JFrame");
        // hien thi app ra man hinh
        jf.setVisible(true);
        jf.setSize(400,600);
        // dong chuong trinh
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set vi tri cua so
        jf.setLocation(300,300);
        while(true){
            System.out.println("dang chay");
        }
    }
}
