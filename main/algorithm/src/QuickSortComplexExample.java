public class QuickSortComplexExample {
    public static void main(String[] args) {
        int size = 100;
        int[] a = new int[size];
        for ( int i = 0; i < size; i++ ) {
            int number = (int)(Math.random() * 100);
            a[ i ] = number;
        }
//        a = new int[]{ 10, 9, 8, 7, 5, 6, 4, 2, 3, 1 };

        quickSort( a );

        for ( int i = 0; i < a.length; i++ ) {
            System.out.println( a[ i ] );
        }
    }

    public static void quickSort(int[] a) {
        recurQuickSort( a, 0, a.length - 1);
    }

    /**
     *
     * @param a main array
     * @param leftIndex sorting array's left border
     * @param rightIndex sorting array's right border
     */
    public static void recurQuickSort( int[] a, int leftIndex, int rightIndex ) {
        if ( leftIndex >= rightIndex ) {
            return;
        }

        // # swap array items
        int pivotIndex = rightIndex;
        int pivot = a[ pivotIndex ];
        int size = rightIndex - leftIndex + 1;
        int[] tmp = new int[ size ];
        int tmpLeftRelativeIndex = 0;
        int tmpRightRelativeIndex = size - 1;
        for ( int i = leftIndex; i < rightIndex; i++ ) {
            if ( a[ i ] < a[pivotIndex]) {
                tmp[ tmpLeftRelativeIndex ] = a[i];
                tmpLeftRelativeIndex = tmpLeftRelativeIndex + 1;
            } else {
                tmp[ tmpRightRelativeIndex ] = a[i];
                tmpRightRelativeIndex = tmpRightRelativeIndex - 1;
            }
        }
        tmp[ tmpLeftRelativeIndex ] = a[pivotIndex];
        pivotIndex = leftIndex + tmpLeftRelativeIndex;

        // set values from array tmp to array a
        for ( int i = 0; i < size; i++ ) {
            a[ leftIndex + i ] = tmp[ i ];
        }

        // # recur left
        recurQuickSort( a, leftIndex, pivotIndex - 1 );

        // # recur right
        recurQuickSort( a, pivotIndex + 1, rightIndex );
    }
}
