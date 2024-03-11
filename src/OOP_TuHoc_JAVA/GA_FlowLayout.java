
package OOP_TuHoc_JAVA;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GA_FlowLayout extends JFrame{

    public GA_FlowLayout() {
        this.setTitle("Layout");
        this.setSize(600,300 );
        // can giua cuas so chuong trinh
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //set Layout
        FlowLayout flowLayout = new FlowLayout();
        FlowLayout flowLayout_1 = new FlowLayout(FlowLayout.LEFT);
        FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.CENTER,10,10);
//        this.setLayout(flowLayout);
//        this.setLayout(flowLayout_1);
        this.setLayout(flowLayout_2);


        JButton btn = new JButton("btn 1");
        JButton btn__2 = new JButton("btn 2");
        JButton btn__3 = new JButton("btn 3");
        //add thanh phan
        this.add(btn);
        this.add(btn__2);
        this.add(btn__3);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new GA_FlowLayout();
    }
}
