package com.atali.tutorials.ThirtyDaysOfCode;

import java.util.Scanner;

/**
 * Created by atali on 28/06/2016.
 */
public class Day16ExceptionsStringToInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {

            int value = Integer.parseInt(S);
            System.out.println(value);
        } catch(Exception e) {
            System.out.println("Bad String");
        }
    }
}
