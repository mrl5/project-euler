package com.tuxnet.project_euler;

// https://projecteuler.net/problem=10

/*

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.

 */

import java.util.ArrayList;
import java.util.List;

public class Problem10 {
    // TODO: solve Riemann hypothesis (#GoodJokeIsNotBad)

    public static void solve() {
        double result = 0;
        int range = 2 * (int) Math.pow(10.0, 6.0);
        List<Integer> primes = findPrimes(range);

        for (int prime : primes) {
            result += prime;
        }
        System.out.println(primes);
        System.out.println(result);
    }

    private static List<Integer> findPrimes(int range) {
        List<Integer> primes = new ArrayList<>();
        boolean flag = false; //prime flag

        //2 is first prime
        primes.add(2);

        for (int i = 3; i < range; i++) {
            //start from 3
            flag = true;
            for (int j = 3; j < i; j++) {
                if (i % 2 == 0 || i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) primes.add(i);
        }
        return primes;
    }
}
