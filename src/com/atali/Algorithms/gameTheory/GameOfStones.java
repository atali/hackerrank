package com.atali.algorithms.gametheory;

import java.util.Scanner;

public class GameOfStones {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] moves = {2,3,5};
            int currentMove = n;

            int currentPlayer = 0;

            do {

                if( currentMove < 2) {
                    currentPlayer++;
                    break;
                }

                boolean hasMoved = false;
                for( int index = 0; index < moves.length; index++) {
                    if( currentMove - moves[index] >= 0 ) {
                        currentMove -= moves[index];
                        hasMoved = true;
                        break;
                    }
                }

                if( hasMoved) {
                    currentPlayer++;
                }

            } while( true);

            System.out.println(currentPlayer%2 == 0 ? "First":"Second");
        }
    }
}
