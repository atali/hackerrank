package com.atali.algorithms.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by atali on 25/06/2016.
 */
public class GreedyFlorist {

    public static void main( String args[] ){

// helpers for input/output

        Scanner in = new Scanner(System.in);

        int N, K;
        N = in.nextInt();
        K = in.nextInt();

        Integer C[] = new Integer[N];
        for(int i=0; i<N; i++){
            C[i] = in.nextInt();
        }

        int result = 0;

        Arrays.sort(C, Collections.reverseOrder());
        int currentBuyer = 0;
        for( int i = 0; i < N; i++) {

            int flowerPrice = C[i];

            result += flowerPrice * ( 1 + i/K);
        }


        System.out.println( result );

    }
}
