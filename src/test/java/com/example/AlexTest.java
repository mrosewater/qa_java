package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class AlexTest {

    @Test
    public void shouldGetKittens() throws Exception {
        Alex alex = new Alex();
        int kittens = alex.getKittens();
        Assert.assertEquals(0, kittens);
    }

    @Test
    public void shouldGetFriends() throws Exception {
        Alex alex = new Alex();
        Assert.assertEquals(List.of("Марти", "Мелман", "Глория"), alex.getFriends());
    }

    @Test
    public void shouldGetPlaceOfLiving() throws Exception {
        Alex alex = new Alex();
        Assert.assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

}
