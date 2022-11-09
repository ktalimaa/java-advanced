package org.sda.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Examples {
    public static void main(String[] args) {
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date);


        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 == s2 is:" + s1 == s2);


        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }




    }


}
