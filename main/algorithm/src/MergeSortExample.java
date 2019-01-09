public class MergeSortExample {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 7, 3, 5, 8, 2, 0, 1, 9 };


        mergeSort(arr);

        for ( int i = 0; i < arr.length; i++ ) {
            System.out.println( arr[ i ] );
        }
    }

    public static void mergeSort( int[] a ) {
        int left = 0;
        int right = a.length - 1;
        recurMergeSort( a, left, right );
    }

    public static void recurMergeSort( int[] a, int left, int right ) {
        if ( left == right ) {
            return;
        } else {
            // Example: 2 / 2 = 1; 3 / 2 = 1;
            int middle = ( left + right ) / 2;
            recurMergeSort( a, left, middle );
            recurMergeSort( a, middle+1, right );
            merge( a, left, middle, right );
        }
    }


    public static void merge( int[] aA, int left, int middle, int right ) {
        int tmpSize = right - left + 1;
        // a temporary array used to re-assign value to aA
        int[] tmp = new int[ tmpSize ];

        int i = 0;
        int indexA = left;
        int indexB = middle + 1;

        while ( indexA <= middle && indexB <= right ) {
            if ( aA[ indexA ] < aA[ indexB] ) {
                tmp[ i ] = aA[ indexA ] ;
                indexA = indexA + 1;
            } else {
                tmp[ i ] = aA[ indexB ];
                indexB = indexB + 1;
            }
            i = i + 1;
        }

        while( indexA <= middle ) {
            tmp[ i ] = aA[ indexA ] ;
            indexA = indexA + 1;
            i = i + 1;
        }

        while( indexB <= right ) {
            tmp[ i ] = aA[ indexB ] ;
            indexB = indexB + 1;
            i = i + 1;
        }

        for( int j = 0; j < tmp.length; j++ ) {
            aA[ left + j ] = tmp[ j ];
        }

    }
}
