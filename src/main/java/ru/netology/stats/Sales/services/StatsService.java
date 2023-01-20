package ru.netology.stats.Sales.services;


public class StatsService {

    public long sum(long[] sales) {

        long result = 0;
        for (long sale : sales) {
            result += sale;

        }
        return result;
    }

    public long average(long[] sales) {

        return sum(sales) / sales.length;

    }

    public int maximus(long[] sales) {
        int maxMonth = 0;
        long maximumSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSales) {
                maximumSales = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1;

    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int underAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;

    }

    public int upAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }

}
