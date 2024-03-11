
package OOP_JAVA;

public class I_CNTT extends I_SinhVien{
    private double html,css,java;

    @Override
    public String toString() {
        return "I_CNTT{"+super.toString() + ", " + html + ", " + css + ", " + java + "}";
    }
    
    
    @Override
    public double getDiemTB() {
        return (java*2 + html + css)/4;
    }

    public I_CNTT() {
    }

    public I_CNTT(double html, double css, double java, String ma, String hoTen, boolean gioiTinh) {
        super(ma, hoTen, gioiTinh);
        this.html = html;
        this.css = css;
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

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }
    
    
}
