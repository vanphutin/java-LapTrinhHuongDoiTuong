
package OOP_JAVA;


public class AA_CNTT extends AA_SinhVien{

    private double java, html, css;

    @Override
    public double getDiemTB() {
        return (java*2 + html + css)/ 4;
    }

    @Override
    public String toString() {
        return "AA_CNTT{" + super.toString() + ", java=" + java + ", html=" + html + ", css=" + css + '}';
    }
    
    public AA_CNTT() {
    }

    public AA_CNTT(double java, double html, double css, String ma, String hoTen, boolean gioiTinh) {
        super(ma, hoTen, gioiTinh);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }
    
    
    public static void main(String[] args) {
        AA_CNTT a = new AA_CNTT(5,5,3,"sv001", "chi pheo",false );
        System.out.println(a);
    }
}
