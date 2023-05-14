package Labs.Lab5;

public class Consultant extends HourlyWorker{
    public static final double CONSULTANT_MONTHLY = 8000;

    public static final int HOURS = 20;

    public Consultant(String name, int social){
        super(name, social, CONSULTANT_MONTHLY);
    }

    public Consultant(String name, int social, double monthlyPay) {
        super(name, social, monthlyPay);
    }


    @Override
    public double calculateWeeklyPay() {
        return HOURS * 3;
    }
}
