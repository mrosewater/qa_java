package com.example;

import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import org.junit.Test;

@RunWith(MockitoJUnitRunner.class)
public class LionKittensTest {

    @Mock
    Feline feline;

    @Test
    public void shouldGetKittens() {
        Lion lion = new Lion(feline);
        Mockito.when(lion.getKittens()).thenReturn(1);
        int kittens = lion.getKittens();
        Assert.assertEquals(1, kittens);
    }

}
