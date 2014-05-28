package com.hackbulgaria.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problems {

    public static boolean isOdd(int n) {
        return (n % 2 == 0);
        /*
         * if (n % 2 == 0) { return false; } else { return true; }
         */
    }

    public static boolean isPrime(int n) {

        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static int min(int... array) {
        if (array.length == 0) {
            System.out.println("Empty input!");
            return 0;
        }
        
        int min = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] < array[0]) {
                min = array[i];

            }

        }
        return min;
    }

    public static int kthMin(int k, int[] array) {
        Arrays.sort(array);
        return array[k - 1];
    }

    public static int getAverage(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        int count = array.length;

        int average = sum / count;

        return average;

    }

    public static void main(String[] args) {

        isOdd(3);
        isPrime(3);
        min(3, 4);
        int[] bla = { 1, 2, 3, 4, 5 };
        kthMin(3, bla);
        getAverage(bla);
        // System.out.println(getAverage(bla));
        
        System.out.println(min());
    }

}
