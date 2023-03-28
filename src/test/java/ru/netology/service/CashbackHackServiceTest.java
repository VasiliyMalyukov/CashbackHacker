package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        int amount = 900;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);

    }

    @Test
    public void testRemainZero() {
        int amount = 1000;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }
}