public class ShellSortExample {
    public static void main(String[] args) {
        int size = 100;
        int[] a = new int[size];
        for ( int i = 0; i < size; i++ ) {
            int number = (int)(Math.random() * 100);
            a[ i ] = number;
        }

        shellSort( a );

        for ( int i = 0; i < a.length; i++ ) {
            System.out.println( a[ i ] );
        }
    }

    public static void shellSort( int[] a ) {
        insertionSortByH( a, 3 );
        insertionSortByH( a, 1 );
    }

    public static void insertionSortByH( int[] a, int h ) {
       int  length = a.length;
        for ( int i = 0; i < h; i++ ) {
           int size =  ( length - i ) / h;
           if ( size > 0 ) {
               // insertion sort
               int in;
               int out; // out is marked item

               for (out = i;
                    out < length;
                    out += h ) {
                   int tmp = a[ out ]; // removed marked item
                   in = out;

                   while ( in > 0 && in - h >= 0 &&  a[ in - h ] >= tmp ) {
                       a[ in ] = a[ in - h ];  // shift item right
                       in = in - h;
                   }
                   a[ in ] = tmp;
               }

           }
       }
    }
}
