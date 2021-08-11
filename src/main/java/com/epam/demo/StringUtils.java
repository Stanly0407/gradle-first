package com.epam.demo;


import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        double number;
        if (NumberUtils.isNumber(str)) {
            number = NumberUtils.createDouble(str);
        } else {
            return false;
        }
        return number >= 0;
    }

}
