public class RewardValue {
    private double conversionRate; // Conversion rate from cash to miles
    private double cashValue; // Store the cash value
    private double milesValue; // Store the miles value

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.conversionRate = 1 / 0.0035; // Conversion rate from cash to miles
        this.milesValue = cashValue * conversionRate;
    }

    // Constructor that accepts miles value
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.conversionRate = 0.0035; // Conversion rate from miles to cash
        if (isMiles) {
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




