public class MegeSortExample {
    public static void main(String[] args) {
        int length = 10;
        int[] arr = new int[ length ];
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 8;
        arr[3] = 2;
        arr[4] = 4;
        arr[5] = 0;
        arr[6] = 7;
        arr[7] = 6;
        arr[8] = 9;
        arr[9] = 1;


        mergeSort(arr);

        for ( int i = 0; i < length; i++ ) {
            System.out.println( arr[ i ] );
        }
    }

    public static void mergeSort( int[] a ) {

    }

    /**
     * Recur to merge
     */
    public static int[] recurMerge(  ) {
        return new int[];
    }

    public static int[] mergeTwoSortedArray( int[] aA, int[] aB ) {
        int sizeA = aA.length;
        int sizeB = aB.length;
        int sizeC = sizeA + sizeB;
        int[] aC = new int[ sizeC ];

        int indexA = 0;
        int indexB = 0;
        int indexC = 0;

        while( indexA < sizeA && indexB < sizeB ) {
            if ( aA[ indexA ] < aB[ indexB ] ) {
                aC[ indexC ] = aA[ indexA ];
                indexA = indexA + 1;
            } else {
                aC[ indexC ] = aB[ indexB ];
                indexB = indexB + 1;
            }
            indexC = indexC + 1;
        }

        while( indexA < sizeA ) {
            aC[ indexC ] = aA[ indexA ];
            indexA = indexA + 1;
            indexC = indexC + 1;
        }

        while( indexB < sizeB ) {
            aC[ indexC ] = aB[ indexB ];
            indexB = indexB + 1;
            indexC = indexC + 1;
        }

        return aC;
    }
}
