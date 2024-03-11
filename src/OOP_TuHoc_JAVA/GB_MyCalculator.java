import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GB_MyCalculator extends JFrame {

    public GB_MyCalculator() {
        this.setTitle("my calculator");
        this.setSize(300, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputValue = new JTextField(50);
        inputValue.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel jPanel_Buttons = new JPanel();
        jPanel_Buttons.setLayout(new GridLayout(5, 3));
        jPanel_Buttons.add(new JButton("0"));
        jPanel_Buttons.add(new JButton("1"));
        jPanel_Buttons.add(new JButton("2"));
        jPanel_Buttons.add(new JButton("3"));
        jPanel_Buttons.add(new JButton("4"));
        jPanel_Buttons.add(new JButton("5"));
        jPanel_Buttons.add(new JButton("6"));
        jPanel_Buttons.add(new JButton("7"));
        jPanel_Buttons.add(new JButton("8"));
        jPanel_Buttons.add(new JButton("9"));
        jPanel_Buttons.add(new JButton("10"));
        jPanel_Buttons.add(new JButton("+"));
        jPanel_Buttons.add(new JButton("-"));
        jPanel_Buttons.add(new JButton("x"));
        jPanel_Buttons.add(new JButton("/"));
        jPanel_Buttons.add(new JButton("="));

        this.setLayout(new BorderLayout());
        this.add(inputValue, BorderLayout.NORTH);
        this.add(jPanel_Buttons, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GB_MyCalculator();
    }
}
