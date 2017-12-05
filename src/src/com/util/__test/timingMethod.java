package com.util.__test;

import com.util.BubbleSort;
import com.util.Util;

public class timingMethod {
    static void methodExample( int[] numbers ) {
        int[] bubbleSortedNumbers = Util.bubbleSort( numbers, BubbleSort.SortType.INCREASE);
        Util.log( bubbleSortedNumbers );
    }
    public static void main(String[] args) {
        long time1Start = System.nanoTime();;
        int[] numbers1 = { 1123123123, 12321, 34543, 345345, 123812321, 123123, 123123, 345345, 345345, 345345, 345435 };
        methodExample( numbers1 );
        long time1End = System.nanoTime();
        long deltaTime1 = time1End - time1Start;
        Util.log( deltaTime1 );

        long time2Start = System.nanoTime();
        int[] numbers2 = { 1123123123, 12321, 34543, 345345, 123812321, 123123, 123123, 345345, 345345, 345345, 345435, 1123123123, 12321, 34543, 345345, 123812321, 123123, 123123, 345345, 345345, 345345, 345435, 1123123123, 12321, 34543, 345345, 123812321, 123123, 123123, 345345, 345345, 345345, 345435, 1123123123, 12321, 34543, 345345, 123812321, 123123, 123123, 345345, 345345, 345345, 345435, 1123123123, 12321, 34543, 345345, 123812321, 123123, 123123, 345345, 345345, 345345, 345435 };
        int[] tmp = {};
        methodExample( tmp );
        methodExample( numbers1 );
        methodExample( tmp );
        long time2End = System.nanoTime();
        long deltaTime2 = time1End - time1Start;
        Util.log( deltaTime2 );
    }
}
