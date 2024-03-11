package OOP_GUI;

public class AA_Bac2 extends AA_Bac1 {
    private double a;

    @Override
    public String Giai() {
        if (a == 0) {
            return super.Giai();
        }
        double d = b * b - 4 * a * c;
        if (d < 0) {
            return "vo nghiem";
        }
        if (d == 0) {
            return "x1=x2= " + -b / (2 * a);
        }
        double x1 = (-b - Math.sqrt(d)) / (2 * a);
        double x2 = (-b + Math.sqrt(d)) / (2 * a);
        return "x1= " + x1 + ", x2= " + x2;
    }

    @Override
    public String toString() {
        return String.format("%.2fx^2 %s %.2fx %s %.2f = 0 %s", a, (b >= 0 ? "+" : ""), b, (c >= 0 ? "+" : ""), c, Giai());
    }

    public AA_Bac2() {
    }

    
    public AA_Bac2(double a, double b, double c) {
        super(b, c);
        this.a = a;
    }

    
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    // Consider adding getter and setter methods for b and c as well

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
