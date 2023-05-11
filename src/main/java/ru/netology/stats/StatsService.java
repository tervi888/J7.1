package ru.netology.stats;
public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1

    }
    public long getAmount(long[] sales) {
        long Amount = 0;
        for (long value : sales) {
            Amount += value;
        }
    return Amount;
    }

    public long getAverageAmount(long[] sales) {
        if (sales.length > 0) {

            return getAmount(sales) / sales.length;
        }
        return 0;
    }
    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;

    }
    public int getBadMonth(long[] sales) {
        int badMonth = 0;
        long Average = getAverageAmount(sales);

        for (long value : sales) {
            if (value < Average) {
                badMonth++;
            }
        }
            return badMonth;
    }
    public int getGoodMonth(long[] sales) {
        int goodMonth = 0;
        long Average = getAverageAmount(sales);
        for (long value : sales) {
            if (value < Average) {
                goodMonth++;
            }
        }
        return goodMonth;
    }
}