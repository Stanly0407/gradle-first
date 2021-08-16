package com.epam.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"1.1", "1"})
        public void isPositiveNumberShouldReturnTrueIfPositive(String testedInput) {
        boolean expected = StringUtils.isPositiveNumber(testedInput);
        Assertions.assertTrue(expected);
    }

    @ParameterizedTest
    @ValueSource(strings = {"-1.1", "-1"})
    public void isPositiveNumberShouldReturnFalseIfNegative(String testedInput) {
        boolean expected = StringUtils.isPositiveNumber(testedInput);
        Assertions.assertFalse(expected);
    }

    @ParameterizedTest
    @ValueSource(strings = {"string", "", "0", "-0", "10 str"})
    public void isPositiveNumberShouldReturnFalseIfIncorrectInput(String testedInput) {
        boolean expected = StringUtils.isPositiveNumber(testedInput);
        Assertions.assertFalse(expected);
    }

}
