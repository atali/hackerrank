package com.atali.tutorials.ThirtyDaysOfCode;

import java.util.Scanner;

/**
 * Created by atali on 15/06/2016.
 */
public class Day6LetsReview {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int t = Integer.parseInt(scan.nextLine());
        for( int i = 0; i < t; i++) {
            String word = scan.nextLine();

            StringBuffer even = new StringBuffer();
            StringBuffer odd = new StringBuffer();

            for( int j= 0; j < word.length(); j++) {
                if( j%2 == 0) {
                    even.append(word.charAt(j));
                } else {
                    odd.append(word.charAt(j));
                }
            }

            System.out.println(even.toString() + " " + odd.toString());
        }
    }
}
