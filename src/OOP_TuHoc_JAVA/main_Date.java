
package OOP_TuHoc_JAVA;

public class main_Date {
    public static void main(String[] args) {
        MyDate md = new MyDate(31, 1, 2021);
        MyDate md2 = new MyDate(30, 1, 2021);
        System.out.println("day = " + md.getDay());
        System.out.println(md);
        System.out.println("so sanh md va md 1: "+ md.equals(md2));
    }
}
