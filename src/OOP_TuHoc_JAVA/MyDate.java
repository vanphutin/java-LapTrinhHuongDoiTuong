
package OOP_TuHoc_JAVA;

public class MyDate {
   private int day;
   private int month;
   private int year;

    public MyDate(int day, int month, int year) {
        if(day >= 1 && day <= 31){
            this.day = day;
        }else this.day = 1;
        if(month > 1 && month <= 12){
            this.month = month;
        }else this.month = 1;
        if(year > 1 ){
            this.year = year;
        }else this.year = 1;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
//    @Override
//    public String toString(){
//        return this.day + "/" + this.month + "/" + this.year;
//    }

    @Override
    public String toString() {
        return "MyDate{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }
    public boolean equals(Object obj){
        if(this == obj) return true;
        if( this == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        MyDate other = (MyDate) obj;
        if(this.day != other.day) return false;
        if(this.month != other.month) return false;
        if(this.year != other.year) return false;
        return true;
            
    } 
   
}
