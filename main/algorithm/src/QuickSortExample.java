public class QuickSortExample {
    public static void main(String[] args) {
        int size = 100;
        int[] a = new int[size];
        for ( int i = 0; i < size; i++ ) {
            int number = (int)(Math.random() * 100);
            a[ i ] = number;
        }
//        a = new int[]{ 9, 10, 7, 8, 1, 6, 4, 2, 3, 5 };

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

        int pivotIndex = partition( a, leftIndex, rightIndex, rightIndex );
        recurQuickSort( a, leftIndex, pivotIndex - 1 );
        recurQuickSort( a,  pivotIndex+1, rightIndex );
    }

    /**
     *
     * @param a
     * @param leftIndex
     * @param rightIndex
     * @param pivotIndex always suppose that  pivot index is the most right index
     * @return
     */
    public static int partition( int[] a, int leftIndex, int rightIndex, int pivotIndex ) {
        int tmpLeftIndex = leftIndex - 1;
        int tmpRightIndex = rightIndex - 1 + 1;
        int pivot = a[ pivotIndex ];

        while( true ) {
            do {
                tmpLeftIndex = tmpLeftIndex + 1;
            } while( tmpLeftIndex < rightIndex && a[ tmpLeftIndex ] <= pivot );


            do {
                tmpRightIndex = tmpRightIndex - 1;
            } while ( tmpRightIndex > 0 && a[ tmpRightIndex ] >= pivot );

            if ( tmpLeftIndex >= tmpRightIndex ) {
                break;
            } else {
                swap( a, tmpLeftIndex, tmpRightIndex );
            }
        }
        swap( a, tmpLeftIndex, pivotIndex );
        return tmpLeftIndex;
    }


    public static void swap( int[] arr, int aIndex, int bIndex  ) {
        int tmp = arr[ aIndex ];
        arr[ aIndex ] = arr[ bIndex ];
        arr[ bIndex ] = tmp;
    }
}
