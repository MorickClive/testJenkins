package com.qa;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

// This junit will test the 'com.qa.Cat' Class, this is for an example code coverage used with Sonarqube
public class CatTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void catGetDescription() {
        String expectedResult = "My name is Boris, I'm a 15 year old cat and my fur is best described as: Patchy, Black & White";
        boolean flag;

        Cat cat1 =  new Cat("Boris", 15, "Patchy, Black & White");
        flag = cat1.getDescription().equals(expectedResult);

        assertTrue(flag);
    }
}
