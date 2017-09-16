package com.tuxnet.project_euler;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private List<Integer> fibonacci = new ArrayList<>();

    public List<Integer> getFromRange(int range) {
        fibonacci.clear();
        //https://en.wikipedia.org/wiki/Fibonacci_number
        fibonacci.add(0);
        fibonacci.add(1);

        while (fibonacci.get(fibonacci.size() - 1) < range) {
            fibonacci.add(
                    fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2)
            );
        }

        if (fibonacci.get(fibonacci.size() - 1) > range) fibonacci.remove(fibonacci.size() - 1);
        //System.out.println(fibonacci);
        return fibonacci;
    }

    //Fibonacci sequence ending with term which contains specified number of digits (eg. 1000)
    public List<Integer> maxDigits(int digits) {
        fibonacci.clear();
        //https://en.wikipedia.org/wiki/Fibonacci_number
        fibonacci.add(0);
        fibonacci.add(1);

        while ((fibonacci.get(fibonacci.size() - 1) / digits) < 1) {
            fibonacci.add(
                    fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2)
            );
        }
        //System.out.println(fibonacci);
        return fibonacci;
    }
}
