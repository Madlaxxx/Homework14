package ru.netolgy;

public class StatsService {
    public int summaCalculate;

    public int summaCalculate(int sales[]) {
        int sum = 0;
        for(int i = 0; i < sales.length; i++){
            sum += sales[i];
        }
        return sum;
    }

    public int averageSaleMonth (int sales[]){
        int sum = 0;
        int average = 0;
        for(int i = 0; i < sales.length; i++){
            sum += sales[i];
            average = sum / sales.length;
        }
        return average;
    }

    public int minSales(int sales []) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int sales []) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1;
    }

    public int minAverageSaleMonth (int sales[]){

        int minAverage = 0;
        for(int sale : sales){

        if (sale < averageSaleMonth(sales)) {
                minAverage++;
            }
        }
        return minAverage;
    }
}
