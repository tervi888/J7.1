package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindMonthMin() {
        StatsService service = new StatsService();
        long[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinMonth = 9;
        long actualMinMonth = service.minSales(minMonth);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldFindAmount() {
        StatsService service = new StatsService();
        long[] Amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAmount = 180;
        long actualAmount = service.getAmount(Amount);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldFindAverageAmount() {
        StatsService service = new StatsService();
        long[] AverageAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageAmount = 15;
        long actualAverageAmount = service.getAverageAmount(AverageAmount);

        Assertions.assertEquals(expectedAverageAmount, actualAverageAmount);

    }

    @Test
    public void shouldFindMonthMax() {
        StatsService service = new StatsService();
        int[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(maxMonth);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);

    }
    @Test
    public void shouldBadMonth() {
        StatsService service = new StatsService();
        long[] badMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedBadMonth = 5;
        long actualBadMonth = service.getBadMonth(badMonth);

        Assertions.assertEquals(expectedBadMonth, actualBadMonth);
    }
    @Test
    public void shouldGoodMonth() {
        StatsService service = new StatsService();
        long[] goodMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedGoodMonth = 5;
        long actualGoodMonth = service.getGoodMonth(goodMonth);

        Assertions.assertEquals(expectedGoodMonth, actualGoodMonth);
    }
}
