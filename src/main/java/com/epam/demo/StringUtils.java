package com.epam.demo;


import org.apache.commons.lang3.math.NumberUtils;

/**
 * A class {@code StringUtils} defines the single method that checks if the entered number is positive.
 *
 * @author Sviatlana Shelestava
 * @since 1.3.5
 */
public class StringUtils {

    /**
     * <p>Checks whether the String a positive number.</p>
     *
     * <p><code>Null</code>, not number and empty String will return
     * <code>false</code>.</p>
     *
     * @param str the <code>String</code> to check
     * @return <code>true</code> if the string is a positive number
     */
    public static boolean isPositiveNumber(String str) {
        double number;
        if (NumberUtils.isNumber(str)) {
            number = NumberUtils.createDouble(str);
        } else {
            return false;
        }
        return number > 0;
    }

}
