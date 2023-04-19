package Labs.Lab3;

public class Date {
    int day;
    int month;
    int year;

    public Date(){
        day = 0;
        month = 0;
        year = 0;
    }

    public Date(int m, int d, int y){
        if (m < 0 || m > 12){
            System.out.println("Please enter a valid month");
        } else if (d < 0 || d > 31){
            System.out.println("Please enter a valid day");
        } else if (y < 0){
            System.out.println("Please enter a valid year");
        } else {
            day = d;
            month = m;
            year = y;
        }
    }

    public Date(Date other){
        day = other.day;
        month = other.month;
        year = other.month;
    }

    public void setDate(int m, int d, int y){
        if(m < 0 || m > 31){
            System.out.println("Please enter a valid month");
        }
        day = d;
        month = m;
        year = y;
    }

    @Override
    public String toString(){
        return month + "/" + day + "/" + year;
    }

    public boolean equals(Date obj) {
        if (this.month == obj.month && this.day == obj.day && this.year == obj.year){
            return true;
        }else {return false;}
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

}