package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void shouldGetFamily() {
        Animal animal = new Animal();
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

    @Test (expected = Exception.class)
    public void shouldThrowException() throws Exception {
        Animal animal = new Animal();
        animal.getFood("");
    }

}
