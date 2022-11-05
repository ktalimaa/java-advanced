package org.sda.generics;

import java.util.concurrent.ThreadLocalRandom;

public class Playtech {
    public static void main(String[] args) {

        double a = ThreadLocalRandom.current().doubles(2022).average().getAsDouble();
        double b = ThreadLocalRandom.current().doubles(2022).average().getAsDouble();
        a = Math.rint(a * 100) / 100;
        b = Math.rint(b * 100) / 100;
        System.out.println((a - b) / (a - b));


    }
}
