public class BubbleSortExample {
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


        for ( int i = 0; i < length - 1; i++ ) {
            for ( int j = i; j < length - 1; j++ ) {
                if ( arr[ i ] > arr[ j + 1 ] ) {
                    int tmp = arr[ i ];
                    arr[ i ] = arr[ j + 1 ];
                    arr[ j + 1 ] = tmp;
                }
            }
        }

        for ( int i = 0; i < length; i++ ) {
            System.out.println( arr[ i ] );
        }
    }
}
