package com.atali.algorithms.bitManipulation;

import java.util.Scanner;

/**
 * Created by atali on 27/06/2016.
 */
public class FlippingBits {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        long[] values = new long[t];
        for( int i= 0; i < t; i++) {
            values[i] = scan.nextLong();
        }

        for(int i= 0; i< values.length; i++){
            System.out.println(values[i]^0xffffffffl);
        }
    }
}
