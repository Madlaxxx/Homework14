package ru.netolgy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyCalculateServiceTest {

    @Test
    public void ScheduleOrCalc() {
        MoneyCalculateService service = new MoneyCalculateService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(actual, expected);

    }
}
