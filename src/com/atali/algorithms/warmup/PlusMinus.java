package com.atali.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by atali on 16/06/2016.
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        float nbPositive = 0f;
        float nbNegative = 0f;
        float nbZero = 0f;

        for( int i = 0; i < n; i++) {

            if( arr[i] > 0) {
                nbPositive++;
            } else if( arr[i] < 0) {
                nbNegative++;
            } else {
                nbZero++;
            }
        }

        System.out.println(nbPositive/n);
        System.out.println(nbNegative/n);
        System.out.println(nbZero/n);
    }
}
