package com.tuxnet.project_euler;

// https://projecteuler.net/problem=9

/*

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a^2 + b^2 = c^2

For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

 */

public class Problem9 {
    //brute force solution
    //for mathematical solution go here: http://www.mathblog.dk/pythagorean-triplets/

    public static void solve() {
        int a = 0, b = 0, c = 0;
        int s = 1000;
        boolean triplet = false;

        //a<b<s/2 -> OK
        //a<s/3 -> (1<2<3)?
        for (a = 1; a < s / 3; a++) {
            for (b = a; b < s / 2; b++) {
                c = s - b - a;
                if (c * c == a * a + b * b) {
                    triplet = true;
                    break;
                }
            }
            if (triplet) break;
        }
        System.out.println("a = " + a + ";b = " + b + ";c = " + c);
        System.out.println("abc = " + a * b * c);
    }
}
