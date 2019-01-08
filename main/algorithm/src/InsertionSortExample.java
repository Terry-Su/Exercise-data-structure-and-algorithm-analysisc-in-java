public class InsertionSortExample {
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


        int in;
        int out; // out is marked item

        for (out = 1;
            out < length;
            out++ ) {
            int tmp = arr[ out ]; // removed marked item
            in = out;

            while ( in > 0 &&  arr[ in - 1 ] >= tmp ) {
                arr[ in ] = arr[ in - 1 ];  // shift item right
                in = in - 1;
            }
            arr[ in ] = tmp;
        }

        for ( int i = 0; i < length; i++ ) {
            System.out.println( arr[ i ] );
        }
    }
}
