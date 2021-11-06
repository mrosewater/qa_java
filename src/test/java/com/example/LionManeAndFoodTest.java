package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionManeAndFoodTest {

    Feline feline = new Feline();
    private String sex;
    private boolean expectedMane;
    public LionManeAndFoodTest(String sex, boolean expectedMane) {
        this.sex = sex;
        this.expectedMane = expectedMane;
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
        Lion lion = new Lion(feline, sex);
        Boolean hasMane = lion.doesHaveMane();
        Assert.assertEquals(expectedMane, hasMane);
    }

}
