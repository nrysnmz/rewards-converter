public class RewardValue {
    private double cashValue;                              //Store the cash value.
    private double milesValue;                             //Store the miles value.
    private final double conversionRate = 0.0035;        //Conversion rate from cash to miles.

    //This constructor accepts cash value.
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * 1/ conversionRate;

    }

    //This constructor accepts miles value.
    public RewardValue(double milesValue, boolean isMiles) {

        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * conversionRate;
        }

    }

    public double getMilesValue() {
        return milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

}
