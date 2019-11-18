package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplicationTest {

    @Test
    public void petsListSizeTest(){
        User testUser = new User(3);

        Integer expected = 3;
        Integer actual = testUser.pets.size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void petsGetNameTest(){
        Dog snoop = new Dog();
        snoop.setName("Snoop");

        String expected = "Snoop";
        String actual = snoop.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petsSpeakTest(){
        Cat burgler = new Cat();

        String expected = "purrr";
        String actual = burgler.speak();

        Assert.assertEquals(expected, actual);
    }
}
