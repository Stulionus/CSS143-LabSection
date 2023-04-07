package Labs.Lab2;

public class Date {
    int day;
    int month;
    int year;

    public Date(int m, int d, int y){
        day = d;
        month = m;
        year = y;
    }

    public void setDate(int m, int d, int y){
        day = d;
        month = m;
        year = y;
    }

    public void printCurrentDate(){
        System.out.println(month + "/" + day + "/" + year);
    }


    public void sleep(){ //Skips to the next day
        if (day == 31){
            if (month == 12){
                year++;
                month = 1;
                day = 1;
            }
            month++;
            day = 1;
        }
    }


    public static void main(String[] args) {
        Date d1 = new Date(02, 25 ,2003);
        Date d2 = new Date(04, 31 ,2003);
        d1.printCurrentDate();
        d1.sleep();
        d1.printCurrentDate();

        d2.sleep();
        d2.printCurrentDate();
    }
}
