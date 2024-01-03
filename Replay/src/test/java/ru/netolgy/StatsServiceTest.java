package ru.netolgy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumSales() {
        StatsService service = new StatsService();

        int sales [] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;

        int actual = service.summaCalculate(sales);

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public  void shouldAverageSaleMonth(){
        StatsService service = new StatsService();

        int sales [] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;

        int actual = service.averageSaleMonth(sales);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public  void shouldMinSale(){
        StatsService service = new StatsService();

        int sales [] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;

        int actual = service.minSales(sales);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public  void shouldMaxSale(){
        StatsService service = new StatsService();

        int sales [] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;

        int actual = service.maxSales(sales);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public  void shouldMinAverageSaleMonth(){
        StatsService service = new StatsService();

        int sales [] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;

        int actual = service.minAverageSaleMonth(sales);

        Assertions.assertEquals(actual, expected);
    }

}
