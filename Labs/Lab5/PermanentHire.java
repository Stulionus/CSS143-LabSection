package Labs.Lab5;

public class PermanentHire extends SalariedWorker{
    public static final double PERMANENT_MONTHLY = 8000;

    public PermanentHire(String name, int social){
        super(name, social, PERMANENT_MONTHLY);
    }

    public PermanentHire(String name, int social, double monthlyPay) {
        super(name, social, monthlyPay);
    }


    @Override
    public double calculateWeeklyPay() {
        return PERMANENT_MONTHLY/4 + 200;
    }
}
