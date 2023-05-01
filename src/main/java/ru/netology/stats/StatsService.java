package ru.netology.stats;

public class StatsService {

    //сумма всех продаж
    public int sumSales(int[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }

    //средняя сумма продаж в месяц
    public int avgSales(int[] sales) {
        return sumSales(sales) / sales.length;
    }

    //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    //номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    //количество месяцев, в которых продажи были ниже среднего
    public int countMonthSalesUnderAvg(int[] sales) {
        int countMonthUnder = 0;
        int avgSales = avgSales(sales);
        for (int t : sales) {
            if (t < avgSales) {
                countMonthUnder = countMonthUnder + 1;
            }
        }
        return countMonthUnder;
    }

    //количество месяцев, в которых продажи были выше среднего
    public int countMonthSalesAboveAvg(int[] sales) {
        int countMonthAbove = 0;
        int avgSales = avgSales(sales);
        for (int t : sales) {
            if (t > avgSales) {
                countMonthAbove = countMonthAbove + 1;
            }
        }
        return countMonthAbove;
    }
}
