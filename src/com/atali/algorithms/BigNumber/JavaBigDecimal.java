package com.atali.algorithms.BigNumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by atali on 11/06/2016.
 */

public class JavaBigDecimal {

    public static void main(String[] args) {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s= new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }

        //Write your code here
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal o1b = new BigDecimal(o1);
                BigDecimal o2b = new BigDecimal(o2);

                return  -1*o1b.compareTo( o2b);
            }
        });


        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}