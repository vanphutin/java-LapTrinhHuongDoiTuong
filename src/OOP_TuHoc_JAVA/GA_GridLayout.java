
package OOP_TuHoc_JAVA;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GA_GridLayout extends JFrame{
    public GA_GridLayout() {
        this.setTitle("Layout");
        this.setSize(600,300 );
        // can giua cuas so chuong trinh
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //set Layout
        GridLayout gridLayout = new GridLayout();
        GridLayout gridLayout__1 = new GridLayout(4,4);
        GridLayout gridLayout__2 = new GridLayout(4,4,25,25);
//        this.setLayout(flowLayout);
//        this.setLayout(flowLayout_1);
        this.setLayout(gridLayout__2);
        
        for(int i = 0 ; i < 16 ; i++){
            JButton jButton = new JButton(i +"");
            this.add(jButton);
        }
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new GA_GridLayout();
    }
}
