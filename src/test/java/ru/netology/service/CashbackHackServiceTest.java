package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        int purchase = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(purchase);
        assertEquals(actual, expected);
    }
    @Test
    public void testLimitValue() {
        int purchase = 1000;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(purchase);
        assertEquals(actual, expected);
    }
    @Test
    public void testOverLimit() {
        int purchase = 1100;
        int expected = 900;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(purchase);
        assertEquals(actual, expected);
    }

}