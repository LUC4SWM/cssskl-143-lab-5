public class PermanentHire extends SalariedWorker{
    public static final double BASE_MONTHLY = 4000;
    public double MONTHLY_BONUS;
    private PermanentHire(){}
    public PermanentHire(String name, int social){
        super(name, social, BASE_MONTHLY);
    }
    public PermanentHire(String name, int social, double MONTHLY_BONUS){
        super(name, social, BASE_MONTHLY);
        this.MONTHLY_BONUS = MONTHLY_BONUS;
    }

    @Override
    public double calculateWeeklyPay() {
        return (BASE_MONTHLY + MONTHLY_BONUS) / 4;
    }
}
