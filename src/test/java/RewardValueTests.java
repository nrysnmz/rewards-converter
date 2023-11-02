import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }



    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        double expectedMilesValue = 28571.0;
        double actualMilesValue = rewardValue.getMilesValue();

        // Define a tolerance (e.g., 0.9) to allow for small differences
        double tolerance = 0.9;

        assertAll("Miles conversion",
                () -> assertEquals(expectedMilesValue, actualMilesValue, tolerance),
                () -> assertTrue(Math.abs(expectedMilesValue - actualMilesValue) < tolerance)
        );
    }



    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue, true); // Assuming the second constructor is used to create from miles
        double expectedCashValue = milesValue * 0.0035; // Assuming 1 mile = $0.0035
        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}