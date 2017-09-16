package com.tuxnet.project_euler;

// https://projecteuler.net/problem=15

/*

Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
(pic)
How many such routes are there through a 20×20 grid?

 */

public class Problem15 {
    //TODO: do some research about Combinatorics/permutations?
    //nice solution: http://code.jasonbhill.com/python/project-euler-problem-15/
    public static void solve() {
        int grid = 20;
        int rows = grid;
        int columns = grid;
        rows++;
        columns++;
        Integer[][] a = new Integer[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 || j == 0) a[i][j] = 1;
                else a[i][j] = a[i - 1][j] + a[i][j - 1];
            }
        }
        rows--;
        columns--;
        System.out.println(a[rows][columns]);
    }
}
