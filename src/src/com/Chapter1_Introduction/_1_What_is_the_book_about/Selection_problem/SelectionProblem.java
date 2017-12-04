package com.Chapter1_Introduction._1_What_is_the_book_about.Selection_problem;

import com.util.BubbleSort;
import com.util.Util;

import java.util.Arrays;

/**
 * Selection Problem
 * @Description Suppose you have a group of N numbers and would like to determine the kth largest
 */
public class SelectionProblem {
    static int[] numbers = { 3, 2, 1, 5, 10, 9, 7, 8, 4, 6 };
    static int k = 10;

    /**
     * solution 1
     * @description Sort the array in decreasing order by some simple algorithm such as bubblesort,
     * and then return the element in position k.
     * @param numbers
     * @param k
     * @return
     */
    private static int solution1( int[] numbers, int k ) {
        int[] clonedNumbers = numbers.clone();
        int[] decreasedSortedNumbers = Util.bubbleSort( clonedNumbers, BubbleSort.SortType.DECREASE);
        int result = decreasedSortedNumbers[ k - 1 ];
        return result;
    }

    /**
     * solution 2
     * @description
     * read the first k elements into an array and
     * sort them (in decreasing order). Next, each remaining element is read one by one. As a new
     * element arrives, it is ignored if it is smaller than the kth element in the array. Otherwise, it
     * is placed in its correct spot in the array, bumping one element out of the array. When the
     * algorithm ends, the element in the kth position is returned as the answer.
     * @param numbers
     * @param k
     * @return
     */
    private static int solution2( int[] numbers, int k ) {
        int[] clonedNumbers = numbers.clone();
        int[] firstKNumbers = Arrays.copyOfRange( clonedNumbers, 0, k );
        int[] decreasedSortedFirstKNumbers = Util.bubbleSort( firstKNumbers, BubbleSort.SortType.DECREASE);
        int[] remainingNumbers = Arrays.copyOfRange( clonedNumbers, k,  clonedNumbers.length);
        for ( int i = 0; i < remainingNumbers.length; i++ ) {
            for ( int j = 0; j < firstKNumbers.length; j++ ) {
                int numberInRemaining = remainingNumbers[ i ];
                int numberInFirstK = firstKNumbers[ j ];

                if ( numberInRemaining > numberInFirstK ) {
                    int[] left = Arrays.copyOfRange( firstKNumbers, 0, j );
                    int[] center = { numberInRemaining };
                    int[] right = Arrays.copyOfRange( firstKNumbers, j, firstKNumbers.length - 1 );
                    firstKNumbers = Util.combine( left, center );
                    firstKNumbers = Util.combine( firstKNumbers, right );
                    break;
                }
            }
        }

        return firstKNumbers[ firstKNumbers.length - 1 ];
    }

    private static String getCostTimeStr( long time ) {
        double millTime = time / 1;
        // Math.pow( 10, 6 )
        String constTimeStr = String.valueOf( millTime ) + " ms";
        return constTimeStr;
    }
    public static void main(String[] args) {
        Util.log( "A group of numbers: " );
        Util.log( numbers );
        Util.log( "k: " + k );

        // solution 1
        long time1 = System.currentTimeMillis();
        int result1 = solution1( numbers, k );
        long deltaTime1 = System.currentTimeMillis() - time1;
        Util.log( "Solution 1 result: " + result1 );
        Util.log( "Cost time: " + getCostTimeStr( deltaTime1 )  );

        Util.log( "====================================" );

        // solution 2
        long time2 = System.currentTimeMillis();
        int result2 = solution2( numbers, k );
        long deltaTime2 = System.currentTimeMillis() - time2;
        Util.log( "Solution 2 result: " + result2 );
        Util.log( "Cost time: " + getCostTimeStr( deltaTime2 ) );
    }
}
