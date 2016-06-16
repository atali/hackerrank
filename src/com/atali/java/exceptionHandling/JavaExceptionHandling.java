package com.atali.java.exceptionHandling;

import java.util.Scanner;

/**
 * Created by atali on 15/06/2016.
 */
public class JavaExceptionHandling {

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in);

        String i1AsString = scan.nextLine();
        String i2AsString = scan.nextLine();

        try {

            int i1 = Integer.parseInt(i1AsString);
            int i2 = Integer.parseInt(i2AsString);

            if( i2 == 0) {
                System.out.println("java.lang.ArithmeticException: / by zero");
                return;
            }

            System.out.println(i1/i2);


        } catch( Exception e) {
            System.out.println("java.util.InputMismatchException");
        }
    }
}
