package OOP_TuHoc_JAVA;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GA_BorderLayout extends JFrame {

    public GA_BorderLayout() {
        this.setTitle("Layout");
        this.setSize(600, 300);
        // can giua cuas so chuong trinh
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set Layout
        BorderLayout borderLayout = new BorderLayout();
        BorderLayout borderLayout_2 = new BorderLayout(20, 20);

        this.setLayout(borderLayout_2);

        JButton btn = new JButton("btn 0");
        JButton btn__1 = new JButton("btn 1");
        JButton btn__2 = new JButton("btn 2");
        JButton btn__3 = new JButton("btn 3");
        JButton btn__4 = new JButton("btn 4");
        JButton btn__5 = new JButton("btn 5");

        //add thanh phan
//        this.add(btn);
        this.add(btn__1, BorderLayout.NORTH);
        this.add(btn__2, BorderLayout.SOUTH);
        this.add(btn__3, BorderLayout.WEST);
        this.add(btn__4, BorderLayout.EAST);
        this.add(btn__5, BorderLayout.CENTER);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GA_BorderLayout();
    }
}
