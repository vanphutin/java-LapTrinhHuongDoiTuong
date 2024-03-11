
package OOP_TuHoc_JAVA;
import javax.swing.JFrame;

public class G_MyWindown extends JFrame{

    public G_MyWindown() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void showX(){
        this.setVisible(true);
    }
    public void showXX(String tilte, int width, int height, int X, int Y){
        this.setTitle(tilte);
        this.setSize(width,height);
        this.setVisible(true);
        this.setLocation(X, Y);
        while(true){
            System.out.println("dang chay");
        }
    }
    public static void main(String[] args) {
        G_MyWindown a=new G_MyWindown();
        a.showX();
        
        G_MyWindown a2 =new G_MyWindown();
        a2.showXX("hello", 300, 100, 300,300);
    }
    
}
