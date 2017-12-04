package com.util;

public class Util {
    public static int[] combine(int[] a, int[] b){
        int length = a.length + b.length;
        int[] result = new int[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

    public static int[] bubbleSort( int[] numbers, BubbleSort.SortType sortType ) {
        return BubbleSort.sort( numbers, sortType );
    }

    public static void log( String string ) {
        System.out.println( string );
    }

    public static void log( Number number ) {
        System.out.println( number );
    }

    public static void log( int[] numbers ) {
        StringBuffer stringBuffer = new StringBuffer();
        int l = numbers.length;
        for ( int i = 0; i < l; i++ ) {
            int value = numbers[ i ] ;
            stringBuffer.append( value );

            Boolean isNotLastIndex = i != l - 1;
            if ( isNotLastIndex ) {
                stringBuffer.append( ", " );
            }
        }
        String result = stringBuffer.toString();
        System.out.println( result );
    }


}
