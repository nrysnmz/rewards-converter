public class RewardValue {
    private double conversionRate; // Conversion rate from cash to miles
    private double cashValue; // Store the cash value

    public RewardValue(double conversionRate, double cashValue) {
        this.conversionRate = conversionRate;
        this.cashValue = cashValue;
    }

    public RewardValue(double cashValue) {
    }

    public double getMilesValue() {
        return cashValue * conversionRate;
    }

    public double getCashValue() {
        return cashValue;
    }
}