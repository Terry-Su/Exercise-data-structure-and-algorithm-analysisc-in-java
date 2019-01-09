public class MergeSortComplexExample {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 7, 3, 5, 8, 2, 0, 1, 9 };


        int[] sorted = mergeSort(arr);

        for ( int i = 0; i < sorted.length; i++ ) {
            System.out.println( sorted[ i ] );
        }
    }

    public static int[] mergeSort( int[] a ) {
        return recurMerge( a );
    }

    /**
     * Recur to merge one array's inner array
     */
    public static int[] recurMerge( int[] a ) {
        int size = a.length;
        if ( size < 2 ) {
            return a;
        } else {
            if ( size % 2 == 0 ) {
                // # even
                if ( size == 2 ) {
                    if ( a[0] < a[1] ) {
                        int res[] = {a[0], a[1]};
                        return res;
                    } else {
                        int res[] = {a[1], a[0]};
                        return res;
                    }
                } else {
                    int interval = size / 2;
                    int[] left = new int[ interval ];
                    int[] right = new int[ interval ];
                    for ( int i = 0; i < interval; i++ ) {
                        left[ i ] = a[ i ];
                        right[ i ] = a[ interval + i ];
                    }
                    left = recurMerge( left );
                    right = recurMerge( right );
                    int[] res = mergeTwoSortedArray( left, right );
                    return res;
                }

            } else {
                // # odd
                int interval = (size - 1 ) / 2;
                int[] left = new int[ interval ];
                int center[] = { a[ interval ] };
                int[] right = new int[ interval ];
                for ( int i = 0; i < interval; i++ ) {
                    left[ i ] = a[ i ];
                    right[ i ] = a[ interval + 1 + i ];
                }
                left = recurMerge( left );
                right = recurMerge( right );
                int[] res = mergeTwoSortedArray( left, center );
                res = mergeTwoSortedArray( res, right );
                return res;
            }
        }

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
