package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackTest {
    @Test
    public void shouldCountHowMuchToAddIfLess() {
        Cashback service = new Cashback();
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldCountHowMuchAddIfMore() {
        Cashback service = new Cashback();
        int actual = service.remain(1500);
        int expected = 500;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldCountHowMuchAddIfEqual() {
        Cashback service = new Cashback();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldCountHowMuchAddIfZero() {
        Cashback service = new Cashback();
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }
}
