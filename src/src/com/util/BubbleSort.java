package com.util;
import com.util.Util;
public class BubbleSort {
    public enum SortType {
        INCREASE,
        DECREASE,
    }
    public static int[] sort( int[] numbers, SortType sortType ) {
        int l = numbers.length;
        for ( int i = 0; i < l; i++ ) {
            for ( int j = 0; j < l - i - 1; j++ ) {
                int first = numbers[ j ];
                int second = numbers [ j + 1 ];

                Boolean shouldSwitch = sortType == SortType.INCREASE ? first > second : first < second;

                if ( shouldSwitch ) {
                    // switch
                    int cache = first;
                    // & - assign first second
                    numbers[ j ] = second;
                    // & - assign second cache(first)
                    numbers [ j + 1 ] = cache;
                }
            }
        }
        return numbers;
    }
    public static void main(String[] args) {
        int[] testNumbers = {1, 3, 5, 2, 4, 6, 10, 8, 9, 2, 7} ;
        int[] sortedNumbers = sort(testNumbers, SortType.INCREASE) ;

        Util.log( sortedNumbers );
    }
}
