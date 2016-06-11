package com.atali.algorithms.gametheory;

import java.util.Scanner;

/**
 * Created by atali on 11/06/2016.
 */

public class IceCreamParlor {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int [] flavors = new int[n];
            for( int i = 0; i < n; i++) {
                flavors[i] = in.nextInt();
            }


            int[] res = new int[2];

            for( int i = 0; i < n; i++) {
                for( int j = i+1; j < n; j++) {

                    if( (flavors[i] + flavors[j]) == m) {
                        res[0] = i +1;
                        res[1] = j +1;
                        break;
                    }
                }
            }

            System.out.println(res[0] +" " + res[1]);
        }
    }
}