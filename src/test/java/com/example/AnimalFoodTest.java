package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalFoodTest {

    private String animalKind;
    private List<String> expectedFood;
    public AnimalFoodTest(String animalKind, List<String> expectedFood) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters
    public static Object[][] getAnimalFood() {
        return new Object[][] {
                { "Травоядное", List.of("Трава", "Различные растения")},
                { "Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void shouldGetFood() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals(expectedFood, animal.getFood(animalKind));
    }

}
