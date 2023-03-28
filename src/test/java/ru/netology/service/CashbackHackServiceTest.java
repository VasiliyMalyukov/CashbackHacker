package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        int amount = 900;

        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testRemainZero() {
        int amount = 1000;

        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);

    }
}