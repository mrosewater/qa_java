package com.example;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import java.util.List;

@RunWith(Parameterized.class)
public class LionTest {

    private String sex;
    private boolean expectedMane;
    public LionTest (String sex, boolean expectedMane) {
        this.sex = sex;
        this.expectedMane = expectedMane;
    }

    @Test (expected = Exception.class)
    public void shouldThrowException() throws Exception {
        Lion lion = new Lion("");
        Boolean hasMane = lion.doesHaveMane();
    }

    @Parameterized.Parameters
    public static Object[][] getMane() {
        return new Object[][] {
                { "Самка", false},
                { "Самец", true}
        };
    }

    @Test
    public void shouldCheckMane() throws Exception {
        Lion lion = new Lion(sex);
        Boolean hasMane = lion.doesHaveMane();
        Assert.assertEquals(expectedMane, hasMane);
    }

    @Test
    public void shouldGetCarnivoreFood() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

}
