public class MergeTwoSortedArrayExample {
    public static void main(String[] args) {
        int[] aA = new int[ 4 ];
        aA[0] = 26;
        aA[1] = 37;
        aA[2] = 57;
        aA[3] = 83;

        int[] aB = new int[ 10 ];
        aB[0] = 0;
        aB[1] = 10;
        aB[2] = 20;
        aB[3] = 30;
        aB[4] = 40;
        aB[5] = 50;
        aB[6] = 60;
        aB[7] = 70;
        aB[8] = 80;
        aB[9] = 90;


        int[] aC = mergeTwoSortedArray( aA, aB );

        for ( int i = 0; i < aC.length; i++ ) {
            System.out.println( aC[ i ] );
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
