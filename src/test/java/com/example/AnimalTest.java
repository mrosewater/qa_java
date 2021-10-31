package com.example;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalTest {

    private String animalKind;
    private List<String> expectedFood;
    public AnimalTest (String animalKind, List<String> expectedFood) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }

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
