package ru.atom;

import java.util.Arrays;

/**
 * In this assignment you need to implement the following util methods.
 * Note:
 *  throw new UnsupportedOperationException(); - is just a stub
 */
public class Util {



    /**
     * Returns the greatest of {@code int} values.
     *
     * @param values an argument. Assume values.length > 0.
     * @return the largest of values.
     */
    public static int max(int[] values) {
        //throw new UnsupportedOperationException();
        int maxArray;
        if (values.length == 0) {
            return Integer.MIN_VALUE;
        } else {
            Arrays.sort(values);
            maxArray = values[values.length - 1];
            return maxArray;
        }
    }

    /**
     * Returns the sum of all {@code int} values.
     *
     * @param values an argument. Assume values.length > 0.
     * @return the sum of all values.
     */
    public static long sum(int[] values) {
        //throw new UnsupportedOperationException();
        long sumArray = 0;
        for (long i : values)
            sumArray += i;
        return sumArray;
    }


}
