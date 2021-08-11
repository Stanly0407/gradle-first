package com.epam.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void isPositiveNumberShouldReturnTrue() {
        String testNumber = "1.1";
        boolean expected = StringUtils.isPositiveNumber(testNumber);
        Assertions.assertTrue(expected);
    }

}
