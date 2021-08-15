package com.epam.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void isPositiveNumberShouldReturnTrueIfPositiveDouble() {
        String testNumber = "1.1";
        boolean expected = StringUtils.isPositiveNumber(testNumber);
        Assertions.assertTrue(expected);
    }

    @Test
    public void isPositiveNumberShouldReturnTrueIfPositiveInteger() {
        String testNumber = "1";
        boolean expected = StringUtils.isPositiveNumber(testNumber);
        Assertions.assertTrue(expected);
    }

    @Test
    public void isPositiveNumberShouldReturnFalseIfNegativeDouble() {
        String testNumber = "-1.1";
        boolean expected = StringUtils.isPositiveNumber(testNumber);
        Assertions.assertFalse(expected);
    }

    @Test
    public void isPositiveNumberShouldReturnFalseIfNegativeInteger() {
        String testNumber = "-1";
        boolean expected = StringUtils.isPositiveNumber(testNumber);
        Assertions.assertFalse(expected);
    }

    @Test
    public void isPositiveNumberShouldReturnFalseIfNotNumber() {
        String testNumber = "string";
        boolean expected = StringUtils.isPositiveNumber(testNumber);
        Assertions.assertFalse(expected);
    }

    @Test
    public void isPositiveNumberShouldReturnFalseIfEmptyString() {
        String testNumber = "";
        boolean expected = StringUtils.isPositiveNumber(testNumber);
        Assertions.assertFalse(expected);
    }


    @Test
    public void isPositiveNumberShouldReturnFalseIfZero() {
        String testNumber = "0";
        boolean expected = StringUtils.isPositiveNumber(testNumber);
        Assertions.assertFalse(expected);
    }

    @Test
    public void isPositiveNumberShouldReturnFalseIfMinusZero() {
        String testNumber = "-0";
        boolean expected = StringUtils.isPositiveNumber(testNumber);
        Assertions.assertFalse(expected);
    }

    @Test
    public void isPositiveNumberShouldReturnFalseIfStringAndNumber() {
        String testNumber = "10 str";
        boolean expected = StringUtils.isPositiveNumber(testNumber);
        Assertions.assertFalse(expected);
    }

    @Test
    public void isPositiveNumberShouldReturnFalseIfNull() {
        String testNumber = null;
        boolean expected = StringUtils.isPositiveNumber(testNumber);
        Assertions.assertFalse(expected);
    }

}
