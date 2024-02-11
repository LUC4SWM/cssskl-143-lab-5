public class Consultant extends HourlyWorker{
    private int CONSULTANT_HOURS = 20;
    public static final double HOURLY_CONSULTANT = 3;
    private Consultant(){}
    public Consultant(String name, int social){
        super(name, social, HOURLY_CONSULTANT);
    }
    public Consultant(String name, int social, int hours){
        super(name, social, HOURLY_CONSULTANT);
        CONSULTANT_HOURS = hours;
    }

    @Override
    public double calculateWeeklyPay() {
        return CONSULTANT_HOURS * HOURLY_CONSULTANT;
    }
}
