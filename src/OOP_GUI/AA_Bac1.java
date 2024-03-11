
package OOP_GUI;

public class AA_Bac1 extends AA_PhuongTrinh{
    protected double b, c;

    @Override
    public String toString() {
        return b+"x " + (c>=0?"+" : "")+c +" =0" + Giai();
    }
    
    @Override
    public String Giai() {
        if(b==0){
            if(c==0){
                return "vo so nghiem";
            }else {
                return "vo nghiem";
            }
        }else {
            return "x= " + -c/b;
        }
        
    }

    public AA_Bac1() {
    }

    public AA_Bac1(double b, double c) {
        this.b = b;
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
}
