package com.tuxnet.project_euler;

// https://projecteuler.net/problem=19
    /*

You are given the following information, but you may prefer to do some research for yourself.

    1 Jan 1900 was a Monday.
    Thirty days has September,
    April, June and November.
    All the rest have thirty-one,
    Saving February alone,
    Which has twenty-eight, rain or shine.
    And on leap years, twenty-nine.
    A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

     */

public class Problem19 {
    private static int days = 30;
    private static int sundays = 0;

    public static void solve() {
        int year = 1900;
        int month = 1;
        int day = 1;
        int dc = 0;
        boolean flag = false;

        while (year < 2000) {
            thirty(month, year);

            if (day == days) {
                if (month == 12) {
                    year++;
                    flag = true;
                    month = 0;
                }
                month++;
                day = 0;
            }
            day++;
            dc++;

            switch (dc) {
                case 7:
                    if (day == 1 && flag)
                        sundays++;
                    dc = 0;
                    break;
            }
        }
        System.out.println("During the twentieth century there was " + sundays + " sundays on the first of the month");
    }

    private static void thirty(int month, int year) {
        switch (month) {
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                    days = 29;
                else
                    days = 28;
                break;
            case 4:
                days = 30;
                break;
            case 6:
                days = 30;
                break;
            case 9:
                days = 30;
                break;
            case 11:
                days = 30;
                break;
            default:
                days = 31;
                break;
        }
    }

}
