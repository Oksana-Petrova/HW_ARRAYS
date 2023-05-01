package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    public void shouldFindSumSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumSales = 180;
        int actualSumSales = service.sumSales(sales);

        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    @Test
    public void shouldFindAvgSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAvgSales = 15;
        int actualAvgSales = service.avgSales(sales);

        Assertions.assertEquals(expectedAvgSales, actualAvgSales);
    }

    @Test
    public void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 6;
        int actualMaxMonth = service.maxSalesMonth(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.minSalesMonth(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldFindCountMonthUnderAvg() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCountMonthUnder = 5;
        int actualCountMonthUnder = service.countMonthSalesUnderAvg(sales);

        Assertions.assertEquals(expectedCountMonthUnder, actualCountMonthUnder);
    }

    @Test
    public void shouldFindCountMonthAboveAvg() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCountMonthAbove = 5;
        int actualCountMonthAbove = service.countMonthSalesAboveAvg(sales);

        Assertions.assertEquals(expectedCountMonthAbove, actualCountMonthAbove);
    }
}